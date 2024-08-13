import java.util.*;

// Change below class name "Java_String_Reverse" to "Solution" when running this code in HackerRank submission
public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B = "";
        for(int i=A.length()-1;i>=0;i--){
            B=B+(A.charAt(i));
        }
        System.out.println(A.equals(B)?"Yes":"No");
        sc.close();

    }
}