package code.JavaUdemyCourse.SerializationDemo;

import java.io.*;

class Student implements Serializable {
    private int rollNo;
    private String studentName;
    private String dept;
    public static int sdata = 10;
    public transient int tdata = 20;

    public Student(){}

    public Student(int rollNo,String sname,String dept){
        this.rollNo = rollNo;
        this.studentName = sname;
        this.dept = dept;
        sdata = 500;
        tdata = 1000;
    }
    public String toString(){
        return "Roll No : " + rollNo + "\n" +
               "Student Name : " + studentName + "\n" +
               "Department : " + dept + "\n" +
               "Static Data : " + sdata + "\n" +
               "Transient Data : " + tdata;
    }

}
public class SerializationDemo {
    public static void main(String[] args) throws Exception {
/*
        // Below code is to write data in file
        FileOutputStream fos = new FileOutputStream("code/JavaUdemyCourse/SerializationDemo/student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student s = new Student(100,"Naveen","Civil Engineering");
        oos.writeObject(s);
        fos.close();
        oos.close();
*/

        // Below code is to read data from file
        FileInputStream fis = new FileInputStream("code/JavaUdemyCourse/SerializationDemo/student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s = (Student) ois.readObject();
        System.out.println(s);
        fis.close();
        ois.close();
    }
}
