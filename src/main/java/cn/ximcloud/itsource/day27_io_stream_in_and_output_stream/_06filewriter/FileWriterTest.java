package cn.ximcloud.itsource.day27_io_stream_in_and_output_stream._06filewriter;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-16
 * Time: 11:21
 * ProjectName: ITSource.cn.ximcloud.itsource.day27_io_stream_in_and_output_stream._06filewriter
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
 * FileWrite    测试
 * 构造方法:
 * FileWriter(String fileName)
 * 根据给定的文件名构造一个 FileWriter 对象。
 * FileWriter(File file)
 * 根据给定的 File 对象构造一个 FileWriter 对象。
 * FileWriter(String fileName, boolean append)
 * 根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。
 * FileWriter(File file, boolean append)
 * 根据给定的 File 对象构造一个 FileWriter 对象。
 * 查找写入的方法,写入文件数据
 * 1.字符流写入数据的时候,如果不刷新,或者关闭流资源,其实数据是存在于内存中
 * 刷新:   将内存中的数据存入磁盘 :好处,多次写数据都会在内存中,最后一次刷新的时候才存入磁盘
 * 2.刷新不能与关闭流
 * 刷新操作,流资源还可以继续使用
 * 关闭操作:自动刷新一次,但是流资源不能再使用了
 * 注意:其实所有的流资源使用,都应该关闭流
 **/

public class FileWriterTest {


    public void fileWrite() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("D:/新建文本文档.txt");
            fileWriter.write("可以写入一个字符串");
            fileWriter.write('A');
            //fileWriter.write(new char[]{1, 2, 3, 4});//这个不是把1，2，3，4写进去而是(char)1写入的这个
            fileWriter.write(new char[]{(char) 64, (char) 65, (char) 66, (char) 67, (char) 68});
            //正确写入字符的操作
            fileWriter.write(new char[]{'F', '2', 'C', 'C', 'A'});
            //正确写入字符串的操作
            fileWriter.write("卢本伟牛逼".toCharArray());
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void fiWriteTest() {
        fileWrite();
    }

}
