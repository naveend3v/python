class DemoRunnable implements Runnable {
    @Override
    public void run(){
        int i = 0;
        while(i<100) {
            System.out.println(i + " Hello");
            i++;
        }
    }
    public static void main(String[] args){
        DemoRunnable r = new DemoRunnable();
        Thread t = new Thread(r);
        t.start();
        int i = 0;
        while(i<100) {
            System.out.println(i + " World");
            i++;
        }
    }
}
