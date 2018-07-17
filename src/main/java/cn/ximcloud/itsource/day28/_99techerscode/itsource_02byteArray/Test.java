package cn.ximcloud.itsource.day28._99techerscode.itsource_02byteArray;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Test {
    /*
     * 内存流:还是四大抽象流派生的,几个操作流资源的类
     *
     * 		ByteArrayInputStream
            ByteArrayOutputStream
            CharArrayReader
            CharArrayWriter
     * 为什么叫做内存流,因为,读写都在内存中
     *
     * */
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write("今天又下".getBytes());
        bos.close();//关闭之后居然还可以写,流资源是需要跟磁盘文件建立连接的,但是现在不需要,以前是关闭连接
        bos.write(65);
        byte[] byteArray = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(byteArray);

        byte[] b = new byte[1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }

        System.out.println(new String(byteArray));

    }

}
