// https://www.hackerrank.com/challenges/java-1d-array-introduction/problem

import java.util.*;

// Change below class name "Array_1D" to "Solution" when running this code in HackerRank submission
public class Array1D {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}