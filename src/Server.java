import java.net.*;
import java.io.*;
import java.util.Locale;

public class Server {

    public static void main(String args[]) throws IOException {
        String input;
        ServerSocket serverSocket=new ServerSocket(7070);

        while(true){
            Socket clientSocket = serverSocket.accept();//Establish Connection

            BufferedReader clientInputStream = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            DataOutputStream clientOutputStream= new DataOutputStream(clientSocket.getOutputStream());

            input = clientInputStream.readLine();

            clientOutputStream.writeBytes(input.toUpperCase());
        }
    }
}
