package code.JavaUdemyCourse.CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args){
        // TreeMap
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(0,"A");
        tm.put(1,"B");
        tm.put(3,"D");
        tm.put(6,"E");
        tm.put(2,"F");
        tm.put(5,"O");
        tm.put(5,"P");
        tm.put(4,"M");

        System.out.println(tm);
        Entry<Integer,String> e1 = tm.firstEntry();
        Entry<Integer,String> e2 = tm.lastEntry();
        System.out.println("First Map Entry Key : " + e1.getKey() + ", Value : " + e1.getValue());
        System.out.println("Last Map Entry Key : " + e2.getKey() + ", Value : " +  e2.getValue());
    }
}
