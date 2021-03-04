package 网络知识;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8080);

        while(true){
            Socket socket=serverSocket.accept();
            System.out.println("已经有一条TCP已经建立连接");
            InputStream inputStream=socket.getInputStream();
            Scanner scanner=new Scanner(inputStream,"UTF-8");
            String line=scanner.nextLine();
            System.out.println(line);

            OutputStream outputStream=socket.getOutputStream();
            Writer writer=new OutputStreamWriter(outputStream,"UTF-8");
            PrintWriter printWriter=new PrintWriter(writer);
            printWriter.printf("今天的项目很难！");
            printWriter.flush();

            socket.close();


        }

    }
}
