package com.coderbyluck.springboot.mongodb.dao;

import com.coderbyluck.springboot.mongodb.domain.Product;
import com.coderbyluck.springboot.mongodb.exception.AppBaseException;
import com.coderbyluck.springboot.mongodb.exception.DataLayerException;

import javax.xml.crypto.Data;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: coderbyluck
 * Date: 5/30/16
 * Time: 7:58 AM
 * File Description:
 */
public interface ProductDao {

    List<Product> getAllProducts() throws AppBaseException;
    Product getProduct();
}
