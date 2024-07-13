package code.JavaUdemyCourse.ThreadSynchronisation;
class MyData{
    synchronized public void display(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
    }
}
class MyThread1 extends Thread{
    MyData data1;
    public MyThread1(MyData data){
        this.data1 = data;
    }
    public void run(){
        data1.display(" Hello World! ");
    }
}
class MyThread2 extends Thread{
    MyData data2;
    public MyThread2(MyData data){
        this.data2 = data;
    }
    public void run(){
        data2.display( "Welcome! ");
    }
}
public class ThreadSynchronisation {
    public static void main(String[] args){
        MyData d = new MyData();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);
        t1.start();
        t2.start();
    }
}
