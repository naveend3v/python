// https://www.hackerrank.com/challenges/java-abstract-class/problem
package code.Hackerrank.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    String title;
    @Override
    void setTitle(String s){
        this.title = "The title is: " + s;
    }
}
public class JavaAbstractClass {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MyBook mb = new MyBook();
        while(true){
            String s = br.readLine();
            mb.setTitle(s);
            System.out.println(mb.title);
        }
    }
}
