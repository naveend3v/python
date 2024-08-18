package code.JavaUdemyCourse.CollectionFramework;

import java.util.LinkedHashSet;
import java.util.HashSet;


public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        set1.add(5);
        set1.add(3);
        set1.add(1);
        set1.add(4);
        set1.add(2);
        System.out.println(set1);

        HashSet<String> set2 = new HashSet<>();
        set2.add("G");
        set2.add("A");
        set2.add("F");
        set2.add("I");
        set2.add("B");
        set2.add("Z");
        System.out.println(set2);
    }
}
