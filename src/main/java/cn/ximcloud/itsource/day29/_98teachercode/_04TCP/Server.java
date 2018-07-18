package cn.ximcloud.itsource.day29._98teachercode._04TCP;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket ssk = new ServerSocket(9999);//绑定本机端口
        Socket accept = ssk.accept();
        InputStream is = accept.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is);
        byte[] b = new byte[1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }
    }

}
