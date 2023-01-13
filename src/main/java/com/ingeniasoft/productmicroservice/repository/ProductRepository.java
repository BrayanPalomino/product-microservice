package com.ingeniasoft.productmicroservice.repository;

import com.ingeniasoft.productmicroservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}
