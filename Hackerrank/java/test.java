import java.util.*;
public class test {
    static void update(int i){
        i = i*i;
        System.out.println("updated value :" + i);
    }

    static void update2(int i[], int index, int newValue){
        i[index] = newValue;
        System.out.println("Updated Array Value :" + i[index]);
        System.out.println(Arrays.toString(i));
    }

    public static void main(String[] args){
        int a = 2;
        update(a);
        System.out.println("initialized value :" + a);

        System.out.println("----------------------------------------");

        int[] arr = new int[]{2,4,6,8,10};
        update2(arr,0,20);
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
    }
}
