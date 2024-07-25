package code.JavaUdemyCourse.Piped_IO_Stream;

import java.io.*;

class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream os) {
        this.os = os;
    }

    public void run() {
        int count = 0;
        while (true) {
            try {
                os.write(count);
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println("Producer - " + count);
            System.out.flush();
            count++;
        }
    }
}

class Consumer extends Thread {
    InputStream is;

    public Consumer(InputStream is) {
        this.is = is;
    }

    public void run() {
        int x = 0;
        while (true) {
            try {
                x = is.read();
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println("Consumer - " + x);
            System.out.flush();
        }
    }
}

public class Piped_IO_Stream {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pis.connect(pos);
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);
        p.start();
        c.start();
    }
}
