package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
    private String name;
    private int weight = 5;
    private int age = 6;
    private String address;
    private String color = "grey";

    //private int avWeight = 5;
    //private int avAge = 6;
   // private String avColor = "grey";

    public void initialize(String Name)
    {
        this.name = Name;
    }

    public void initialize(String Name, int weight, int age)
    {
      this.name = Name;
      this.age = age;
      this.weight = weight;
    }

    public void initialize(String Name, int age)
    {
        this.name = Name;
        this.age = age;
    }

    public void initialize(int weight, String color)
    {
        this.color = color;
        this.weight = weight;
    }

    public void initialize(int weight, String color, String address)
    {
        this.color = color;
        this.weight = weight;
        this.address = address;
    }



    public static void main(String[] args) {

    }
}
