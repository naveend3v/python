package code.JavaUdemyCourse.CollectionFramework;

import java.util.Arrays;
import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>(10,0.5f);
        hs.add(50);
        hs.add(20);
        hs.add(30);
        hs.add(60);
        hs.add(80);
        hs.add(100);
        hs.add(80);
        System.out.println(hs);
    }
}
