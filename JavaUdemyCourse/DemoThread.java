public class DemoThread extends Thread {
    @Override
    public void run(){
        int i = 0;
        while(i<100) {
            System.out.println(i + " Hello");
            i++;
        }
    }
    public static void main(String[] args){
        DemoThread t = new DemoThread();
        t.start();

        int i = 0;
        while(i<100) {
            System.out.println(i + " World");
            i++;
        }
    }
}
