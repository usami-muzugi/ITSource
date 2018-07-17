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
 * 1. 要将文件读取到内存中，可以使用文件输入流FileInputStream
 * 2. 使用FileInputStream构造方法将本地文件于输入流关联。
 * 3. 读取文件使用read()方法，默认无参方法每调用一次读取一个字节的数据，并已int类型返回，若返回值为-1.则表示文件已经读到末尾
 * 4. 读取操作有参方法read(byte[] b)方法，每次读取一个byte.length长度的数据，并将数据保存到数组中，若返回值为-1，则表示文件已经读到末尾
 * <p>
 * <p>
 * FileInputStream
 * 构造方法:
 * 1. FileInputStream(String name) throws FileNotFoundException
 * 关联一个本地文件，传入String类型的本地文件名
 * 2. FileInputStream(File file) throws FileNotFoundException
 * 关联一个本地文件，传入File类型的文件
 * 方法:
 * int      read()             读取一个字节，并以int类型的值返回，如果读取返回值为-1.则表示读取到末尾
 * byte[]   read(byte[] bytes) 读取一个byte[]类型的长度，并以byte[]类型，且长度为length返回，如果读取返回值为-1，则表示读取到末尾
 **/

public class FileInputStreamTest {

    /**
     * 文件输入流测试
     *
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
         *         return read();
         *
         */
        //获得每一次读取的操作的值，并赋值给read，再判断是否为-1，为-1表示文件读取到末尾。
        while ((read = fileInputStream.read()) != -1) {
            //打印该值，并强制类型转换为char类型，以字符形式表示
            System.out.print((char) read + "  ");
        }

        //fis close
        fileInputStream.close();
    }

    /**
     * 文件输入流打印字符测试
     *
     * @throws IOException 抛出一个IO异常，文件未找到
     */
    public void fileInputStreadCNTest() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D://新建文本文档.txt");
        int read = 0;
        /**    每次读取一个byte数组的数据
         *     public int read() throws IOException {
         *         return read0();
         *
         */
        byte[] b = new byte[1024];     //声明并初始化一个byte类数组，长度为1024

        while (fileInputStream.read(b) != -1) {     //每次读取1024长度的数据，如果读到末尾就跳出循环
            for (byte b1 : b) {
                System.out.print((char) b1 + " ");   //强制类型转换为char类型，char类型可直接显示
            }
        }
        //fileInputStream close
        fileInputStream.close();
    }

    @Test
    public void byteArrayInputStreadTest() throws IOException {
        fileInputStreadCNTest();
    }
}
