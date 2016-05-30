package com.coderbyluck.springboot.mongodb.domain;

import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: coderbyluck
 * Date: 5/29/16
 * Time: 9:47 PM
 * File Description:
 */
public class Context {

    private BigInteger id;
    private String user;
    private String message;
    private boolean status;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
