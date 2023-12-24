package com.example.cloudcomputing.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "product")
public class Product {
    @TableId(type = IdType.AUTO)
    private Integer productid;
    private String productname;
    private String category;
    private  double price;
}
