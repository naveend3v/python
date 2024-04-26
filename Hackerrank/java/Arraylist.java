// https://www.hackerrank.com/challenges/java-arraylist/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int noOfArrays = sc.nextInt();
        /* Saving numbers in 2D ArrayList */
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for(int i=0;i<noOfArrays;i++){
            int newArrayLength = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j < newArrayLength;j++){
                list.add(sc.nextInt());
            }
            lists.add(list);
        }

        /* Finding position of the number for each queries */
        int noOfQueries = sc.nextInt();
        while(noOfQueries > 0){
            int row = sc.nextInt();
            int column = sc.nextInt();
            try {
                System.out.println(lists.get(row-1).get(column-1));
            } catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
            noOfQueries--;
        }
    }
}