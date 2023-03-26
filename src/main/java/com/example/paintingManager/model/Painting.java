package com.example.paintingManager.model;

public class Painting {
    private int id;
    private String code;
    private double height;
    private double weight;
    private String material;
    private String describe;
    private double price;

    public Painting() {
    }

    public Painting(int id, String code, double height, double weight, String material, String describe, double price) {
        this.id = id;
        this.code = code;
        this.height = height;
        this.weight = weight;
        this.material = material;
        this.describe = describe;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
