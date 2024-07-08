import java.io.*;
import java.util.*;

public class TryWithResources {

    static FileInputStream fi;
    static Scanner sc;

    static void divide() throws Exception {

            fi = new FileInputStream("C:\\Users\\test\\Documents\\github\\code\\Java SE Udemy course\\SampleTextFile.txt");
            sc = new Scanner(fi);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println("a = " + a + "\n" + "b = " + b);
            System.out.println("divide = " + a/b);

    }

    public static void main(String[] args) throws Exception {

        try {
            divide();
            System.out.println("d = " + sc.nextInt());
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            fi.close();
            sc.close();
        }

    }
}
