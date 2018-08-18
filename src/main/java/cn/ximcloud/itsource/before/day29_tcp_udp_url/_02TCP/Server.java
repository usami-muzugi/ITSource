package cn.ximcloud.itsource.before.day29_tcp_udp_url._02TCP;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        //服务端开启套接字是开始服务端套接字ServerSocket
        ServerSocket ssk = new ServerSocket(9999);//绑定本机端口,不需要绑定本机IP
        //开启套接字是accept()
        Socket accept = ssk.accept();
        //和socket一样，获取流是getInputStream()和getOutputStream()方法
        InputStream is = accept.getInputStream();
        //包装输入睿
        BufferedInputStream bis = new BufferedInputStream(is);
        //开始读写
        byte[] b = new byte[1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }
    }

}
