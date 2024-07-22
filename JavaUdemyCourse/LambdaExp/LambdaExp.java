package code.JavaUdemyCourse.LambdaExp;

interface MyLambda {
    public void display(String s);
//    public void display();
}

/*
class CaptureLambda {
    int temp = 0;

    public void show() {
        MyLambda ml = () -> {
            System.out.println(temp + " - Hello Naveen!");
        };
        temp++;
        ml.display();
    }
}
*/

class MethodReference{
    public void revStr1(String s){
        StringBuffer s1 = new StringBuffer(s);
        s1.reverse();
        System.out.println(s1);
    }
    public static void revStr2(String s){
        StringBuffer s1 = new StringBuffer(s);
        s1.reverse();
        System.out.println(s1);
    }
}

public class LambdaExp {
    public static void main(String[] args) {
/*
        // Creating Anonymous class
        MyLambda ml = new MyLambda() {
            public void display() {
                System.out.println("Hello Naveen");
            }
        };
*/

/*
        // Lambda Expression
        MyLambda ml = ()->{System.out.println("Hello Naveen!");};
        ml.display();
*/

/*
        // Lambda Expression with Parameters
        MyLambda ml = (s)->{System.out.println(s);};
        ml.display("Hello Naveen!");
*/

/*      // Capture in Lambda Expression
        CaptureLambda cl = new CaptureLambda();
        cl.show();*/

/*      // Method Reference
        // non-static method we have to create new object and provide reference to that object.
        MethodReference mr = new MethodReference();
        MyLambda ml = mr::revStr1;
        ml.display("Hello Naveen!");
*/
        // Method Reference
        //Static method we can directly assign
        MyLambda ml = MethodReference::revStr2;
        ml.display("Hello Naveen!");
    }
}

