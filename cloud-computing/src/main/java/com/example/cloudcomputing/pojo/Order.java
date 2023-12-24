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
@TableName(value = "order")
public class Order {
    @TableId(type = IdType.AUTO)
    private Integer orderid;
    private Integer productid;
    private Integer userid;
    private Integer num;
    private double cost;
    private Integer year;
    private Integer month;
    private Integer day;
}
