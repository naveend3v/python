// https://www.hackerrank.com/challenges/duplicate-word/problem
// Java Regex 2 Duplicate Words
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Change below class name "Java_Regex_2_Duplicate_Words" to "DuplicateWords" when running this code in HackerRank submission
public class Java_Regex_2_Duplicate_Words {

    public static void main(String[] args) {

        String regex = "(?i)(\\b\\w+\\b)(\\b\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(regex, "$1");
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}