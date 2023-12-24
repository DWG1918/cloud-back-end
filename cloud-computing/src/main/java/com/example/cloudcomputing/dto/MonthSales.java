package com.example.cloudcomputing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonthSales {
    private Integer month;
    private double s_cost;
}
