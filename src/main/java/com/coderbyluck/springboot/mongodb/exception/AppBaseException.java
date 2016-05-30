package com.coderbyluck.springboot.mongodb.exception;

/**
 * Created by IntelliJ IDEA.
 * User: coderbyluck
 * Date: 5/29/16
 * Time: 9:09 PM
 * File Description:
 */
public class AppBaseException extends Exception {


    public AppBaseException(String message){
        super(message);
    }

    public AppBaseException(Throwable cause){super(cause);}

    public AppBaseException(String message, Throwable cause){super(message,cause);}


}
