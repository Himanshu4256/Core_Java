package Learning_Java11.socket_programing;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class UDPClient {
    public static void main(String[] args) throws Exception
    {
        //User Input
        BufferedReader  inFromUser = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Msg to Send");
        String sentence = inFromUser.readLine();

        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAdderss = InetAddress.getByName("localhost");
        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];

        sendData = sentence.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,IPAdderss,9876);
        clientSocket.send(sendPacket);
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);
        String modifiedSentence = new String(receivePacket.getData());
        System.out.println("From Server : "+modifiedSentence);
        clientSocket.close();
    }
}
