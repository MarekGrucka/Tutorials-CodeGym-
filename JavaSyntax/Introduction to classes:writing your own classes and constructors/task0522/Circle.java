package com.codegym.task.task05.task0522;

/* 
Max constructors

*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x)
    {
        this.x = x;
            }

    public Circle(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Circle(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(){this(3,4,5);}


    public static void main(String[] args) {

    }
}