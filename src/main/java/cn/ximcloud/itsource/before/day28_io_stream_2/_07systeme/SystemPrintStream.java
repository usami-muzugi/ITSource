package cn.ximcloud.itsource.before.day28_io_stream_2._07systeme;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-17
 * Time: 11:48
 * ProjectName: ITSource.cn.ximcloud.itsource.before.day28_io_stream_2._07systeme
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
 * i. System.out  是一个特殊的 PrintStreamTest “标准”输出流 ： 输出结果到控制台
 * ii.System.err  是一个特殊的 PrintStreamTest "标准"错误输出流 : 输出到控制台，在Eclipse中显示红色的
 * iii.System.in  是一个特殊的InputStream "标准"输入流 ： 数据源来至控制台输入
 **/

public class SystemPrintStream {
    public static void main(String[] args) throws IOException {
        //标准输出流
        System.out.println("标准输出流:");
        InputStream in = System.in;
        int read = in.read();
        System.out.println("A:" + read);
        if (read == 65) {
            System.out.println(read);
        }

        //标准输入流
        System.out.println("123456");
        PrintStream out = System.out;
        out.print(1);
        out.print(false);
        out.print(1);
        out.print("小老弟");

        //标准输入流重定向
        System.setOut(new PrintStream(new File("D:/abc.txt")));
        PrintStream out1 = System.out;
        out1.println(1);
        out1.println(false);
        out1.println(1);
        out1.println("小老弟");


        //标准错误流
        System.err.println("123456");
        PrintStream err = System.err;

        err.println("你可稍稍完后站");

        System.setErr(new PrintStream(new File("D:/abc.txt")));
        err = System.err;
        err.println("你可稍稍往后站");
        err.println("你可稍稍往后站");
        err.println("你可稍稍往后站");
        err.println("你可稍稍往后站");

    }

}
