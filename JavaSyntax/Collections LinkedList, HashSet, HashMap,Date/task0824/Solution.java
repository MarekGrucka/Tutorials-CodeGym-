package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> children0 = new ArrayList<Human>();
        Human child1 = new Human("Marek", true, 10, children0);
        Human child2 = new Human("Marek", true, 10, children0);
        Human child3 = new Human("Marek", true, 10, children0);



        ArrayList<Human> children1 = new ArrayList<Human>();
        children1.add(child1);
        children1.add(child2);
        children1.add(child3);



        Human father = new Human("Marek", true, 30, children1);
        Human mother = new Human("Asia", false, 30, children1);

        ArrayList<Human> children2 = new ArrayList<Human>();
        ArrayList<Human> children3 = new ArrayList<Human>();
        children2.add(father);
        children3.add(mother);

        Human grandfather = new Human("Maciek", true, 30, children2);
        Human grandmother = new Human("Basia", false, 30, children2);

        Human grandfather2 = new Human("Maciek", true, 30, children3);
        Human grandmother2 = new Human("Basia", false, 30, children3);


        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(grandfather.toString());
        System.out.println(grandmother.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother2.toString());





        //write your code here
    }

    public static class Human{
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

         //write your code here

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
