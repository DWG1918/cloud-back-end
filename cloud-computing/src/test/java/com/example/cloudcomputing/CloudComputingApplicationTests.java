package com.example.cloudcomputing;

import com.example.cloudcomputing.dto.MonthSales;
import com.example.cloudcomputing.dto.ProductHistorySale;
import com.example.cloudcomputing.mapper.OrderMapper;
import com.example.cloudcomputing.mapper.ProductMapper;
import com.example.cloudcomputing.mapper.UserMapper;
import com.example.cloudcomputing.pojo.Order;
import com.example.cloudcomputing.pojo.Product;
import com.example.cloudcomputing.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootTest
class CloudComputingApplicationTests {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	UserMapper userMapper;

	@Autowired
	ProductMapper productMapper;

	@Autowired
	OrderMapper orderMapper;

	@Test
	void contextLoads() {
//		String sql="select * from `user`";
//		List<Map<String,Object>> userList=jdbcTemplate.queryForList(sql);
//		System.out.println(userList);
//		List<User> userList=userMapper.selectAllUser();
//		System.out.println(userList);

//		List<Product> productList=  productMapper.getALLProduct();
//		System.out.println(productList);

//		List<Order> orderList=orderMapper.getProductOrder(1);
//		System.out.println(orderList);

//		List<ProductHistorySale> productHistorySales=orderMapper.getProductHistorySaleByMonth(12);
//		System.out.println(productHistorySales);

		List<MonthSales> monthSales=orderMapper.getMonthSales();
		System.out.println(monthSales);
	}

}
