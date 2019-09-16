package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        Human Kazik = new Human("Kazik", true, 90);
        Human Maria = new Human("Maria", false, 92);
        Human Walter = new Human("Walter", true, 90);
        Human Krystyna = new Human("Krystyna", false, 92);
        Human Waldek  = new Human("Waldek", true, 67, Walter, Krystyna);
        Human Ewa  = new Human("Ewa", false, 64, Kazik, Maria);
        Human Tomek = new Human("Tomek", true, 37, Waldek, Ewa);
        Human Marek  = new Human("Marek", true, 30, Waldek, Ewa);
        Human Domin  = new Human("Domin", true, 29, Waldek, Ewa);

        System.out.println(Kazik.toString());
        System.out.println(Maria.toString());
        System.out.println(Walter.toString());
        System.out.println(Krystyna.toString());
        System.out.println(Waldek.toString());
        System.out.println(Ewa.toString());
        System.out.println(Tomek.toString());
        System.out.println(Marek.toString());
        System.out.println(Domin.toString());



        // write your code here
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

                // write your code here

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}