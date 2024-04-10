//  https://www.hackerrank.com/challenges/java-static-initializer-block/problem
//  Java Static Initializer block

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Change below class name "java_static_initializer_block" to "Solution" when running this code in HackerRank submission
public class java_static_initializer_block {

    // Write your code here
    static int B, H;
    static boolean flag = false;
    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if (B>0 && H>0){
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
