// https://www.hackerrank.com/challenges/java-biginteger/problem
// Java Big Integer
import java.util.*;
import java.math.*;

// Change below class name "java_big_integer" to "Solution" when running this code in HackerRank submission
public class JavaBigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger(), b = scanner.nextBigInteger();
        if((a.compareTo(BigInteger.valueOf(0)) >= 0) && (b.compareTo(BigInteger.valueOf(0)) >= 0) && ((a.toString().length()<=200) && (b.toString().length()<=200))) {
            System.out.println(a.add(b));
            System.out.println(a.multiply(b));
        }
        scanner.close();

    }
}
