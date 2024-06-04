package week_7.casswork.task.service.imp;

import week_7.casswork.task.service.Server;
import week_7.casswork.task.utils.HttpHandler;

import java.net.ServerSocket;
import java.net.Socket;

import static week_7.casswork.task.common.SimpleServer.PORT;

public class ServerImpl implements Server {
    @Override
    public void start(int port) {

        try(ServerSocket serverSocket = new ServerSocket(PORT)){

            System.out.println("Server started on Port: "+ PORT);

            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("New connection Established");

                new HttpHandler(socket).start();
            }

        }catch (Exception e){

            throw new RuntimeException(e);
        }
    }
}
