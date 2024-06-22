import java.util.*;

public class MethodOverloading {

    static double area(double l, double b){
        return l*b;
    }

    static double area(double l, double b, double h){
        return 0.5*(l+b)*h;
    }

    static double area(double radius){
        return Math.PI*radius*radius;
    }

    public static void main(String[] args){
        System.out.println("Area of Circle: " + area(4));
        System.out.println("Area of Rectangle: " + area(30,10));
        System.out.println("Area of Trapezium: " + area(4,5,10));
    }

}
