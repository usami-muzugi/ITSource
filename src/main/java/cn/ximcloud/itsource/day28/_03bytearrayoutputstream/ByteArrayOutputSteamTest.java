package cn.ximcloud.itsource.day28._03bytearrayoutputstream;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

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

public class ByteArrayOutputSteamTest {

    @Test
    public void byteArrayInputAndOutputSteamTest() {
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74});
            byteArrayOutputStream.write(69);
            byteArrayOutputStream.write(69);
            byteArrayOutputStream.write(69);
            byte[] bytes = byteArrayOutputStream.toByteArray();
            System.out.println(new String(bytes,0,bytes.length));

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            byte[] bytes1 = byteArrayInputStream.readAllBytes();
            System.out.println(new String(bytes1));

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
