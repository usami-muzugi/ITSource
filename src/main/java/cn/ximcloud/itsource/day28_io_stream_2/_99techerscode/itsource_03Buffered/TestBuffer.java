package cn.ximcloud.itsource.day28_io_stream_2._99techerscode.itsource_03Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBuffer {
    /*
     * 缓冲流    :  主要是用来包装其他的流,已达到高效读写的目的
     *  BufferedInputStream
        BufferedOutputStream
        BufferedReader
        BufferedWriter
     *
     *
     *
     *
     * */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("H:/b/13.avi");
        BufferedInputStream bis = new BufferedInputStream(fis);//把一个字节输入流包装成了一个缓冲流[非常常用]
        long start = System.currentTimeMillis();
        byte[] b = new byte[1024];
        int len;
        while ((len = fis.read(b)) != -1) {
            //System.out.println(new String(b,0,len));
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        //bis =
    }

}
