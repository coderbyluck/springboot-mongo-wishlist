package com.coderbyluck.springboot.mongodb.exception;

/**
 * Created by IntelliJ IDEA.
 * User: coderbyluck
 * Date: 5/30/16
 * Time: 7:59 AM
 * File Description: This exception extends Runtime Exception (Unchecked Exception)
 *                  Here the client does not need to throw this exception explicitly
 */
public class DataLayerException extends RuntimeException {

    public DataLayerException(String message){
        super(message);
    }

    public DataLayerException(Throwable cause){super(cause);}

    public DataLayerException(String message, Throwable cause){super(message,cause);}


}
