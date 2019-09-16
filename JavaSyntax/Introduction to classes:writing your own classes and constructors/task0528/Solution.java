package com.codegym.task.task05.task0528;
import java.util.*;
import java.text.*;

/* 
Display today's date
Display the current date in the following format: "06 15 2018".


Требования:
1. The date must contain the month, day, and year, separated by a space.
2. The month should match the current month.
3. The day should match the current day.
4. The year should match the current year.
5. The entire date should be displayed on a single line.
*/

public class Solution {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("MM dd yyyy");
        String dateString = format.format( new Date()   );



        System.out.println(dateString);









        //write your code here
    }
}
