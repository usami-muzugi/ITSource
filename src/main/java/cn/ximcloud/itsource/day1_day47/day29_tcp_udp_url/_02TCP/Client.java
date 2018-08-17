package cn.ximcloud.itsource.day1_day47.day29_tcp_udp_url._02TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] args) throws UnknownHostException, IOException {
        //建立TCP连接，需要创建套接字，其实本质上也是创建一个套接字对象
        //连接端需要指定localhost主机和端口号
        Socket socket = new Socket("localhost", 9999);
        //获取套接字的输出流
        OutputStream os = socket.getOutputStream();
        //使用打印输出流包装
        PrintStream ps = new PrintStream(os);
        //输出String
        ps.write("新一听得到嘛?".getBytes());
        //关闭和刷新操作
        ps.flush();
        ps.close();

    }

}
