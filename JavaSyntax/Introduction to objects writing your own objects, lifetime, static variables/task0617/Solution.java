package com.codegym.task.task06.task0617;

/* 
Notepad for new ideas

*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }

    public static class Idea {
        public String getDescription() {
            String idea = "description";
            return idea;
        }
    }
    //write your code here
}
