package Networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 9999;
        ServerSocket socket = new ServerSocket(port);
        Socket socket1 = socket.accept();
        InputStream inputStream = socket1.getInputStream();
        byte[] bytes = new byte[1024];
        int bytesRead = inputStream.read(bytes);
        String message = new String(bytes,0,bytesRead);
        System.out.println(message);



//        String IP = inputStream.
    }

}
