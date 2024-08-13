package code.JavaUdemyCourse.CollectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.*;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>(5,0.75f);
        /*
         In LinkedHashMap - element are ordered based on insertion.
         If we insert elements above the defined initial capacity and the new initial capacity is automatically calulated
         (intial capacity x loading factor)
        */
        System.out.println("Initial Map Size : " + map1.size());
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");
        map1.put(4,"D");
        map1.put(5,"E");
        map1.put(6,"F");
        map1.put(7,"G");
        map1.put(8,"H");

        System.out.println("Final Map Size : " + map1.size());

//        map1.forEach((k,v)->System.out.println(k + " " + v));
        System.out.println(map1);
        System.out.println("-------------------------------------------------------------------------------------");

        /*
         LinkedHashMap ordering elements based on Least Recently Used/Accesed Elements.
        */
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>(5,0.75f,true);
        map2.putAll(map1);
        map2.put(9,"I");
        map2.put(10,"j");
        System.out.println(map2);
        System.out.println("Accessing element 1 : " + map2.get(1));
        System.out.println("Accessing element 3 : " + map2.get(3));
        System.out.println("Accessing element 5 : " + map2.get(5));
        System.out.println("After Accessing the elements the order was changed based on LRU");
        System.out.println(map2);

        System.out.println("-------------------------------------------------------------------------------------");
        /*
            LinkedHashMap - here we limit the size using the Override method, hence the new elements are added
            by removing the eldest elements based on insertion.
            Note: this insertion will vary based on "order of access" if we use "true" in the constructor.
        */
        LinkedHashMap<Integer, String> map3 = new LinkedHashMap(6,0.75f){
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>6;
            }
        };
        map3.putAll(map1);
        System.out.println(map3);
    }
}
