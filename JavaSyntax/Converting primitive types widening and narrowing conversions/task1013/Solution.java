package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private  boolean sex;
        private String lastname;
        private int salary;
        private int weight;

        public Human (String name){
            name = this.name;
        }
        public Human (String name, int age){
            name = this.name;
            age = this.age;
        }
        public Human (String name, int age, boolean sex){
            name = this.name;
            age = this.age;
            sex = this.sex;
        }

        public Human (String name, int age, boolean sex, String lastname){
            name = this.name;
            age = this.age;
            sex = this.sex;
            lastname = this.lastname;
        }

        public Human (String name, int age, boolean sex, String lastname, int salary){
            name = this.name;
            age = this.age;
            sex = this.sex;
            lastname = this.lastname;
            salary = this.salary;
        }

        public Human (String name, int age, boolean sex, String lastname, int salary, int weight){
            name = this.name;
            age = this.age;
            sex = this.sex;
            lastname = this.lastname;
            salary = this.salary;
            weight = this.weight;
        }

        public Human (int age, int salary, int weight){

            age = this.age;


            salary = this.salary;
            weight = this.weight;
        }

        public Human (String name, String lastname){
            name = this.name;
                   lastname = this.lastname;

        }
        public Human (String name, String lastname, int salary){
            name = this.name;

            lastname = this.lastname;
            salary = this.salary;

        }

        public Human (String name, int age, boolean sex, int weight){
            name = this.name;
            age = this.age;
            sex = this.sex;

            weight = this.weight;
        }

        // Write your variables and constructors here
    }
}
