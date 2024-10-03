package com.louis.mall.model;

import javax.xml.crypto.Data;

public class Product {
    private Integer productId;
    private String productName;
    private String category;
    private String imageUrl;
    private Integer price;
    private Integer stock;
    private String description;
    private Data createdDate;
    private Data lastModifiedDate;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Data getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Data createdDate) {
        this.createdDate = createdDate;
    }

    public Data getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Data lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
