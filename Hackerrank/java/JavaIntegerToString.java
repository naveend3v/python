// https://www.hackerrank.com/challenges/java-int-to-string/problem
// Java Integer to String
import java.util.*;

// Change below class name "Java_integer_to_string" to "Solution" when running this code in HackerRank submission

public class JavaIntegerToString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s;
        if (n>=-100 && n<=100) {
            s = Integer.toString(n);
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        }

    }
}