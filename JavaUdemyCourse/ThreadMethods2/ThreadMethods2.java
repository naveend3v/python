package code.JavaUdemyCourse.ThreadMethods2;

class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
    }
    public void run(){
        int count = 0;
        while(count<150) {
            System.out.println(count + " My Thread 1");
            count++;
        }
    }
}

class ThreadMethods2 {
    public static void main(String[] args) throws Exception {
        MyThread1 t1 = new MyThread1("MyThread-1");
        t1.setDaemon(true);
        t1.start();

        // Below code is used to check the yield method, so main thread will wait and provide execution time for other threads
//        int count = 0;
//        while(true) {
//            System.out.println(count + " Main Thread 1");
//            count++;
//            Thread.yield();
//        }


        // Below code to check for join method so main thread will wait for all other threads to finish
        Thread MainThread = Thread.currentThread();
        MainThread.join();


        // Below code to check for Daemon Threading running or not by delaying the main thread execution
//        try{Thread.sleep(100);}catch(Exception e){}
    }
}
