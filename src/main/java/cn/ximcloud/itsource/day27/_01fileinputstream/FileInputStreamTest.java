package cn.ximcloud.itsource.day27._01fileinputstream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-15
 * Time: 10:51
 * ProjectName: ITSource.cn.ximcloud.itsource.day27._00menu._01fileinputstream
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
 * 文件输入流测试
 **/

public class FileInputStreamTest {

    /**
     *  文件输入流测试
     * @throws IOException 抛出文件为找到异常
     */
    @Test
    public void fileIntputSteamTest() throws IOException {
        //调用FileInputStream方法关联本地文件
        FileInputStream fileInputStream = new FileInputStream("D://新建文本文档.txt");
        //局部变量初始化，用于存储输入流每一个读取操作所获得的值
        int read = 0;
        /**    每次读取一个byte的数据
         *     public int read() throws IOException {
         *         return read0();
         *
         */
        //获得每一次读取的操作的值，并赋值给read，再判断是否为-1，为-1表示文件读取到末尾。
        while ((read = fileInputStream.read()) != -1) {
            //打印该值，并强制类型转换为char类型，以字符形式表示
            System.out.print((char) read + "  ");
        }
    }

    public void fileInputStreadCNTest() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D://新建文本文档.txt");
        int read = 0;
        /**    每次读取一个byte的数据
         *     public int read() throws IOException {
         *         return read0();
         *
         */
        byte[] b = new byte[1024];

        while (fileInputStream.read(b) != -1) {
            System.out.print(new String());
        }
    }
}
