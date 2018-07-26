package cn.ximcloud.itsource.day28_io_stream_2._99techerscode.itsource_04Print;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestPrint {
    /*
     * 打印流 ,只有输出
     * ii. PrintStreamTest   字节打印流
       iii.PrintWriter    字符打印流
     *
     * */
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("H:/b/ba.txt");
        ps.println("真的很牛");
        ps.println('1');
        ps.println(true);
        ps.println(50);
        ps.println(3.14);
        ps.println(new Object());//保存的是地址值,不好!存一个对象到文件中[]
        ps.close();
        PrintWriter pw = new PrintWriter("H:/b/ab.txt");
    }

}
