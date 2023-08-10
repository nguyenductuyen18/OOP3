package Networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverIP = "127.0.0.1";
        int port = 9999;

        Socket socket = new Socket(serverIP, port);

        Scanner scanner = new Scanner(System.in);
        OutputStream outputStream = socket.getOutputStream();
        System.out.println("nhap number1");
        int number1 = scanner.nextInt();
        System.out.println("nhap number2");
        int number2 = scanner.nextInt();
//        String message = "hello server";
        outputStream.write(number1);
        outputStream.write(number2);

        socket.close();
//        InputStream inputStream = socket.getInputStream();
//        byte[] bytes = new byte[1024];
//        int bytesRead = inputStream.read(bytes);
//        String message = new String(bytes,0,bytesRead);
//        System.out.println(message);
//        ServerSocket socket1 = new ServerSocket(port);
//        Socket socket2 = socket1.accept();
//
//        InputStream inputStream = socket2.getInputStream();
//        byte[] bytes = new byte[1024];
//        int bytesRead = inputStream.read(bytes);
//        String messagerClient = new String(bytes,0,bytesRead);
//        System.out.println(messagerClient);

    }
}
