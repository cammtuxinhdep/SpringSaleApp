/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vmct.repositories;

import com.vmct.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public interface ProductRepository {
    List<Product> getProducts(Map<String, String> params);
    Product getProductById(int id);
    void addOrUpdateProduct(Product p);
    void deleteProduct(int id);
}
