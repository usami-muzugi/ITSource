package cn.ximcloud.itsource.day1_day47.day27_io_stream_in_and_output_stream._05filereader;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-15
 * Time: 15:36
 * ProjectName: ITSource.cn.ximcloud.itsource.day1_day47.day27_io_stream_in_and_output_stream._05filereader
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * //                          _ooOoo_                               //
 * //                         o8888888o                              //
 * //                         88" . "88                              //
 * //                         (| ^_^ |)                              //
 * //                         O\  =  /O                              //
 * //                      ____/`---'\____                           //
 * //                    .'  \\|     |//  `.                         //
 * //                   /  \\|||  :  |||//  \                        //
 * //                  /  _||||| -:- |||||-  \                       //
 * //                  |   | \\\  -  /// |   |                       //
 * //                  | \_|  ''\---/''  |   |                       //
 * //                  \  .-\__  `-`  ___/-. /                       //
 * //                ___`. .'  /--.--\  `. . ___                     //
 * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
 * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
 * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
 * //      ========`-.____`-.___\_____/___.-`____.-'========         //
 * //                           `=---='                              //
 * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 * FileReader 测试
 * FileReader不同于FilInputStream的是，FileReader返回的是char类型的值或者是char[]类型的数组
 * <p>
 * 构造方法:
 * FileReader(String fileName)
 * 参数列表传递一个String类型的文件名，关联文件创建FileReader对象
 * FileReader(File file)
 * 参数列表传递一个File类型的文件名，关联该文件并创建FileReader对象
 * 方法:
 * read()无参    返回值为当前读取的字符的字节，int返回，-1为读取到末尾
 * read(char[] chars)  返回值为当前读取的字符的长度，并将读取的字符字节写入char[] 。int返回，-1为读取到末尾。
 **/

public class FileReadeerTest {

    /**
     * 通过每次读取一个字节来进行操作
     * 读取操作read()无参，返回为该字节的int类型值
     *
     * @throws IOException 抛出文件未找到异常
     */
    public void fileReadTest() throws IOException {
        File file = new File("D:/新建文本文档.txt");
        FileReader fileReader = new FileReader(file);   //构造方法可以传递一个File类型的对象
        //FileReader fileWriter = new FileReader(new File("D:/新建文本文档2.txt")); //也可以传递一个String类型的常量
        int read;   //设置读取的字节的阿斯克码
        StringBuffer stringBuffer = new StringBuffer("[");
        while ((read = fileReader.read()) != -1) {      //读取每一次返回值都是read
            stringBuffer.append((char) read + " ");
        }
        stringBuffer.append("]");
        char[] chars = stringBuffer.toString().toCharArray();
        byte[] bytes = new byte[chars.length];
        for (int i = 0; i < chars.length; i++) {
            bytes[i] = (byte) chars[i];
        }
        fileReader.close();
        System.out.println(new String(bytes, "GBK"));

    }

    @Test
    public void test1() throws IOException {
        fileReadTest();
    }


    /**
     * 使用正确方式处理流，try...finally
     * 使用方法read(char[] chars)，返回值还是为当前次数，读取的字节数据的长度。
     * char类包含本次写入的数据，使用new String(char[],int offset,length)进行操作
     * 传递该char[]类型数组，设置偏移量为0，长度为length
     */
    public void fileReadTestTwo() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("D:/新建文本文档.txt");
            char[] chars = new char[1024];
            int length;
            while ((length = fileReader.read(chars)) != -1) {
                System.out.println(new String(chars, 0, length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fileReader != null;
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() {
        fileReadTestTwo();
    }
}
