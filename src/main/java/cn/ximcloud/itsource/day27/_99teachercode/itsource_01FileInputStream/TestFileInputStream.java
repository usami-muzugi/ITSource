package cn.ximcloud.itsource.day27._99teachercode.itsource_01FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {
    /*
       FileInputStream(String name) 创建对象与磁盘文件建立连接
                  通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
     * FileInputStream(File file)
                 通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。

       1.现在已经建立了连接
       2.获取磁盘文件的数据 读取数据read
       3.到FileInputStream中找读取的方法
                 int read()
                          从此输入流中读取一个数据字节。
                          从关联的文件中,读取一个字节的数据
                 int read(byte[] b)
                          从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
                      返回值,表示每次读取的字节数,如果返回-1表示到达文件末尾
                 int read(byte[] b, int off, int len)
                          从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。


     * */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("H:/b/a.txt");
        //读取方式1,一个字节一个字节的读取
//		int read1 = fis.read();
//		int read2 = fis.read();
//		System.out.println((char)read1);
//		System.out.println((char)read2);
        //读取方式2,一个字节一个字节,但是用了while判断是否到达文件的末尾
//		int read;
//		while(   (read = fis.read())      !=       -1){
//			System.out.print((char)read);
//		}
        //读取方式③,将IO流中的数据,读取到给定的数组b中,一次最多读b.length
        byte[] b = new byte[5];
        int len;//表示了每次读取的字节的数量
        while ((len = fis.read(b)) != -1) {
//			System.out.println(Arrays.toString(b));
//			System.out.println(len);
            System.out.println(new String(b, 0, len));
        }
        fis.close();
    }

    /*
     * 产生乱码的原因,是因为拿到的编码值不完整,导致解码的时候,出现了乱码
     *
     * */

}
