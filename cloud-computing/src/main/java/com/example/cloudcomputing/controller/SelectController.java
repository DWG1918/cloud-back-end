package com.example.cloudcomputing.controller;

import com.example.cloudcomputing.common.Result;
import com.example.cloudcomputing.dto.MonthSales;
import com.example.cloudcomputing.dto.ProductHistorySale;
import com.example.cloudcomputing.mapper.OrderMapper;
import com.example.cloudcomputing.mapper.ProductMapper;
import com.example.cloudcomputing.pojo.Order;
import com.example.cloudcomputing.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("Select")
public class SelectController {
    @Autowired
    ProductMapper productMapper;

    @Autowired
    OrderMapper orderMapper;

    @GetMapping("test")
    public String test(){
        return "hello world";
    }

    @GetMapping("getAllProduct")
    public Result<List<Product>> getALLProduct(){
        List<Product> productList = productMapper.getALLProduct();
        if(productList.isEmpty())
            return Result.fail("查询失败");
        else
            return Result.success(productList,"查询成功");
    }

    @GetMapping("getProductOrder")
    public Result<List<Order>> getProductOrder(@RequestParam Integer productid){
        List<Order> orderList=orderMapper.getProductOrder(productid);
        if(orderList.isEmpty())
            return Result.fail("该产品没有订单");
        else
            return Result.success(orderList,"查询成功");
    }

    @GetMapping("getAllCategory")
    public Result<HashSet<String>> getAllCategory(){
        List<String> categoryList= productMapper.getAllCategory();
        HashSet<String> categorySet= new HashSet<>(categoryList);
        return Result.success(categorySet,"成功获取所有商品类别");
    }

    @GetMapping("getProductByCategory")
    public Result<List<Product>> getProductByCategory(@RequestParam String category){
        List<Product> productList=productMapper.getProductByCategory(category);
        if(productList.isEmpty())
            return Result.fail("没有该类别的产品");
        else
            return Result.success(productList,"成功获取该类别的产品");
    }

    @GetMapping("getProductHistorySale")
    public Result<List<ProductHistorySale>> getProductHistorySale(){
        List<ProductHistorySale> productHistorySales=orderMapper.getProductHistorySale();

        return Result.success(productHistorySales,"成功查询产品历史销量");
    }

    @GetMapping("getProductHistorySaleByMonth")
    public Result<List<ProductHistorySale>> getProductHistorySaleByMonth(@RequestParam Integer month){
        List<ProductHistorySale> productHistorySales=orderMapper.getProductHistorySaleByMonth(month);

        return Result.success(productHistorySales,"成功查询产品历史销量");
    }

    @GetMapping("getMonthSales")
    public Result<List<MonthSales>> getMonthSales(){
        List<MonthSales> monthSalesList=orderMapper.getMonthSales();

        return Result.success(monthSalesList,"成功获取各个月份的销售金额");
    }
}
