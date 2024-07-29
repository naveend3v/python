package code.JavaUdemyCourse.SC_Serialization;

import java.io.*;

class FloatData  {
    float[] flist;

    public FloatData(float[] flist) {
        this.flist = flist;
    }

    public void dataWrite(String filePath) throws Exception {
        FileOutputStream fos = new FileOutputStream(filePath);
        DataOutputStream dos = new DataOutputStream(fos);
        System.out.println("Float data write started.");
        System.out.println("Total values going to write : " + flist.length);
        dos.writeInt(flist.length);
        for (float f : flist) {
            dos.writeFloat(f);
        }
        System.out.println("Float data write completed!");
        fos.close();
        dos.close();
    }

    public void dataRead(String filePath) throws Exception {
        FileInputStream fis = new FileInputStream(filePath);
        DataInputStream dis = new DataInputStream(fis);
        System.out.println("Float data read started.");
        int i = 0;
        int totalValues = dis.readInt();
        System.out.println("Total values going to read : " + totalValues);
        while (i < totalValues) {
            System.out.println(i + " value : " + dis.readFloat());
            i++;
        }
        fis.close();
        dis.close();
    }
}

class Customer implements Serializable {
    public String custID;
    public String custName;
    public String phoneNo;
    static int count = 1;

    public Customer(String cName, String pNo){
        this.custID = "C" + Integer.toString(count++);
        this.custName = cName;
        this.phoneNo = pNo;
    }

    @Override
    public String toString() {
        return "Customer ID : " + custID + "\n" +
               "Customer Name : " + custName + "\n" +
               "Phone Number : " + phoneNo + "\n";

    }
}
public class SC_Serialization {
    public static void main(String[] args) throws Exception {
/*
        FloatData fd = new FloatData(new float[]{5.5f, 15.5f, 25.5f, 35.5f, 45.5f, 55.5f});
        try {
            fd.dataWrite("code/JavaUdemyCourse/SC_Serialization/Data.txt");
            fd.dataRead("code/JavaUdemyCourse/SC_Serialization/Data.txt");
        } catch (Exception e) {
            System.out.println(e);
        }
*/
/*
        Customer c1 = new Customer("Naveen","12345");
        Customer c2 = new Customer("Ravi","54321");
        Customer c3 = new Customer("Ramesh","654646");
        Customer c4 = new Customer("Dinesh","4949494");

        Customer[] clist = {c1,c2,c3,c4};

        FileOutputStream fos = new FileOutputStream("code/JavaUdemyCourse/SC_Serialization/customer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeInt(clist.length);
        for(Customer c : clist){
            oos.writeObject(c);
        }
        fos.close();
        oos.close();
*/

        FileInputStream fis = new FileInputStream("code/JavaUdemyCourse/SC_Serialization/customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int customerCount = ois.readInt();

        for(int i=0;i<customerCount;i++){
            System.out.println((Customer)ois.readObject());
        }

        fis.close();
        ois.close();

    }
}
