package Learning_Java11.socket_programing;
import java.util.Scanner;
import java.io.*;
import java.net.*;

public class TcpClient {

    public static void main(String[] argv) throws Exception
    {
        String sentence;
        String modifiedSentence;
        Scanner inFromUser = new Scanner(System.in);

        Socket clientSocket = new Socket("localhost", 6789); 

                DataOutputStream outToServer =
                new DataOutputStream(clientSocket.getOutputStream());


        BufferedReader inFromServer =
                new BufferedReader(new
                        InputStreamReader(clientSocket.getInputStream()));
        //sentence = inFromUser.readLine();



      //  outToServer.writeUTF(sentence + '\n');

               // System.out.println("FROM SERVER: " + inFromServer.readUTF());

        clientSocket.close();

    }
} 
