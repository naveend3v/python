// https://www.hackerrank.com/challenges/java-hashset/problem
// Ref - https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html
import java.util.*;

// Change below class name "javaHashset" to "Solution" when running this code in HackerRank submission
public class JavaHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int queries = s.nextInt();
        // Creating HashSet to store values and it does not store duplicates
        HashSet<String> hs = new HashSet<String>();
        s.nextLine();
        while (queries-- > 0){
            String str = s.nextLine();
            hs.add(str);
            System.out.println(hs.size());
        }
        s.close();
    }
}
