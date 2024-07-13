// Below class will be example for static member and methods
class OuterClass1{
    // Static member
    static int x = 10;
    int y = 20;

    // Common methods can access normal and static variables
    public void display1(){
        System.out.println(x+" "+y);
    }

    // Static Method only access static variables
    public static void display2(){
        System.out.println(x);
    }
}

// Below class is example for static blocks.
// Static blocks are execute automatically when class is loaded
class OuterClass2{
    static int a = 100;
    static{
        System.out.println("Testing static block 1");
    }

    static{
        System.out.println("Testing static block 2");
    }

}
public class StaticMember {
    public static void main(String[] args){
        OuterClass1 oc1 = new OuterClass1();
        oc1.x=50; // Changing static variable value to check if its changing "oc2" reference
        oc1.y=10;
        oc1.display1();

        OuterClass1 oc2 = new OuterClass1();
        oc2.display1();

        // Creating class to check the Static Block execution
        OuterClass2 oc3 = new OuterClass2();
    }
}
