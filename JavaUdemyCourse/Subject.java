class Subject {
    private String subId;
    private String subName;
    private int maxMarks,marksObtain;

    public Subject(String subId, String name, int mm, int mo){
        this.subId = subId;
        this.subName = name;
        setMaxMarks(mm);
        setMarksObtain(mo);
    }

    // Getters
    public String getSubId(){return subId;}
    public String getSubName(){return subName;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtain(){return marksObtain;}

    // Setters
    public void setMaxMarks(int mm){this.maxMarks = mm;}
    public void setMarksObtain(int mo){this.marksObtain = mo;}

    public String toString(){
        return "SubjectId: " + getSubId() + "\n" +  "SubjectName: " + getSubName() + "\n" + "MarksObtained: " + getMarksObtain() + "\n";
    }
}

class TempStudent{
    private int rollNo;
    private String studentName;
    private String dept;
    Subject subjects[];

    public TempStudent(int rn, String sn, String dept){
        this.rollNo = rn;
        this.studentName = sn;
        setDept(dept);
    }
    // Getters
    public int getRollNo(){return rollNo;}
    public String getStudentName(){return studentName;}
    public String getDept(){return dept;}

    // Setters
    public void setDept(String dept){this.dept = dept;}

    public void getSubjects() {
        for(Subject sub: subjects){
            System.out.println(sub);
        }
    }

    public void setSubjects(Subject ... x){
        this.subjects = x;
    }

    public String getTempStudent(){
        return "Roll No: " + getRollNo() + "\n" + "Student Name: " + getStudentName() + "\n" + "Department: " + getDept() + "\n";
    }
}

class StudentTest{
    public static void main(String[] args){
        TempStudent student1 = new TempStudent(1,"Naveen","Civil");
        student1.setSubjects(new Subject("s101","Fluid Mechanics",100,50),new Subject("s102","Survey Engineering",100,80));
        System.out.println(student1.getTempStudent());
        student1.getSubjects();

        TempStudent student2 = new TempStudent(2,"Gayathri","Computer Science");
        student2.setSubjects(new Subject("s101","DSA",100,80),new Subject("s102","DBMS",100,70),new Subject("s103","OOPS",100,40));
        System.out.println(student2.getTempStudent());
        student2.getSubjects();
    }
}