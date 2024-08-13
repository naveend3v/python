// https://www.hackerrank.com/challenges/java-end-of-file/problem
// Java End Of File

import java.util.*;

// Change below class name "java_end_of_file" to "Solution" when running this code in HackerRank submission

public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while(scanner.hasNext()){
            System.out.printf("%d %s%n",i,scanner.nextLine());
            i++;
        }
        scanner.close();
    }
}