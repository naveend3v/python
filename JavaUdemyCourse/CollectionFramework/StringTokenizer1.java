package code.JavaUdemyCourse.CollectionFramework;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.*;

public class StringTokenizer1 {

    public static void main(String[] args) throws Exception {
        // Reading data from String
        String data1 = "Brand=Coke;Flavour=BlueBerry;Price=25;Quantity=5";
        StringTokenizer stk1 = new StringTokenizer(data1, ";");
        String s1;
        while (stk1.hasMoreElements()) {
            s1 = String.valueOf(stk1.nextElement());
            System.out.println(s1);
        }
        System.out.println("_____________________________________________________________________________");
        // Reading data from File
        FileInputStream fis = new FileInputStream("code/JavaUdemyCourse/CollectionFramework/PersonalDetails.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fis.read()) != -1) {
            sb.append((char) ch);
        }
        String data2 = sb.toString();
//        System.out.println(data2);
        StringTokenizer stk2 = new StringTokenizer(data2,";");
        String s2;
        while(stk2.hasMoreElements()){
            s2 = String.valueOf(stk2.nextElement());
            System.out.println(s2);
        }
    }
}
