class SuperClass {
    public void display(){
        System.out.println("Displaying Super Class");
    }
}
class SubClass extends SuperClass{
    @Override
    public void display(){
        System.out.println("Displaying Sub Class");
    }
}
public class TestMethodOverriding {
    public static void main(String[] args){
        // Object with Super class
        SuperClass sc = new SuperClass();
        sc.display();

        // Object with Sub class
        SubClass subc =  new SubClass();
        subc.display();

        // Object with Sub class but Reference to Super class
        SuperClass test = new SubClass();
        test.display();
    }
}
