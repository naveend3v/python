package code.JavaUdemyCourse.CollectionFramework;

import java.util.*;
import java.util.Arrays;

class My implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) {
        if (i1 < i2) {
            return 1;
        }
        if (i1 > i2) {
            return -1;
        }
        return 0;
    }
}

public class Arrays1 {
    public static void main(String[] args) {
        Integer a[] = {20, 19, 67, 21, 42, 15, 80};
        int[] b = {22, 54, 35, 37, 90, 92, 24};
        int[] c = Arrays.copyOf(b, 5);
        System.out.println(Arrays.toString(c));
        Arrays.sort(a,new My());
        System.out.println(Arrays.toString(a));
    }
}
