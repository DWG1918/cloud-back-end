package com.example.cloudcomputing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cloudcomputing.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper extends BaseMapper<Product> {
    @Select("SELECT productid,productname,category,price FROM product")
    public List<Product> getALLProduct();

    @Select("SELECT category FROM product")
    public List<String> getAllCategory();

    @Select("SELECT productid,productname,category,price FROM product WHERE category=#{category}")
    public List<Product> getProductByCategory(@Param("category") String category);
}
