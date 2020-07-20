package com.ypp.rectangle;

public class Rectangle {
    private int height;
    private int width;
    private String color = "No Color";

    //constructor
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    //getters and setters
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int calculateSurface() {
        return height * width;
    }

    public int calculateCircumference(){
        return ((2 * width) + (2 * height));
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", surface=" + calculateSurface() +
                ", circumference=" + calculateCircumference() +
                '}';
    }

    /*
    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }*/
}
