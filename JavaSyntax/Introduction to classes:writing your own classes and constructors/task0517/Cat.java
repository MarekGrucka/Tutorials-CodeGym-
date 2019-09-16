package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    private String name;
    private int age= 5;
    private int weight= 4;
    private String address;
    private String color = "black";

    public Cat (String name) {
        this.name = name;
    }

    public Cat (String name, int weight, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Cat (int weight, String color)
    {
        this.weight = weight;
        this.color = color;
    }

    public Cat (int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
    /*
   - Name,
- Name, weight, age
- Name, age (standard weight)
- Weight, color (name, address, and age are unknown; the cat is homeless)
- Weight, color, address (someone else's pet)
     */


    public static void main(String[] args) {

    }
}
