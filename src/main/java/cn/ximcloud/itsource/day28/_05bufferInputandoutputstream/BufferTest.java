package cn.ximcloud.itsource.day28._05bufferInputandoutputstream;

import org.junit.Test;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-17
 * Time: 10:51
 * ProjectName: ITSource.cn.ximcloud.itsource.day28._05bufferInputandoutputstream
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
 * 缓冲流测试
 *      主要目的是包装其他的流，已达到高效的目的
 *      构造方法:
 *      BufferedInputStream(InputStream is) 包装一个实现InputStream的对象
 *
 *      public BufferedInputStream(InputStream in, int size) {      包装一个实现InputStream的类的对象，并初始化其数组的大小
 *         super(in);
 *         if (size <= 0) {
 *             throw new IllegalArgumentException("Buffer size <= 0");
 *         }
 *         buf = new byte[size];
 *     }
 **/

public class BufferTest {

    @Test
    public void bufferTest() {
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            long l = System.currentTimeMillis();
            File file = new File("D:/ubuntu-14.04.5-desktop-amd64.iso");
            fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            byte[] bytes = new byte[2];    //2 11126,512 10057,1024 10664 ,1024*8 10539
            int length;
            while ((length = bufferedInputStream.read(bytes)) != -1) {

            }
            System.out.println(System.currentTimeMillis() - l);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert fileInputStream != null;
                fileInputStream.close();
                assert bufferedInputStream != null;
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
