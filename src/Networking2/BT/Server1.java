package Networking2.BT;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.StringTokenizer;

public class Server1 {
    public static void main(String[] args) throws IOException {
        int port = 6060;
        DatagramSocket datagramSocket = new DatagramSocket(port);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
        datagramSocket.receive(datagramPacket);
        String messageClient = new String(datagramPacket.getData(),0, datagramPacket.getLength());
        int number = Integer.parseInt(messageClient);



        if (number%2==0){
            System.out.println("so chan la" + number);
        }else {
            System.out.println("so le la" + number);
        }



//        System.out.println(messageClient);
//        StringTokenizer stringTokenizer = new StringTokenizer(messageClient);
//        while (stringTokenizer.hasMoreTokens()){
//        System.out.println(stringTokenizer.nextToken());}

//        int number1 = Integer.parseInt(stringTokenizer.nextToken());
//        String operator = stringTokenizer.nextToken();
//        int number2 = Integer.parseInt(stringTokenizer.nextToken());
//int ketqua = 0;
//        switch (operator){
//            case "+" :
//              ketqua=  number1+number2 ;
//              break;
//            case  "-":
//                ketqua = number1-number2;
//                break;
//            case "*":
//                ketqua = number1*number2;
//                break;
//            case  "/":
//                ketqua = number1/number2;
//                break;
//            default:
//                System.out.println("ko co phep tinh do ");
//        }
//        System.out.println(ketqua);
    }

}
