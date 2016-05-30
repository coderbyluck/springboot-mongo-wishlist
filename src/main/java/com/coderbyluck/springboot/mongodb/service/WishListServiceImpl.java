package com.coderbyluck.springboot.mongodb.service;

import com.coderbyluck.springboot.mongodb.dao.ProductDao;
import com.coderbyluck.springboot.mongodb.domain.Context;
import com.coderbyluck.springboot.mongodb.domain.Product;
import com.coderbyluck.springboot.mongodb.domain.ProductDetailsResponse;
import com.coderbyluck.springboot.mongodb.exception.AppBaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

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

        ProductDetailsResponse response = new ProductDetailsResponse();
        response.setProductList(productDao.getAllProducts());

        Context responseContext = new Context();
        UUID idOne = UUID.randomUUID();
        responseContext.setId(idOne);
        responseContext.setUser("testUser");

        response.setResponseContext(responseContext);
        return response;
    }

    @Override
    @RequestMapping(value = "/api/getProductById",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Product getProductById(int id)  {
        return productDao.getProduct();
    }
}
