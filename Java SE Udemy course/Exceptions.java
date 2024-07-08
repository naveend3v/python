class Test1Exception extends Exception{
    @Override
    public String toString(){
        return "Example for Exception";
    }
}
class Exceptions {

    static void func1(){
       try{
           throw new Test1Exception();
//           System.out.println(10/0);
       }
       catch (Test1Exception e){
           System.out.println(e);
       }
    }

    static void func2(){
        func1();
    }

    static void func3(){
        func2();
    }

    public static void main(String[] args){
        func3();
    }
}