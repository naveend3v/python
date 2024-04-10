// https://www.hackerrank.com/challenges/java-anagrams/problem
// Java Anagrams

import java.util.Scanner;
// Change below class name "Java_Anagrams" to "Solution" when running this code in HackerRank submission
public class Java_Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
       String s1 = a.toLowerCase();
       String s2 = b.toLowerCase();
       if (s1.length()!=s2.length()){return false;}
       int sum = 0;
       for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()){
           for(int i=0;i<s1.length();i++){
               if(s1.charAt(i)==c){
                   sum++;
               }
               if(s2.charAt(i)==c){
                   sum--;
               }
           }
           if(sum!=0){
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}