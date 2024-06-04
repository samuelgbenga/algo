package week_7.casswork.task.utils;

import java.io.*;
import java.net.Socket;
import java.nio.Buffer;

import static week_7.casswork.task.common.SimpleServer.HTML_FILE_PATH;
import static week_7.casswork.task.common.SimpleServer.JSON_FILE_PATH;

public class HttpHandler extends Thread {

    private Socket socket;

    public HttpHandler(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        try(BufferedReader input = new BufferedReader((new InputStreamReader(socket.getInputStream())));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {

            //This will help us read the client HTTP request lin by line from the inputStream
            String request = input.readLine();

            if(request != null){
                String[] parts = request.split("\\s+");
                if(parts.length >= 2 && parts[0].equals("GET")){
                    String path = parts[1];
                    if(path.equals("/")||path.equals("/index.html")){
                        sendNewHtmlResponse(output);
                    }else if(path.equals("/json")){
                        sendNewJsonResponse(output);
                    }else{
                        sendNewNotFoundResponse(output);
                    }
                }
            }



        }catch (Exception e){
            new RuntimeException(e);
        }
    }

    private void sendNewNotFoundResponse(PrintWriter output) {
        output.println("HTTP/1.1 404 Not Found");
        output.println("content-type: text/plain");
        output.println();
        output.println("404 Not Found - The requested resource was not found on " +
                "this: ");
    }



    private void sendNewJsonResponse(PrintWriter output) {

        File file = new File(JSON_FILE_PATH);

        if(file.exists()){
            sendResponse(output, file, "application/json");
        }else{
            sendNewNotFoundResponse(output);
        }
    }

    private void sendNewHtmlResponse(PrintWriter output) {
        File file = new File(HTML_FILE_PATH);

        if(file.exists()){
            sendResponse(output, file, "text/html");
        }else{
            sendNewNotFoundResponse(output);
        }

    }

    //
    private void sendResponse(PrintWriter output, File file, String contentType) {
        output.println("HTTP/1.1 200 OK");
        output.println("Content-Type: "+ contentType);
        output.println();

        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = reader.readLine()) != null){
                output.println(line);
                System.out.println(line);
            }
        }catch (Exception e){
            throw new RuntimeException();
        }
    }
}
