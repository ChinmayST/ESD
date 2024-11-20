package com.chinmay.esd_yummyapp.mapper;

import com.chinmay.esd_yummyapp.dto.ProductRequest;
import com.chinmay.esd_yummyapp.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {
    public Product toProduct (ProductRequest request) {
        return Product.builder()
                .name(request.name())
                .price(request.price())
                .build();
    }
}
