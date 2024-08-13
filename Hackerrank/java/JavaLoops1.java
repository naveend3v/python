// https://www.hackerrank.com/challenges/java-loops-i/problem
// Java Loops I
import java.io.*;
// Change below class name "Java_Loops_I" to "Solution" when running this code in HackerRank submission

public class JavaLoops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int num=1;num <=10;num++){
            System.out.printf("%d x %d = %d%n",N,num,N*num);
        }
        bufferedReader.close();
    }
}
