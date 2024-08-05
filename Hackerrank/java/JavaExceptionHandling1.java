// https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

package code.Hackerrank.java;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling1 {
    public static void  main(String[] args) throws Exception {
        Scanner s  = new Scanner(System.in);
        try{
            int x = s.nextInt();
            int y = s.nextInt();
            System.out.println(x/y);
        } catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
