// https://www.hackerrank.com/challenges/java-output-formatting/problem
// https://www.baeldung.com/java-printstream-printf
// Java Output Formatting

import java.util.Scanner;
// Change below class name "OutputFormatting" to "Solution" when running this code in HackerRank submission
public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-14s %03d%n",s1,x);
        }
        System.out.println("================================");

    }
}