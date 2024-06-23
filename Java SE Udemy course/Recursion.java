// program to print the all the numbers before the given input number

public class Recursion {

    static void fun(int n){
        if(n>0){
            System.out.println(n);
            fun(n-1);
        }
    }
    public static void main(String[] args){
        fun(4);
    }
}
