package code.JavaUdemyCourse.CollectionFramework;
import java.util.Arrays;
import java.util.TreeSet;
public class TreeSet1 {
    public static void main(String[] args){
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0;i<70;i+=5){
            int count = (int) (Math.random() * i);
            System.out.print(count + " ");
            ts.add(count);
        }
        System.out.println("\n");

        System.out.println(ts);

        System.out.println("Ceiling above 25: " + ts.ceiling(25));

        System.out.println("Subset from 25 to 100: " + ts.subSet(25,101));
    }
}
