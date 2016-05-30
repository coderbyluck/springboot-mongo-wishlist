package com.coderbyluck.springboot.mongodb.domain;

/**
 * Created by IntelliJ IDEA.
 * User: coderbyluck
 * Date: 5/29/16
 * Time: 8:55 PM
 * File Description:
 */
public class Product {

    private int id;
    private String name;
    private String description;
    private double price;
    private double averageRating;
    private String seller;
    private String link;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString(){
        return String.format(
                "Product [id=%s, name='%s', description='%s', price='%s', averageRating='%s', seller='%s', link='%s']",
                id, name, description, price, averageRating, seller, link);
    }

}
