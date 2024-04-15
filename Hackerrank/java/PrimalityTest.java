// https://www.hackerrank.com/challenges/java-primality-test/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// Change below class name "PrimalityTest" to "Solution" when running this code in HackerRank submission

public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        // Where certainty is set to 1,
        // Ref - https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html#isProbablePrime%28int%29
        System.out.println((new BigInteger(n).isProbablePrime(1))?"prime":"not prime");
        bufferedReader.close();
    }
}
