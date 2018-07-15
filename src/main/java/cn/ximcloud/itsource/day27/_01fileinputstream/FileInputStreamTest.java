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
 **/

public class FileInputStreamTest {

    @Test
    public void fileIntputSteamTest() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D://新建文本文档.txt");
        int read = 0;
        /**    每次读取一个byte的数据
         *     public int read() throws IOException {
         *         return read0();
         *
         */
        while ((read = fileInputStream.read()) != -1) {
            System.out.print((char)read+"  ");
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
