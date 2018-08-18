package cn.ximcloud.itsource.before.day28_io_stream_2._10random;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-17
 * Time: 15:39
 * ProjectName: ITSource.cn.ximcloud.itsource.before.day28_io_stream_2._10random
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

public class RandomAccessFileTest {

    /**
     * 这个有点东西
     *
     * @throws IOException
     */
    @Test
    public void test() throws IOException {
        for (int i = 0; i < 100; i++) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File("D:/abc.txt"), "rw");
            randomAccessFile.writeChars("IOException"); //写一堆字符，其实就是写一个字符串
            long length = randomAccessFile.length();    //获得长度
            long filePointer = randomAccessFile.getFilePointer();   //获得文件的末尾
            randomAccessFile.seek(length);  //设置下次写入的指针
            System.out.println(i + "\tlength:" + length + "filePointer:" + filePointer);
            randomAccessFile.writeChars("IOException");//再写一个

//        randomAccessFile.setLength(1024*1024*1024);
            randomAccessFile.close();   //基本操作关闭流
        }
    }
}
