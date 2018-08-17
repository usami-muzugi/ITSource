package cn.ximcloud.itsource.day1_day47.day27_io_stream_in_and_output_stream._99teachercode.itsource_07InputStreamReader;

import java.io.*;

public class Test {
    /*
     * InputStreamReader(InputStream in)
                               创建一个使用默认字符集的 InputStreamReader。

     * 字节流转字符流,通过构造方法的方式
     *
     * OutputStreamWriter(OutputStream out)
                  创建使用默认字符编码的 OutputStreamWriter。
     *
     * ReaderInputStream  无聊!!!!!!!
     * */
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("H:/b/a.txt");
        InputStreamReader isr = new InputStreamReader(inputStream);

        FileOutputStream fos = new FileOutputStream("H:/b/a.txt");
        OutputStreamWriter oos = new OutputStreamWriter(fos);
    }

}
