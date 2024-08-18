package code.JavaUdemyCourse.CollectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTable1 {
    public static void main(String[] args){
        Hashtable ht = new Hashtable();
        // Adding elements
        ht.put(54,"AB");
        ht.put(10,"IJ");
        ht.put(25,"GH");
        ht.put(40,"CD");
        ht.put(33,"EF");

/*
        // All elements in HashTable is stored as Objects.
        // Hence, when accessing we have to TypeCast to the desired data type.
        String s1 = (String) ht.get(33);
*/

/*
        // Using Enumeration interface, we iterate through the Hashtable keys.
        Enumeration e = ht.keys();
        while(e.hasMoreElements()){
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();
*/

        System.out.println("Before Compute Method" + "\n"+ ht);

       ht.computeIfAbsent(60, (v)->"ZZ");
       System.out.println("After ComputeIfAbsent Method" + "\n"+ ht);

       ht.computeIfPresent(33,(k,v)->v="AA");

       System.out.println("After ComputeIfPresent Method" + "\n"+ ht);

    }
}
