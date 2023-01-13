package com.ingeniasoft.productmicroservice.controller;

import com.ingeniasoft.productmicroservice.entity.ProductEntity;
import com.ingeniasoft.productmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/api/products")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();

    }
    @PostMapping("/api/products")
    @ResponseStatus(HttpStatus.OK)
    public void createProduct(@RequestBody ProductEntity productEntity){

        productRepository.save(productEntity);
    }

    @DeleteMapping("/api/products/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteProduct(@PathVariable String id){
        productRepository.deleteById(id);
    }

    @PutMapping("/api/products/update")
    @ResponseStatus(HttpStatus.OK)
    public void updateProduct(@RequestBody ProductEntity productEntity){
       productRepository.save(productEntity);
    }



}
