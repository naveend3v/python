// https://www.hackerrank.com/challenges/java-1d-array/problem

import java.util.*;

// Change below class name "Array_1D_Part_2" to "Solution" when running this code in HackerRank submission
public class Array1D2 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int standingIndex = 0;
        for(int i=0;i<game.length;i++){
            if(game[i+1]==0){
                standingIndex = standingIndex + 1;
            } else if (game[i+leap] == 0 && i+leap < game.length) {
                standingIndex = standingIndex + i + leap;
            } else if (game[i+leap] >= game.length){
                standingIndex = standingIndex + (game.length-1);
            }
            System.out.println();
            if((standingIndex == game.length-1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}