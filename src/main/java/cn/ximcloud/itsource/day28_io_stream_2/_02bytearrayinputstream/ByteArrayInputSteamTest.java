package cn.ximcloud.itsource.day28_io_stream_2._02bytearrayinputstream;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-17
 * Time: 18:15
 * ProjectName: ITSource.cn.ximcloud.itsource.day28_io_stream_2._02bytearrayinputstream
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
 * 内存流之byte数组流
 * 构造方法:
 * public ByteArrayInputStream(byte buf[]) 方法参数传入一个byte[]类型数组
 **/

public class ByteArrayInputSteamTest {

    //ByteArrayI/OnputStream和CharArrayI/OnputStream都是在内存和程序当中进行操作

    /**
     * 测试输入操作
     * 使用在构造方法传入byte[]数组进行初始化操作
     */
    @Test
    public void byteArrayInputSteamTest() {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[]{65, 66, 67, 68, 69, 70})) {
            //[] bytes = byteArrayInputStream.readAllBytes();
            //System.out.println(bytes);
            //System.out.println(new String(bytes));
            //System.out.println(new String(bytes, 0, bytes.length));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试输入操作2
     */
    @Test
    public void byteArrayInputStreamTest2() {
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            byte[] bytes1 = new byte[1024];
            for (int i = 0; i < 1024; i++) {
                bytes1[i] = (byte) i;
            }
            byteArrayInputStream = new ByteArrayInputStream(bytes1);
            //byte[] bytes = byteArrayInputStream.readAllBytes();
            //System.out.println(new String(bytes));

            //} catch (IOException e) {
            // e.printStackTrace();
        } finally {
            try {
                assert byteArrayInputStream != null;
                byteArrayInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
