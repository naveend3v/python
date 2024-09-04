package code.JavaUdemyCourse.NetworkProgramming;

import java.net.*;
import java.io.*;

public class JavaReverseEcho extends Thread {
    Socket stk;
    public JavaReverseEcho(Socket st){
        stk = st;
    }
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());
            String msg;
            StringBuilder sb;
            do {
                msg = br.readLine();
                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();
                ps.println(msg);
            } while (!msg.equals("dne"));
            stk.close();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        Socket stk;
        JavaReverseEcho re;
        int count = 1;
        do {
            stk = ss.accept();
            System.out.println("Client Connected: " + count++);
            re = new JavaReverseEcho(stk);
            re.start();
        } while(true);

    }
}

class client {
    public static void main(String[] args) throws Exception {
        Socket stk = new Socket("localhost", 2000);
        BufferedReader keybd = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        String msg;
        do {
            msg = keybd.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("From Server : " + msg);
        } while (!msg.equals("dne"));
        stk.close();
    }
}