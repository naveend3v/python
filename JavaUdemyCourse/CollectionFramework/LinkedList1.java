package code.JavaUdemyCourse.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList(List.of(10,20,30,40,60,70));

        list1.add(5);
        list1.addAll(list2);
        System.out.println("List 1 : " + list1);
        list1.addFirst(1);
        list1.addLast(300);
        System.out.println("List 1 : " + list1);

        System.out.println("Printing values from List 1 in using peek() : ");

        for(Iterator it = list1.iterator(); it.hasNext();){
            System.out.println("Value : " + it.next());
        }

        System.out.println("Printing values from List 1 in Reverse Order using descendingIterator() : ");

        for(Iterator it = list1.descendingIterator(); it.hasNext();){
            System.out.println("Value : " + it.next());
        }

    }
}
