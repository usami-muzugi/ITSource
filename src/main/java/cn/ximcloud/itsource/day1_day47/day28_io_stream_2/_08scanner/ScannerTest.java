package cn.ximcloud.itsource.day1_day47.day28_io_stream_2._08scanner;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-17
 * Time: 14:08
 * ProjectName: ITSource.cn.ximcloud.itsource.day1_day47.day28_io_stream_2._08scanner
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
 * Scanner测试
 * Scanner主要是对文本文件进行操作
 * Scanner实现了Iteratable接口
 * 构造方法:
 * Scanner(File file)              文件对象
 * Scanner(String string)          字符串
 * scanner(PrintStream printStream)打印流
 **/

public class ScannerTest {
    /**
     * Scanner对文本进行操作
     * File对象
     */
    @Test
    public void scannerFileTest() {
        ArrayList<String> arrayList = null;
        try {
            File file = new File("D:/a.txt");   //创建一个文件
            Scanner scanner = new Scanner(file);
            arrayList = new ArrayList<>();
            while (scanner.hasNext()) {     //scanner有东西，执行下面代码
                String s = scanner.nextLine();      //读取下一行的文本，并且，将hasNext的指针指向下一行
                arrayList.add(s);   //ArrayList链表添加这一行
                System.out.println(s);  //打印一下
                //おもしろい     值得一提的是Scanner并没有remove，调用是给你返回一个不支持的操作的异常，真实！
                //scanner.remove();     java.lang.UnsupportedOperationException
                /*
                 *     /**
                 *      * The remove operation is not supported by this implementation of
                 *      * {@code Iterator}.
                 *      *
                 *      * @throws UnsupportedOperationException if this method is invoked.
                 *      * @see java.util.Iterator
                 *
                 *      public void remove () {
                 *          throw new UnsupportedOperationException();
                 *      }
                 */
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert arrayList != null;
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(arrayList);
    }

    /**
     * 使用Scanner对String进行操作
     * 使用useDelimiter()对字符串进行正则分割
     */
    @Test
    public void scnnerStringTest() {
        Scanner scanner = new Scanner("傻逼网友彭睿！");
        scanner.useDelimiter("");       //string.split("");     传入的因该是一个正则表达式，而不是随便的点啊点，✳什么的
        //scanner.useDelimiter(".");      //使用什么把字符串分开
        //public Scanner useDelimiter(String pattern) {
        String string = "*";
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }

    /**
     * Scanner可以传入打印流
     */
    @Test
    public void scannerPrintStreamTest() {
        try {
            File file = new File("D:/a.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            Scanner scanner = new Scanner(bufferedInputStream);
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
