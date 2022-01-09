package com.example.myeasydemo.dao;

import com.example.myeasydemo.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {
    //增
    public int addProduct(Product product);
    //删
    public int delProduct(Integer id);
    //改
    public int updateProduct(Product product);
    //查所有
    public List<Product> getAllProduct();
    //
    public Product getProductById(Integer id);
}
