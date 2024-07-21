package code.JavaUdemyCourse.SC_Teacher_Student_problem;

class WhiteBoard
{
    String text;
    int numberOfStudents=0;
    int count=0;
    public void attendance()
    {
        numberOfStudents++;
    }

    synchronized public void write(String t)
    {
        System.out.println("Teacher is Writing " +t);
        try{Thread.sleep(1000);} catch (Exception e){}
        while(count!=0)
            try{wait();}catch(Exception e){}
        text=t;
        count=numberOfStudents;
        notifyAll();

    }
    synchronized public String read()
    {
        try{Thread.sleep(1000);} catch (Exception e){}
        while(count==0)
            try{wait();}catch(Exception e){}

        String t=text;
        count--;
        if(count==0)
            notify();
        return t;
    }

}
class Teacher extends Thread
{
    WhiteBoard wb;

    String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};

    public Teacher(WhiteBoard w)
    {
        wb=w;
    }

    public void run()
    {
        for(int i=0;i<notes.length;i++)
            wb.write(notes[i]);
    }

}

class Student extends Thread
{
    String name;
    WhiteBoard wb;
    public Student(String n,WhiteBoard w)
    {
        name=n;
        wb=w;
    }

    public void run()
    {
        String text;
        wb.attendance();

        do
        {
            text=wb.read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        }while(!text.equals("end"));
    }

}


public class SC_Teacher_Student_problem
{
    public static void main(String[] args)
    {
        WhiteBoard w1=new WhiteBoard();
        Teacher t=new Teacher(w1);

        Student s1 = new Student("1. Naveen", w1);
        Student s2 = new Student("2. Ravi", w1);
        Student s3 = new Student("3. Seenu", w1);

        t.start();

        s1.start();
        s2.start();
        s3.start();

    }
}
