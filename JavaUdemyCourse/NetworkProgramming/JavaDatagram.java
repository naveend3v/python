package code.JavaUdemyCourse.NetworkProgramming;

import java.net.*;

public class JavaDatagram {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(2001);
        String msg = "Hello World";
        // Sending msg to server
        DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2000);
        ds.send(dp);
        // Receiving msg to server
        byte[] b = new byte[1024];
        dp=new DatagramPacket(b,1024);
        ds.receive(dp);
        msg = new String(dp.getData());
        System.out.println("From Server: " + msg);
        ds.close();
    }
}

class JavaDatagramServer {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(2000);
        String msg;
        // Receiving data from client
        DatagramPacket dp;
        byte[] b = new byte[1024];
        dp=new DatagramPacket(b,1024);
        ds.receive(dp);

        msg = new String(dp.getData()).trim();
        System.out.println("From Client: " + msg);
        StringBuilder sb =  new StringBuilder(msg);
        sb.reverse();
        msg = sb.toString();

        dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2001);
        ds.send(dp);
        ds.close();
    }
}