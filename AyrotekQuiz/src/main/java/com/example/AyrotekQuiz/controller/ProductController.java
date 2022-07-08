package com.example.AyrotekQuiz.controller;

import com.example.AyrotekQuiz.business.abstracts.ProductService;
import com.example.AyrotekQuiz.request.ProductRequest;
import com.example.AyrotekQuiz.response.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<ProductResponse> getAllProduct(){
        return productService.getAllProducts();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse addProduct(@RequestBody ProductRequest productRequest){
        return productService.addProduct(productRequest);
    }

    @PutMapping("/{id}")
    public ProductResponse updateProduct(@PathVariable Long id, @RequestBody ProductRequest productRequest){
        return productService.updateProduct(id,productRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }


}