package com.example.cloudcomputing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cloudcomputing.dto.MonthSales;
import com.example.cloudcomputing.dto.ProductHistorySale;
import com.example.cloudcomputing.pojo.Order;
import com.example.cloudcomputing.pojo.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    @Select("SELECT orderid,productid,userid,num,cost,`year`,`month`,`day` FROM `order` WHERE productid=#{productid}")
    public List<Order> getProductOrder(@Param("productid") Integer productid);


    @Select("SELECT sum(num) s_num,productname,category,price,o.productid " +
            "FROM product p,`order` o " +
            "WHERE  p.productid=o.productid " +
            "group by o.productid,productname,category,price " +
            "order by s_num " +
            "desc")
    @Results({
            @Result(column = "s_num",property = "s_num"),
            @Result(column = "o.productid",property = "productid")
    })
    public List<ProductHistorySale> getProductHistorySale();

    @Select("SELECT sum(num) s_num,productname,category,price,o.productid " +
            "FROM product p,`order` o " +
            "WHERE  p.productid=o.productid and month=#{month} " +
            "group by o.productid,productname,category,price " +
            "order by s_num " +
            "desc")
    @Results({
            @Result(column = "s_num",property = "s_num"),
            @Result(column = "o.productid",property = "productid")
    })
    public List<ProductHistorySale> getProductHistorySaleByMonth(@Param("month") Integer month);

    @Select("SELECT sum(cost) s_cost,month " +
            "from `order` " +
            "group by month " +
            "order by month")
    @Results({
            @Result(column = "s_cost",property = "s_cost")
    })
    public List<MonthSales> getMonthSales();
}
