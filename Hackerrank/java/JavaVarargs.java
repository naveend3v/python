// https://www.hackerrank.com/challenges/simple-addition-varargs/problem

package code.Hackerrank.java;

import java.util.*;

class Add {
    public void add(int... v) {
        int temp = 0;
        for (int x : v) {
            temp = temp + x;
            System.out.print(x);
            if(x!=v[v.length-1])
                System.out.print("+");
        }
        System.out.print("=" + temp + "\n");
    }
}

public class JavaVarargs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int n4 = s.nextInt();
        int n5 = s.nextInt();
        int n6 = s.nextInt();
        Add a1 = new Add();
        a1.add(n1,n2);
        a1.add(n1,n2,n3);
        a1.add(n1,n2,n3,n4,n5);
        a1.add(n1,n2,n3,n4,n5,n6);
    }
}
