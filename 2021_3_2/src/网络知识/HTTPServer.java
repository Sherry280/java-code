package 网络知识;

import 复习.RequestResponseTask11;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HTTPServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            Socket socket = serverSocket.accept();

            Runnable task = new RequestResponseTask11(socket);
            new Thread(task).start();
        }
    }
}
