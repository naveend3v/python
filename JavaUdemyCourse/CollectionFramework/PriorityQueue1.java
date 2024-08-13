package code.JavaUdemyCourse.CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComp implements Comparator<Integer>{
    @Override
    public int compare(Integer n1, Integer n2){
        int value =  n1.compareTo(n2);
        // elements are sorted in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}

public class PriorityQueue1 {
    public static void main(String[] args){
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.offer(5);
        pq1.offer(100);
        pq1.offer(50);
        pq1.offer(45);
        pq1.offer(35);
        pq1.offer(20);
        pq1.offer(1);
        while(!pq1.isEmpty()){
            System.out.println(pq1.poll());
        }
    }
}
