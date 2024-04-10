// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
// Java Pattern Syntax Checker

import java.util.Scanner;
import java.util.regex.*;
// Change below class name "Java_Pattern_Syntax_Checker" to "Solution" when running this code in HackerRank submission
public class Java_Pattern_Syntax_Checker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
        in.close();
    }
}



