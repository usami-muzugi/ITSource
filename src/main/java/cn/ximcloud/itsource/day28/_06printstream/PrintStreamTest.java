package cn.ximcloud.itsource.day28._06printstream;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-17
 * Time: 18:47
 * ProjectName: ITSource.cn.ximcloud.itsource.day28._06printstream
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
 * 打印流测试
 *      构造方法:
 *          public PrintStream(File file) throws FileNotFoundException
 *              可以传入一个文件，抛出文件未找到异常
 *          public PrintStream(String fileName) throws FileNotFoundException
 *              可以传入一个文件名，抛出文件未找到异常
 *          public PrintStream(OutputStream out)
 *              可以传入一个输入流
 *
 *       只有输出！！
 *
 **/

public class PrintStreamTest {

    @Test
    public void printStreamFileTest() {
        PrintStream printStream = null;
        try {
            printStream = new PrintStream("D:/abc.txt");

            //输出字符串
            printStream.print("小老弟");
            //输出字符
            printStream.print('你');
            printStream.print('可');
            printStream.print('稍');
            printStream.print('稍');
            printStream.println();
            printStream.println(false);
            printStream.print(new Integer(1024));
            printStream.print(new Object());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            assert printStream != null;
            printStream.close();
        }
    }

    @Test
    public void printStreamFileNameTest() {
        PrintStream printStream = null;
        PrintWriter printWriter = null;
        try {
            printStream = new PrintStream(new File("D:/abc.txt"));

            //输出字符串
            printStream.print("小老弟");
            printStream.print('你');
            printStream.print('可');
            printStream.print('稍');
            printStream.print('稍');
            printStream.println();
            printStream.println(false);
            printStream.print(new Integer(1024));
            printStream.print(new Object());

            printWriter = new PrintWriter(new File("D:/abc.txt"));
            printWriter.print("大兄弟，泥嚎鸭");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            assert printStream != null;
            printStream.close();
            assert printWriter != null;
            printWriter.close();
        }
    }

    @Test
    public void printStreamOutputStreamTest() {

    }
}
