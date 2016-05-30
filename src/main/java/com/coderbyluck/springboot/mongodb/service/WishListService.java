package com.coderbyluck.springboot.mongodb.service;

import com.coderbyluck.springboot.mongodb.domain.Product;
import com.coderbyluck.springboot.mongodb.domain.ProductDetailsResponse;
import com.coderbyluck.springboot.mongodb.exception.AppBaseException;

/**
 * Created by IntelliJ IDEA.
 * User: coderbyluck
 * Date: 5/29/16
 * Time: 8:52 PM
 * File Description:
 */
public interface WishListService {

    ProductDetailsResponse getAllProducts() throws AppBaseException;
    Product getProductById(int id);

}
