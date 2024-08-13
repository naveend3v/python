// https://www.hackerrank.com/challenges/java-exception-handling/problem

package code.Hackerrank.java;

import java.util.Scanner;

class MyCalculator2 {
    public long power(int n, int p) throws Exception {
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else {
            long temp = 1;
            int count = 1;
            while (count <= p) {
                temp = temp * n;
                count++;
            }
            return temp;
        }

    }
}

public class JavaExceptionHandling2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyCalculator2 MyCalculator2 = new MyCalculator2();
        while (s.hasNextInt()) {
            int n = s.nextInt();
            int p = s.nextInt();
            try {
                System.out.println(MyCalculator2.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
