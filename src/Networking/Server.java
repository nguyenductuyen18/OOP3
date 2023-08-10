package Networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 9999;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("dang ket noi voi Client...!");

        Socket socket = serverSocket.accept();
        System.out.println("ket noi thanh cong...^^");

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());


        int sum = dataInputStream.read()+dataInputStream.read();
        System.out.println("tong la: " + sum);

        dataOutputStream.write(sum);
        socket.close();
        serverSocket.close();
//        byte[] bytes = new byte[1024];
//        int bytesRead = inputStream.read(bytes)+inputStream.read(bytes);
//        String message = new String(bytes, 0, bytesRead);
//        System.out.println(message);
//        int number = Integer.parseInt(message);
//        int numbe = 0;
//        while (number!=0){
//            numbe+=number;
//        }
//        OutputStream outputStream = socket1.getOutputStream();
//            String mesageServer;
//            mesageServer = "ko phai so nguyen to" +numbe;
//            outputStream.write(mesageServer.getBytes());

//        if (number < 2) {
//            OutputStream outputStream = socket1.getOutputStream();
//            String mesageServer;
//            mesageServer = "ko phai so nguyen to" ;
//            outputStream.write(mesageServer.getBytes());
//        }
//        // check so nguyen to khi n >= 2
//        int squareRoot = (int) Math.sqrt(number);
//        for (int i = 2; i <= squareRoot; i++) {
//            if (number % i == 0) {
//                OutputStream outputStream = socket1.getOutputStream();
//                String mesageServer;
//                mesageServer = "ko phai so nguyen to" ;
//                outputStream.write(mesageServer.getBytes());
//            }
//        }
//        OutputStream outputStream = socket1.getOutputStream();
//        String mesageServer;
//        mesageServer = "so nguyen to" +number;
//        outputStream.write(mesageServer.getBytes());
//        if (number % 2 == 0) {
//            OutputStream outputStream = socket1.getOutputStream();
//            String mesageServer;
//            mesageServer = "la so chan" ;
//            outputStream.write(mesageServer.getBytes());
//
//        } else {
//            OutputStream outputStream = socket1.getOutputStream();
//            String mesageServer;
//            mesageServer = "la so le" ;
//            outputStream.write(mesageServer.getBytes());
//        }


    }

}
