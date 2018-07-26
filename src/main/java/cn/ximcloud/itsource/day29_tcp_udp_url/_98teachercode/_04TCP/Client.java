package cn.ximcloud.itsource.day29_tcp_udp_url._98teachercode._04TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket socket = new Socket("localhost", 9999);
        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);
        ps.write("下面减震的时刻".getBytes());

    }

}
