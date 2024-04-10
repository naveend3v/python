// https://www.hackerrank.com/challenges/java-if-else/problem
// Java If-Else

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// Change below class name "javaIfElse" to "Solution" when running this code in HackerRank submission

public class javaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if ((N%2 == 0 && N>=6 && N<=20) || (N%2 != 0)) {
            System.out.println("Weird");
        } else if ((N%2 == 0 && N>=2 && N<=5) || (N%2 == 0 && N>=20)) {
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}
