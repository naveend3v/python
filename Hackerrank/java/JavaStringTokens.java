// https://www.hackerrank.com/challenges/java-string-tokens/problem
// Java String Tokens
import java.util.*;

// Change below class name "Java_String_Tokens" to "Solution" when running this code in HackerRank submission
public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        // Using trim() method to remove leading and trailing whitespace
        // Using split method we split based on special characters given in the problem statement.
        String[] stringTokens = s.trim().split("[\\s!,?._'@]+");

        // Condition to check the input string length as per constraints (1<= length of string <= 4x10^5)
        if(s!=null && !s.trim().isEmpty() && s.length()<=400000){
            System.out.println(stringTokens.length);
            for (String token : stringTokens) {
                System.out.println(token);
            }
        } else {
            // if the input string is empty it will print length as 0
                System.out.println(0);
            }
    }
}

