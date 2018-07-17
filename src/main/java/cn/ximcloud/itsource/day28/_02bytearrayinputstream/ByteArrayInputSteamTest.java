package cn.ximcloud.itsource.day28._02bytearrayinputstream;

import cn.ximcloud.itsource.day7.Array;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-17
 * Time: 18:15
 * ProjectName: ITSource.cn.ximcloud.itsource.day28._02bytearrayinputstream
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
 *
 * 内存流之byte数组流
 *          构造方法:
 *                  public ByteArrayInputStream(byte buf[]) 方法参数传入一个byte[]类型数组
 **/

public class ByteArrayInputSteamTest {

    @Test
    public void byteArrayInputSteamTest() {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[]{65, 66, 67, 68, 69, 70})) {
            byte[] bytes = byteArrayInputStream.readAllBytes();
            System.out.println(bytes);
            System.out.println(new String(bytes));
            System.out.println(new String(bytes, 0, bytes.length));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void byteArrayInputStreamTest2() {
        ByteArrayInputStream byteArrayInputStream = null;
        try  {
            byte[] bytes1 = new byte[1024];
            for (int i = 0; i < 1024; i++) {
                bytes1[i] = (byte) i;
            }
            byteArrayInputStream = new ByteArrayInputStream(bytes1);
            byte[] bytes = byteArrayInputStream.readAllBytes();
            System.out.println(new String(bytes));

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert byteArrayInputStream != null;
                byteArrayInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
