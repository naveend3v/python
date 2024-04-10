// https://www.hackerrank.com/challenges/java-loops-i/problem
// Java Loops I
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
// Change below class name "Java_Loops_I" to "Solution" when running this code in HackerRank submission

public class Java_Loops_I {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int num=1;num <=10;num++){
            System.out.printf("%d x %d = %d%n",N,num,N*num);
        }
        bufferedReader.close();
    }
}
