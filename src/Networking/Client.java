package Networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) throws IOException {
        int port =9999;
        String IP = "127.0.0.1";
        Socket socket = new Socket(IP,port);
        OutputStream outputStream = socket.getOutputStream();
        String message = "hello server";
        outputStream.write(message.getBytes());

        ServerSocket socket1 = new ServerSocket(port);
        Socket socket2 = socket1.accept();

        InputStream inputStream = socket2.getInputStream();
        byte[] bytes = new byte[1024];
        int bytesRead = inputStream.read(bytes);
        String messagerClient = new String(bytes,0,bytesRead);
        System.out.println(messagerClient);

    }

}
