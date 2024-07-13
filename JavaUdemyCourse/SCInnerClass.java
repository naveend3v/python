class OuterInnerClass1{
    int x = 5;

    class NestedInnerClass{
        int y = 10;
        public void show(){
            System.out.println("Nested Inner Class" + "\n");
            System.out.println("test " + (x + y + "\n"));
        }
    }
    public void display(){
        new NestedInnerClass().show();
    }
}

class OuterInnerClass2{

    int x = 5;

    public void display(){
        class LocalInnerClass{
            public void show(){
                int y = 10;
                System.out.println("Local Inner Class" + "\n");
                System.out.println("test " + (x + y) + "\n");
            }
        }
        new LocalInnerClass().show();
    }
}

interface IAnonymousInterface{
   void show();
}

class OuterInnerClass3{

    public void display(){

         new IAnonymousInterface(){
             @Override
             public void show() {
                 System.out.println("Anonymous Inner Class" + "\n");
             }
             }.show();
    }
}

class OuterInnerClass4{
    int x = 5;
    static int y = 10;

    static class StaticInnerClass{
        public void show(){
            System.out.println("Static Inner Class" + "\n");
            System.out.println("test " + y  + "\n");
        }
    }

    public void display(){
        new StaticInnerClass().show();
    }
}

public class SCInnerClass {
    public static void main(String[] args){

        // Creating Outer class 1 and access its method
        OuterInnerClass1 oc1 = new OuterInnerClass1();
        oc1.display();

        // Creating Direct Nested Inner Class using DOT notation and accessing its methods
//        OuterInnerClass1.NestedInnerClass nic = new OuterInnerClass1().new NestedInnerClass();
//        nic.show();

        // Creating Outer class 2 and access the Local Inner Class via Outer class 2 method
        OuterInnerClass2 oc2 = new OuterInnerClass2();
        oc2.display();

        // Creating Outer class 3 and access the Anonymous Inner Class via Outer class 3 method
        OuterInnerClass3 oc3 = new OuterInnerClass3();
        oc3.display();

        // Creating Outer class 4 and access the Static Inner Class via Outer class 3 method
        OuterInnerClass4 oc4 = new OuterInnerClass4();
        oc4.display();
    }
}
