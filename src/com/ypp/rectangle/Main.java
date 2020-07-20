package com.ypp.rectangle;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 3);
        Rectangle rectangle2 = new Rectangle(6,5);

        System.out.println("Surface of rectangle1 with height " + rectangle1.getHeight() + " and width " +
                rectangle1.getWidth() + " is " + rectangle1.calculateSurface());
        System.out.println("Surface of rectangle2 with height " + rectangle2.getHeight() + " and width " +
                rectangle2.getWidth() + " is " + rectangle2.calculateSurface());
        System.out.println("Surface of rectangle1 with height " + rectangle1.getHeight() + " and width " +
                rectangle1.getWidth() + " is " + rectangle1.calculateCircumference());
        System.out.println("Surface of rectangle2 with height " + rectangle2.getHeight() + " and width " +
                rectangle2.getWidth() + " is " + rectangle2.calculateCircumference());

        rectangle1.setColor("Blue");
        System.out.println(rectangle1);
        rectangle2.setColor("Orange");
        System.out.println(rectangle2);
    }
}
