package code.JavaUdemyCourse.ThreadMethods1;

class MyThread1 extends Thread {
    public MyThread1(String name){
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }

    public void run(){
        try {
            int count = 0;
            while (count < 100) {
                System.out.println(count + " Hello World!!");
                count++;
                MyThread1.sleep(1000);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

}

class ThreadMethods1 {
    public static void main(String[] args){
        MyThread1 t = new MyThread1("My Thread 1");
        System.out.println("Thread State: " + t.getState());
        System.out.println("Thread Name: " + t.getName());
        System.out.println("Thread ID: " + t.getId());
        System.out.println("Thread Priority: " + t.getPriority());
        t.start();
        System.out.println("Thread State: " + t.getState());
        t.interrupt();
    }
}
