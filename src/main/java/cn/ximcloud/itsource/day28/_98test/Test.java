package cn.ximcloud.itsource.day28._98test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-17
 * Time: 21:55
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
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
 * //         佛祖保佑          永无BUG          永不修改             //
 * ////////////////////////////////////////////////////////////////////
 * 测试为什么输入一个1，会执行两边，就是这个原因，read是读取的一个字符，回车符号也是一个符号，会读取出来的。所以这里是执行了两次
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;//1.将打印流对象赋值给out
        int temp;
        while ((temp = in.read()) != -1) {

            System.out.println(temp);
        }
//        Scanner scanner = new Scanner(in);
//        while (scanner.hasNext()) {
//            int next = scanner.nextInt();
//            System.out.println(next);
//        }


//
//        try {
//            byte[] bytes = new byte[1024];
//            int length;
//            while ((length = in.read(bytes)) != -1) {
//                System.out.println(new String(bytes, 0, length));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        while (true) {  //2.进入循环    6.由于是死循环，继续执行   10.继续执行
//            try {
//                System.out.println("输入要打印的值");  //3.打印      7.继续打印  11.继续打印
//                int read = in.read();                 //4.等待输入   8.读取in流的下一个int，然后将指针指向下一个  12.由于in流没有下一个要打印的值了，等待输入。 输入后，跳转到5
//                System.out.println(read);             //5.输入完成，打印当前读取的in流的一个int97，然后将指针指向下一个  9.打印当前读取的in流的回车符，然后将指针指向下一个，
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }


    }

//            try {
//        byte[] bytes = new byte[1024];
//        int length;
//        while ((length = in.read(bytes)) != -1) {
//            System.out.println(new String(bytes, 0, length));
//        }
//    } catch (IOException e) {
//        e.printStackTrace();
//    }

}
