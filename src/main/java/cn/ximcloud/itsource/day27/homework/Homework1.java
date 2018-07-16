package cn.ximcloud.itsource.day27.homework;

import org.junit.Test;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-16
 * Time: 14:16
 * ProjectName: ITSource.cn.ximcloud.itsource.day27.homework
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
 * 分别使用文件流(一共4个)来读取和写入一个文件[非常重要,必须非常熟练!!!]
 **/

public class Homework1 {

    /**
     * 使用FileInputStream进行读取操作
     */
    @Test
    public void fileInputStreamReadTest() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("D:/新建文本文档.txt");
            int read;
            while ((read = fileInputStream.read()) != -1) {
                System.out.print(read + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fileInputStream != null;
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 使用FileInputStream进行写取操作
     */
    @Test
    public void fileInputStreamWriteTest() {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("D:/新建文本文档2.txt");
            fileOutputStream.write(65);
            fileOutputStream.write(new byte[]{64, 65, 66, 67, 68, 69, 70, 71});
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fileOutputStream != null;
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 使用FileInputStream进行读写取操作
     */
    @Test
    public void fileInputStreamReadAndWriteTest() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("D:/新建文本文档.txt");
            fileOutputStream = new FileOutputStream("D:/新建文本文档2.txt");
            fileOutputStream.write(fileInputStream.readAllBytes());
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fileOutputStream != null;
                fileOutputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void fileReaderAndWriterTest() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("D:/新建文本文档.txt");
            fileWriter = new FileWriter("D:/新建文本文档2.txt");
            char[] chars = new char[10];
            int temp;
            while ((temp = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, temp);
                fileWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fileReader != null;
                fileReader.close();
                assert fileWriter != null;
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
