package code.JavaUdemyCourse.CollectionFramework;

import java.util.*;

interface myLambda {
    public void display(int i);
}

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(5);
        list1.add(0, 1);
        list2.addAll(List.of(15, 20, 25, 30, 35, 40));
        System.out.println("List 1 : " + list1);
        System.out.println("List 2 : " + list2);
        list1.addAll(list2);
        System.out.println("Updated List 1 : " + list1);
        // Using forEach method with Lambda function we print each elements
        // list1.forEach((i -> System.out.println(i)));
        System.out.println("List 1 Size : " + list1.size());
        System.out.println("In List 1 the index of element 25 is " + list1.indexOf(25));


/*
        // Using List iterator, we can access each elements
        for(Iterator it = list1.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
*/
/*        // Using List iterator, we can access each elements
        for(ListIterator listIT = list1.listIterator();listIT.hasNext();){
            System.out.print(listIT.next() + " ");
        }
        */
    }
}
