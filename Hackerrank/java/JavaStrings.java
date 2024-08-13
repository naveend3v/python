// https://www.hackerrank.com/challenges/java-strings-introduction/problem
// Java String Introduction

import java.util.*;

// Change below class name "java_strings" to "Solution" when running this code in HackerRank submission

public class JavaStrings {
    public static String capitalizeFirstWord(String word){
        return word.substring(0, 1).toUpperCase()+word.substring(1,word.length());
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if (A.compareTo(B)>0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(capitalizeFirstWord(A) + " " + capitalizeFirstWord(B));
    }
}



