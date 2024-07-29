package code.JavaUdemyCourse.GenericsDemo;

class A{}
class B extends A {}
class C extends B {}

// Generic Class
class MyArray<T> {
    T[] obj = (T[]) new Object[4];
    int len = 0;
    public void append(T v){
        obj[len++] = v;
    }
    public void display(){
        for(T x : obj){
            System.out.println(x);
        }
    }
}

public class GenericsDemo {
    // Generic Method
    static <T> void fun1(T... list){
        for(T x: list){
            System.out.println(x);
        }
    }

    // Generic Method with wildcard
    static void fun2(MyArray<?> list){
    }
    // Generic Method with lower bound -
    static void fun3(MyArray<? super B> list){
    }
    // Generic Method with upper bound
    static void fun4(MyArray<? extends B> list){
    }

    public static void main(String[] args){
        fun1(1,2,3,4,5,"HI");

        MyArray<String> ma1 = new MyArray<>();
        MyArray<Integer> ma2 = new MyArray<>();
        fun2(ma1);
        fun2(ma2);

        MyArray<A> ma3 = new MyArray<>();
        MyArray<B> ma4 = new MyArray<>();
        MyArray<C> ma5 = new MyArray<>();
        fun3(ma3); // func3 is lower bound hence it accept only class B and its super class A
        fun4(ma5); // func4 is upper bound hence it accept only class B and its sub-classes C
    }
}
