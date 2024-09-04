package code.JavaUdemyCourse.CollectionFramework;

import java.io.*;
import java.util.*;

class Account implements Serializable {
    String accountNo;
    String accountName;
    long balance;

    public Account(String accountNo, String name) {
        this.accountNo = accountNo;
        this.accountName = name;
        this.balance = 0;
    }

    @Override
    public String toString() {
        return "Account No: " + this.accountNo + "\n" +
                "Account Name: " + this.accountName + "\n" +
                "Balance: " + this.balance + "\n";
    }
}

class AllAccounts {
    String accNo;
    int i = 1;
    HashMap<String, Account> accountsData = new HashMap<>();

    public AllAccounts() {
        try {
            FileInputStream fis = new FileInputStream("code/JavaUdemyCourse/CollectionFramework/SC_AllAccounts.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            i = ois.readInt();
            accountsData = (HashMap<String, Account>) ois.readObject();
            System.out.println("Accounts loaded from saved file!");
            fis.close();
            ois.close();
        } catch (Exception e) {
        }
    }

    public void createAccount(String AccountName) {
        accNo = "A" + i;
        Account acc = new Account(accNo, AccountName);
        accountsData.put(accNo, acc);
        System.out.println("Account Created: " + acc.accountName);
        i++;
    }

    public void deleteAccount(String AccountNo) {
        if(accountsData.containsKey(AccountNo)){
            System.out.println(accountsData.get(AccountNo).accountName +  " - Account Deleted!");
            accountsData.remove(AccountNo);
        } else {
            System.out.println("Account doesn't exist in database to delete, please create new account.");
        }
    }

    public void viewAccount(String AccountNo) {
        if(accountsData.containsKey(AccountNo)){
            System.out.println(accountsData.get(AccountNo));
        } else {
            System.out.println("Account doesn't exist in database, please create new account.");
        }
    }

    public void viewAllAccounts() {
        if (accountsData.size() == 0) {
            System.out.println("Currently no accounts were available. Please create new accounts.");
        } else {
            accountsData.forEach((k, v) -> System.out.println(v));
        }
    }

    public void saveAccounts() {
        try {
            FileOutputStream fos = new FileOutputStream("code/JavaUdemyCourse/CollectionFramework/SC_AllAccounts.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeInt(i);
            oos.writeObject(accountsData);
            System.out.println("All accounts are Saved!");
            oos.close();
            fos.close();
        } catch (Exception e) {
        }
    }
}

public class SC_MenuDrivenAccountProgram {

    public static void main(String[] args) throws Exception {
        HashMap<Integer, String> listOfOptions = new HashMap<>(Map.of(1, "Create Account", 2, "Delete Account", 3, "View Account", 4, "View All Accounts", 5, "Save Accounts", 6, "Exit"));
//        listOfOptions.forEach((k, v) -> System.out.println(k + ". " + v));
        AllAccounts aa = new AllAccounts();
        Scanner s = new Scanner(System.in);
        int a;
        while (true) {
            listOfOptions.forEach((k, v) -> System.out.println(k + ". " + v));
            System.out.print("-> Enter your Choice: ");
            try {
                a = s.nextInt();
                String name;
                String accNo;
                if (a == 1) {
                    System.out.print("-> Enter Account Name: ");
                    s.nextLine();
                    name = s.nextLine();
                    aa.createAccount(name);
                } else if (a == 2) {
                    System.out.print("-> Enter Account No: ");
                    s.nextLine();
                    accNo = s.nextLine();
                    aa.deleteAccount(accNo);
                } else if (a == 3) {
                    System.out.print("-> Enter Account No: ");
                    s.nextLine();
                    accNo = s.nextLine();
                    aa.viewAccount(accNo);
                } else if (a == 4) {
                    aa.viewAllAccounts();
                } else if (a == 5) {
                    aa.saveAccounts();
                } else if (a == 6) {
                    s.close();
                    break;
                } else {
                    System.out.println("Please enter correct choice between 1 to 6.");
                }
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
        }
    }
}