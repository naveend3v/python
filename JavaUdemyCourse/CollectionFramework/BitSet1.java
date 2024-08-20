package code.JavaUdemyCourse.CollectionFramework;

import java.util.BitSet;

public class BitSet1 {
    public static void main(String[] args){
        BitSet bs1 = new BitSet();
        for(int i=0;i<=9;i++){
            if(i%2 == 0){
                bs1.set(i);
            }
        }
        System.out.println("BitSet 1 : " +  bs1);
        System.out.println("BitSet 1 size : " + bs1.length());
        // Remember BitSet length always return hightest bitset + 1
        BitSet bs2 = new BitSet();
        for(int j=0;j<=9;j++){
            if(j%2 != 0){
                bs2.set(j);
            }
        }
        System.out.println("BitSet 2 : " +  bs2);
        System.out.println("BitSet 2 size : " + bs2.length());
        System.out.println("BitSet1 AND BitSet2:");
        bs1.and(bs2);
        System.out.println(bs1);
        System.out.println("BitSet1 OR BitSet2");
        bs1.or(bs2);
        System.out.println(bs1);
        System.out.println("BitSet temp :");
        BitSet temp = new BitSet();
        temp.set(0);
        temp.set(1);
        temp.set(2);
        temp.set(3);
        temp.set(5);
        System.out.println(temp);
        System.out.println("Flip BitSet temp :");
        temp.flip(0,temp.length());
        System.out.println(temp);
    }
}
