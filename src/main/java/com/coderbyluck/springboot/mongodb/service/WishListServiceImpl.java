package com.coderbyluck.springboot.mongodb.service;

import com.coderbyluck.springboot.mongodb.dao.ProductDao;
import com.coderbyluck.springboot.mongodb.domain.Product;
import com.coderbyluck.springboot.mongodb.domain.ProductDetailsResponse;
import com.coderbyluck.springboot.mongodb.exception.AppBaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: coderbyluck
 * Date: 5/29/16
 * Time: 8:52 PM
 * File Description:
 */

@RestController
public class WishListServiceImpl implements WishListService {

    @Autowired
    ProductDao productDao;

    @Override
    @RequestMapping(value = "/api/getProductList",
    method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ProductDetailsResponse getAllProducts() throws AppBaseException {

        productDao.getAllProducts();
        return null;
    }

    @Override
    @RequestMapping(value = "/api/getProductList",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductDetailsResponse getProductById(int id) throws AppBaseException {
        return null;
    }
}
