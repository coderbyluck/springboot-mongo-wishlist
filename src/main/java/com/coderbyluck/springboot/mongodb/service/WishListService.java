package com.coderbyluck.springboot.mongodb.service;

import com.coderbyluck.springboot.mongodb.domain.Product;
import com.coderbyluck.springboot.mongodb.domain.ProductDetailsResponse;
import com.coderbyluck.springboot.mongodb.exception.AppBaseException;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: coderbyluck
 * Date: 5/29/16
 * Time: 8:52 PM
 * File Description:
 */
public interface WishListService {

    ProductDetailsResponse getAllProducts() throws AppBaseException;
    ProductDetailsResponse getProductById(int id) throws AppBaseException;

}
