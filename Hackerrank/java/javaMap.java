// https://www.hackerrank.com/challenges/phone-book/problem
/*
    Ref
    https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
*/
 */
import java.util.*;
import java.io.*;
// Change below class name "javaMap" to "Solution" when running this code in HackerRank submission
public class javaMap {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // Storing data in a Key Value pairs
        Map<String, Integer> map = new HashMap<String, Integer>();
        s.nextLine();
        // Adding name and phoneNo to the Map
        while(n-- > 0){
            String name = s.nextLine();
            int phoneNo = s.nextInt();
            s.nextLine();
            map.put(name,phoneNo);
        }
        // Queries for the Name
        while(s.hasNextLine()){
            String queryName = s.nextLine();
            if(map.containsKey(queryName)){
                System.out.println(queryName+"="+map.get(queryName));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
