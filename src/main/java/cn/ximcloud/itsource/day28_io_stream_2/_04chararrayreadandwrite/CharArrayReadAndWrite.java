package cn.ximcloud.itsource.day28_io_stream_2._04chararrayreadandwrite;

import org.junit.Test;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-17
 * Time: 10:36
 * ProjectName: ITSource.cn.ximcloud.itsource.day28_io_stream_2._04chararrayreadandwrite
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
 * 内存流之字符数组
 * 构造方法:    public CharArrayWriter(int initialSize)
 * 自定义初始化容量
 * public CharArrayWriter()
 * 写入方法:
 * write(char c)   可以直接写入一个字符
 * write(String str) 可以直接写入一个字符串
 * write(char[] chars) 可以直接写入一个字符数组
 **/

public class CharArrayReadAndWrite {

    @Test
    public void charArrayReadAndWriteAllTest() throws IOException {
        //创建字符输出内存流
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        //写入
        for (int i = 0; i < 100; i++) {
            charArrayWriter.write((i + ""));    //write(String s)
        }
        charArrayWriter.write("???");
        charArrayWriter.write(new char[]{1, 2, 3, 4, 5,});
        charArrayWriter.write(65);  //写入int表示写入的是其对应的阿斯克码的char
        charArrayWriter.write('6'); //write(char c)
        charArrayWriter.write('6');
        charArrayWriter.write('啥'); //write(char 中文)
        //追加
        charArrayWriter.append('6');    //append(char c)
        //刷新
        charArrayWriter.flush();
        //关闭
        charArrayWriter.close();

        //toCharArray
        char[] chars = charArrayWriter.toCharArray();

        //创建新字符输入内存流
        CharArrayReader charArrayReader = new CharArrayReader(chars);

        //读取
        char[] c = new char[1024];

        //长度
        int read;
        try {
            while ((read = charArrayReader.read(c)) != -1) {
                System.out.println(new String(c, 0, read));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
