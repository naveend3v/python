// https://www.hackerrank.com/challenges/java-sort/problem
//  Java Sort
/*
https://docs.oracle.com/javase/tutorial/collections/interfaces/order.html
https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
 */

import java.util.Scanner;
import java.util.*;

class Student {
    public int id;
    public String fname;
    public double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

}
class StudentSolution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        List<Student> studentList = new ArrayList<Student>();
        while (testCases-- > 0) {
            int id = s.nextInt();
            String fname = s.next();
            double cgpa = s.nextDouble();
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
        }

        // Comparator to sort students in the list based on
        // 1) students with higher CGPA
        // 2) if students have same CGPA then sort by Fname
        // 3) if students with same CGPA and Fname then sort by ID

        Collections.sort(studentList, Comparator.comparing(Student :: getCgpa).reversed()
                .thenComparing(Student :: getFname).thenComparing(Student :: getId));

        for (Student student: studentList) {
            System.out.println(student.getFname());
        }
    }
}