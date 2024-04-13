// https://www.hackerrank.com/challenges/java-regex/problem
// Java Regex

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
// Change below class name "Java_Regex" to "Solution" when running this code in HackerRank submission
class Java_Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    String pattern = "^([01]?\\d{0,2}|25[0-5]|2[0-4]\\d)\\.([01]?\\d{0,2}|25[0-5]|2[0-4]\\d)\\.([01]?\\d{0,2}|25[0-5]|2[0-4]\\d)\\.([01]?\\d{0,2}|25[0-5]|2[0-4]\\d)$";
}