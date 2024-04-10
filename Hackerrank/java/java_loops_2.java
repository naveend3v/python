// https://www.hackerrank.com/challenges/java-loops/problem
// Java Loops II

import java.util.*;
import java.io.*;
// // Change below class name "java_loops_2" to "Solution" when running this code in HackerRank submission
public class java_loops_2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int base = 2;
            int exponent = n;
            int result = 1;
            int series = 0;
            series = a+result*b;
            System.out.printf("%d ",series);
            for(int j=1;j<exponent;j++){
                result*=base;
                series+=result*b;
                System.out.printf("%d ",series);
            }
            System.out.printf("%n");
        }
        in.close();
    }
}
