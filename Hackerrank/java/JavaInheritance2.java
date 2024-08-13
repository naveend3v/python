// https://www.hackerrank.com/challenges/java-inheritance-2/problem

package code.Hackerrank.java;

class Arithmetic{
    int add(int i1, int i2){
        return i1+i2;
    }
}
class Adder extends Arithmetic{
}
public class JavaInheritance2 {
    public static void main(String[] args){
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}
