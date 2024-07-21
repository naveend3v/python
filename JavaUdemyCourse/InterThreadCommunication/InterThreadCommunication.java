package code.JavaUdemyCourse.InterThreadCommunication;

class Data {
    int value;
    boolean flag = true;
    synchronized public void set(int input){
        while(flag!=true)
            try {wait();} catch(Exception e){}
        flag = false;
        value = input;
        try {Thread.sleep(100);} catch(Exception e){}
        notify();
    }
    synchronized public int get(){
        while (flag!=false)
            try {wait();} catch(Exception e){}

        int x;
        x=value;
        try {Thread.sleep(100);} catch(Exception e){}
        flag = true;
        notify();
        return x;
    }
}
class Producer extends Thread{
    Data d;
    public Producer(Data d){
        this.d=d;
    }
    @Override
    public void run(){
        int count=0;
        while(true){
            d.set(count);
            System.out.println("Producer " + count);
            count++;
        }
    }
}
class Consumer extends Thread{
    Data d;
    public Consumer(Data d){
        this.d=d;
    }
    @Override
    public void run(){
        int value;
        while(true){
            value = d.get();
            System.out.println("Consumer "+ value);
        }
    }
}
public class InterThreadCommunication {
    public static void main(String[] args){
        Data d = new Data();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();
    }
}
