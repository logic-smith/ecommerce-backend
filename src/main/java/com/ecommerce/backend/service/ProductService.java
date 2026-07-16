package com.ecommerce.backend.service;

import com.ecommerce.backend.model.Product;
import com.ecommerce.backend.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    //1. Creating new product
    public Product createProduct(Product product) {
        //Ensure price isn't negative
        if(product.getPrice() == null || product.getPrice().compareTo(java.math.BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Price cannot be negative or null.");
        }
        return productRepository.save(product);
    }

    //2. Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    //3. Get a single product by ID
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found with id: "+id+"."));
    }
}
