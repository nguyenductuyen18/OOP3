package Networking2.BT;

import java.io.IOException;
import java.net.*;
import java.util.Arrays;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        int portServer = 8080;
        String IP = "127.0.0.1";
        DatagramSocket datagramSocket = new DatagramSocket();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap tin nhan toi Server");
            String messageClient = scanner.nextLine();
            byte[] bytes = messageClient.getBytes();
            InetAddress inetAddress = InetAddress.getByName(IP);
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, inetAddress, portServer);
            datagramSocket.send(datagramPacket);
            if("exit".equalsIgnoreCase(messageClient)){
                datagramSocket.close();
            }



            byte[] bytes1 = new byte[1024];
            DatagramPacket datagramPacket1 = new DatagramPacket(bytes1, bytes.length);
            datagramSocket.receive(datagramPacket1);
            String messageServer = new String(datagramPacket1.getData(), 0, datagramPacket1.getLength());
            System.out.println(messageServer);
        }
    }
}
