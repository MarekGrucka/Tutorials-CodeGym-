package com.codegym.task.task13.task1319;

import java.io.*;
import java.nio.Buffer;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        InputStream inStream = new FileInputStream("c:/source.txt");
        OutputStream outStream = new FileOutputStream("c:/result.txt");

        while (inStream.available() > 0)
        {
            int data = inStream.read(); //read one byte from the input stream
            outStream.write(data); //write that byte to the other stream.
        }

        inStream.close(); //close the streams
        outStream.close();



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw;
        FileWriter outputfile = new FileWriter(reader.readLine());
        reader.close();
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            String line = reader2.readLine();
            outputfile.write(line);
            if (line.equals("exit"))
                reader2.close();
                break;
        }


        // write your code here
    }
}
