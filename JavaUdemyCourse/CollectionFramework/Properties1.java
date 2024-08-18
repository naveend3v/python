package code.JavaUdemyCourse.CollectionFramework;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.*;
public class Properties1 {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        /*
        p.setProperty("Name","Naveen");
        p.setProperty("DOB","01-01-2000");
        p.setProperty("Height","15.5");
        p.setProperty("Brith Place","USA");
        p.store(new FileOutputStream("code/JavaUdemyCourse/CollectionFramework/PersonalDetails.txt"),"Personal Details");
        */
//        p.load(new FileInputStream("code/JavaUdemyCourse/CollectionFramework/PersonalDetails.txt"));

/*
        p.setProperty("Name","Naveen");
        p.setProperty("DOB","01-01-2000");
        p.setProperty("Height","15.5");
        p.setProperty("Brith Place","USA");
        p.storeToXML(new FileOutputStream("code/JavaUdemyCourse/CollectionFramework/PersonalDetails.xml"),"Personal Details");
*/
        p.loadFromXML(new FileInputStream("code/JavaUdemyCourse/CollectionFramework/PersonalDetails.xml"));
        System.out.println(p);

    }
}
