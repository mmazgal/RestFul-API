package com.example.AyrotekQuiz.response;


import com.example.AyrotekQuiz.model.Product;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class ProductResponseConverter {

    public ProductResponse from(Product product){

        return ProductResponse.builder()
                .productName(product.getProductName())
                .brand(product.getBrand())
                .price(product.getPrice())
                .unitsInStock(product.getUnitsInStock())
                .build();
    }

}
