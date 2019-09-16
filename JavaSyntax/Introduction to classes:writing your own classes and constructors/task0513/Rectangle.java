package com.codegym.task.task05.task0513;

/* 
Let's put together a rectangle

*/

public class Rectangle {
    private int top= 0;
    private int left= 0;
    private int width= 0;
    private int height= 0;

    public void initialize(int top)
    {
        this.top = top;
    }

    public void initialize(int top, int left)
    {
        this.top = top;
        this.left = left;
    }

    public void initialize(int top, int left, int width)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize(int top, int left, int width, int height)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(Rectangle temp)
    {

        temp.top = top;
        temp.left = left;
        temp.width = width;
        temp.height = height;

    }


    public static void main(String[] args) {

    }
}
