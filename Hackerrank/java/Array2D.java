// https://www.hackerrank.com/challenges/java-2d-array/problem

import java.io.*;
import java.util.*;

// Change below class name "Array_2D" to "Solution" when running this code in HackerRank submission
public class Array2D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<4;i++){
            for(int j=0;j<4;j++){
                int sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
                        + arr.get(i+1).get(j+1) +
                        arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                if(maxSum<sum){maxSum=sum;}
            }
        }
        System.out.println(maxSum);
    }
}