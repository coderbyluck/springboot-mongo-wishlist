package com.coderbyluck.springboot.mongodb.dao;

import com.coderbyluck.springboot.mongodb.domain.Product;
import com.coderbyluck.springboot.mongodb.exception.AppBaseException;
import com.coderbyluck.springboot.mongodb.exception.DataLayerException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: coderbyluck
 * Date: 5/30/16
 * Time: 10:42 AM
 * File Description:
 */
@Component
public class ProductDaoImpl implements ProductDao {
    @Override
    public List<Product> getAllProducts() throws AppBaseException {
        List<Product> productList= new ArrayList<Product>();

        Product product = new Product();
        product.setId(9);
        product.setName("Test Product");
        product.setAverageRating(4.5d);
        product.setDescription("Test Description");
        product.setSeller("Amazon");
        product.setLink("No Link");

        productList.add(product);
        return productList;
    }

    @Override
    public Product getProduct()  {
        throw new DataLayerException("No Data Found");
    }
}
