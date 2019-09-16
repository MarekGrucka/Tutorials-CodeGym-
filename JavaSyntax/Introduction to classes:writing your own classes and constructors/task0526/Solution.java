package com.codegym.task.task05.task0526;

/* 
Man and woman
1. Inside the Solution class, create public static Man and Woman classes.
2. The classes must have the following fields: String name, int age, String address.
3. Make constructors that have all possible parameters.
4. Create two objects of each class with complete data using a constructor.
5. Display the objects on the screen in this format: name + " " + age + " " + address


Requirements:
1. In the Solution class, create a public static Man class.
2. In the Solution class, create a public static Woman class.
3. The Man class must have variables: String name, int age, and String address.
4. The Woman class must have variables: String name, int age, and String address.
5. The Man and Woman classes must have constructors that take String, int, and String arguments.
6. The constructors must initialize the instance variables.
7. In the main method, you need to create two objects of each type.
8. The main method should display the created objects on the screen in the specified format.
*/

public class Solution {
    public static void main(String[] args) {
       Man man1 = new Man("Mark", 23, "23");
               System.out.println(man1.getName() + " " + man1.getAge() + " " + man1.getAddress());

       Man man2 = new  Man("sd", 23,"45");
        System.out.println(man2.getName() + " " + man2.getAge() + " " + man2.getAddress());

       Woman woman1 = new Woman("s",2,"3");
        System.out.println(woman1.getName() + " " + woman1.getAge() + " " + woman1.getAddress());
        Woman woman2 = new Woman("j",2,"3");
        System.out.println(woman2.getName() + " " + woman2.getAge() + " " + woman2.getAddress());


       //write your code here
    }
    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public int getAge()
        {
            return age;
        }

        public String getAddress()
        {
            return address;
        }
    }

    public static class Woman
        {
            private String name;
            private  int age;
            private String address;

            public Woman (String name, int age, String address)
            {
                this.name = name;
                this.age = age;
                this.address = address;
            }
            public String getName()

            {
                return name;
            }

            public int getAge()

            {
                return age;
            }

            public String getAddress()

            {
                return address;
            }
    }

}
