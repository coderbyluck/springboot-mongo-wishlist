package com.coderbyluck.springboot.mongodb.domain;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: coderbyluck
 * Date: 5/29/16
 * Time: 9:46 PM
 * File Description:
 */
public class ProductDetailsResponse {

    private List<Product> productList;
    private Context responseContext;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Context getResponseContext() {
        return responseContext;
    }

    public void setResponseContext(Context responseContext) {
        this.responseContext = responseContext;
    }
}

