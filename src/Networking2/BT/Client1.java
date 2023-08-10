package Networking2.BT;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws IOException {
        int port = 6060;
        String IP = "127.0.0.1";
        DatagramSocket datagramSocket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhapgiatri 1 va 2 ");
        System.out.println("number  ");
        String message = scanner.nextLine();
        byte[] bytes =message.getBytes();
        InetAddress inetAddress = InetAddress.getByName(IP);
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,inetAddress,port);
        datagramSocket.send(datagramPacket);
    }

}
