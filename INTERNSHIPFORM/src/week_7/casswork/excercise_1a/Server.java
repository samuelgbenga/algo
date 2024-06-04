package week_7.casswork.excercise_1a;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) throws IOException {
        //Create a server socket on port 1234
        ServerSocket server = new ServerSocket(8080);

        System.out.println("server waiting for client...");

        //Accept client connections
        Socket clientSocket = server.accept();

        System.out.println("client connected");

        //Read and Write from both ends
        DataInputStream input = new DataInputStream(clientSocket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String message1 = "";
        String message2 = "";

        while (!message1.equalsIgnoreCase("stop")){
            message1 = input.readUTF();
            System.out.println("CLient says: " + message1);
            message2 = br.readLine();
            outputStream.writeUTF(message2);

        }
        input.close();
        server.close();
        clientSocket.close();


    }
}

class Client {
    public static void main(String[] args) throws IOException {
        // Create a client socket and connect to the server socket on port 12345
        Socket socket = new Socket("localhost",8080);

        //Read and Write from both ends
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String message1 = "";
        String message2 = "";

        while (!message1.equalsIgnoreCase("stop")){
            message1 = br.readLine();
            outputStream.writeUTF(message1);
            message2 = input.readUTF();
            System.out.println("Server says: " + message2);
        }
        input.close();
        outputStream.close();
    }
}