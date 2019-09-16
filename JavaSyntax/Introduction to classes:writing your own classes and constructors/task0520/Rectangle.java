package com.codegym.task.task05.task0520;

/* 
Create a Rectangle class

*/


public class Rectangle {
    private int top= 0;
    private int left= 0;
    private int width= 0;
    private int height= 0;

    public Rectangle(int top)
    {
        this.top = top;
    }

    public Rectangle(int top, int left)
    {
        this.top = top;
        this.left = left;
    }

    public Rectangle(int top, int left, int width)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public Rectangle(int top, int left, int width, int height)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle copy) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }


    public static void main(String[] args) {

    }
}
