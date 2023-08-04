package Networking2.BT;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        int portServer = 8080;
        DatagramSocket datagramSocket = new DatagramSocket(portServer);
        while (true){
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        datagramSocket.receive(datagramPacket);
        String messageClient = new String(datagramPacket.getData(),0, datagramPacket.getLength());
        System.out.println(messageClient);


        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tin nhan toi Client");
        String messageServer = scanner.nextLine();
        byte[] bytes1 = messageServer.getBytes();
        InetAddress inetAddress = datagramPacket.getAddress();
        int portClient = datagramPacket.getPort();
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes1, bytes1.length,inetAddress,portClient);
        datagramSocket.send(datagramPacket1);
    }}

}
