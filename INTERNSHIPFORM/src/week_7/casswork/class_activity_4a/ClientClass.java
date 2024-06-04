package week_7.casswork.class_activity_4a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientClass {

    public static void main(String[] args) throws IOException {



        Socket client = new Socket("localhost",3000);

        PrintWriter output = new PrintWriter(client.getOutputStream(), true);
        BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));



        output.println("hello from client");

        String line = input.readLine();
        System.out.println("Response from server: "+ line);

        input.close();
        output.close();
        client.close();
    }
}
class Server{
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(3000);


        System.out.println("server waiting for client....");

        Socket socket = server.accept();

        System.out.println("client is connected");

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);


        System.out.println(input.readLine());

        output.println("hello from server");

        input.close();
        output.close();
        socket.close();
        server.close();
    }
}