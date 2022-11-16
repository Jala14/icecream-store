package com.matrix.example.demo.dao.entity;

public class Cart {

    private ProductEntity productEntity;
    private  int quantity;
    private Cart[] carts;

    public Cart(ProductEntity productEntity,int quantity){
        this.productEntity=productEntity;
        this.quantity=quantity;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
