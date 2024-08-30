package code.JavaUdemyCourse.CollectionFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

class MyAccount {
    HashMap<Integer, String> a1 = new HashMap<>();

    public MyAccount() {
        try {
            FileInputStream fis = new FileInputStream("code/JavaUdemyCourse/CollectionFramework/test1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            a1 = (HashMap<Integer, String>) ois.readObject();
            System.out.println("Account opened from file!");
            ois.close();
            fis.close();
        } catch (Exception e) {
        }
    }

    public void createAccount(int i, String s) {
        a1.put(i, s);
    }

    public void viewAccounts() {
        a1.forEach((k, v) -> System.out.println(k + ". " + v));
    }

    public void saveAccount() {
        try {
            FileOutputStream fos = new FileOutputStream("code/JavaUdemyCourse/CollectionFramework/test1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a1);
            System.out.println("Account Saved!");
            oos.close();
            fos.close();
        } catch (Exception e) {
        }
    }
}

public class HashMapSerialization {
    public static void main(String[] args) throws Exception {
        MyAccount a = new MyAccount();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Amount of Accounts to be add : ");
        int b = s.nextInt();
        while(b-->0){
            int c = s.nextInt();
            s.nextLine();
            String d = s.nextLine();
            a.createAccount(c,d);
        }
        a.viewAccounts();
        a.saveAccount();
    }
}
