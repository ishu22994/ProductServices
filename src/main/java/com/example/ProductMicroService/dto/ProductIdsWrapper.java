package com.example.ProductMicroService.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductIdsWrapper {
    List<String> productIds;
}
