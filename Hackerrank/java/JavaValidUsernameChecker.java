// https://www.hackerrank.com/challenges/valid-username-checker/problem
// Username validator

import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "(^\\b\\w{0}[a-zA-Z]\\w{6,28}[a-zA-Z0-9_]\\b$)";
}

// Change below class name "Java_Valid_Username_Checker" to "Solution" when running this code in HackerRank submission
public class JavaValidUsernameChecker {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}