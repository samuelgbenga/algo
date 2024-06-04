package week_7.casswork.task;

import week_7.casswork.task.service.imp.ServerImpl;

import static week_7.casswork.task.common.SimpleServer.PORT;

public class Main {

    public static void main(String[] args) {
        ServerImpl server = new ServerImpl();

        server.start(PORT);
    }
}
