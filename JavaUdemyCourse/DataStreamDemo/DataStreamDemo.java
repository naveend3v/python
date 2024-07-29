package code.JavaUdemyCourse.DataStreamDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class Bank {
    String bankName;
    String ifcCode;
    String micrCode;
    int noOfBankAccounts;
    boolean atmAvailability;
}

public class DataStreamDemo {
    public static void main(String[] args) throws Exception{
/*      // Below code for write data in file
        FileOutputStream fos = new FileOutputStream("code/JavaUdemyCourse/DataStreamDemo/bank.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        Bank b = new Bank();
        b.bankName = "SBI"; b.ifcCode = "IFSC12345"; b.micrCode = "MICR12345";
        b.noOfBankAccounts = 5000; b.atmAvailability = false;
        dos.writeUTF(b.bankName);
        dos.writeUTF(b.ifcCode);
        dos.writeUTF(b.micrCode);
        dos.writeInt(b.noOfBankAccounts);
        dos.writeBoolean(b.atmAvailability);
        fos.close();
        dos.close();
*/
      // Below code for reading data from file
        FileInputStream fis = new FileInputStream("code/JavaUdemyCourse/DataStreamDemo/bank.txt");
        DataInputStream dis = new DataInputStream(fis);
        Bank b = new Bank();
        b.bankName = dis.readUTF();
        b.ifcCode = dis.readUTF();
        b.micrCode = dis.readUTF();
        b.noOfBankAccounts = dis.readInt();
        b.atmAvailability = dis.readBoolean();
        System.out.println("Bank Name : " + b.bankName);
        System.out.println("MICR Code : " + b.ifcCode);
        System.out.println("IFSC Code : " + b.micrCode);
        System.out.println("No of Bank Accounts : " + b.noOfBankAccounts );
        System.out.println("ATM Facility : " + ((b.atmAvailability)? "Yes":"No"));
        fis.close();
        dis.close();
    }
}
