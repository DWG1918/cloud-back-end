package com.example.cloudcomputing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductHistorySale {
    private Integer productid;
    private String productname;
    private String category;
    private Integer s_num;
    private double price;
}
