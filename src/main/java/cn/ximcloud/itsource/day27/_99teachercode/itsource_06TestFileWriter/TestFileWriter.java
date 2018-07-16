package cn.ximcloud.itsource.day27._99teachercode.itsource_06TestFileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    /*
     * FileWriter  字符输出流
     *
            FileWriter(String fileName)
                      根据给定的文件名构造一个 FileWriter 对象。
     * 		FileWriter(File file)
                      根据给定的 File 对象构造一个 FileWriter 对象。
            FileWriter(String fileName, boolean append)
                      根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。
            FileWriter(File file, boolean append)
                      根据给定的 File 对象构造一个 FileWriter 对象。

            查找写入的方法,写入文件数据
                    1.字符流写入数据的时候,如果不刷新,或者关闭流资源,其实数据是存在于内存中
                        刷新:   将内存中的数据存入磁盘 :好处,多次写数据都会在内存中,最后一次刷新的时候才存入磁盘
                    2.刷新不能与关闭流
                        刷新操作,流资源还可以继续使用
                        关闭操作:自动刷新一次,但是流资源不能再使用了


            注意:其实所有的流资源使用,都应该关闭流


     * */
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("H:b/b.txt");
        fw.write(97);
        fw.close();
        fw.write(65);
        fw.flush();


    }

}
