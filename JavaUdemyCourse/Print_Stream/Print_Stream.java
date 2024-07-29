package code.JavaUdemyCourse.Print_Stream;

import java.io.*;

class Student{
    int rollNo;
    String studentName;
    String dept;
}

public class Print_Stream {
    public static void main(String[] args) throws Exception{
/*        FileOutputStream fos = new FileOutputStream("code/JavaUdemyCourse/Print_Stream/student.txt");
        PrintStream ps = new PrintStream(fos);
        Student s = new Student();
        s.rollNo = 100; s.studentName = "Naveen"; s.dept = "Civil Engineering";
        ps.println(s.rollNo);
        ps.println(s.studentName);
        ps.println(s.dept);*/

        FileInputStream fis = new FileInputStream("code/JavaUdemyCourse/Print_Stream/student.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        Student s = new Student();
        s.rollNo = Integer.parseInt(br.readLine());
        s.studentName = br.readLine();
        s.dept = br.readLine();
        System.out.println("Roll No : " + s.rollNo);
        System.out.println("Student Name : " + s.studentName);
        System.out.println("Department : " + s.dept);
        br.close();
        fis.close();

    }
}
