package com.brighterapi.productservice.controller;

import com.brighterapi.presentation.product.management.rest.api.ProductsApi;
import com.brighterapi.presentation.product.management.rest.api.model.ProductDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ProductController implements ProductsApi {


    @Override
    public ResponseEntity<ProductDetail> createProduct(ProductDetail productDetail) {
        return ResponseEntity.ok(buildProduct());
    }

    @Override
    public ResponseEntity<ProductDetail> getProductById(String productId) {
        return ResponseEntity.ok(buildProduct());
    }

    private ProductDetail buildProduct() {
        return ProductDetail.builder()
                .name("Mobile")
                .category("Electronics")
                .price(new BigDecimal(222222))
                .description("iPhone")
                .build();
    }
}
