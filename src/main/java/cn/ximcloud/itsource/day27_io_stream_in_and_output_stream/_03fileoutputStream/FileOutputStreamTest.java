package cn.ximcloud.itsource.day27_io_stream_in_and_output_stream._03fileoutputStream;

import org.junit.Test;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-16
 * Time: 09:22
 * ProjectName: ITSource.cn.ximcloud.itsource.day27_io_stream_in_and_output_stream._03fileoutputStream
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
 * 文件输出流
 **/

public class FileOutputStreamTest {
    /**
     * 构造方法
     * 1. FileOutputStream(String fileName) throws FileNotFoundException
     * 2. FileOutputStream(File file) throws FileNotFoundException
     */
    public void fileOutputStreamTest() throws FileNotFoundException {
//        FileOutputStream fileOutputStream = new FileOutputStream("");
//        FileOutputStream fileOutputStream1 = new FileOutputStream(new File(""));
    }

    /**
     * write（写）方法测试 1
     * 创建临时数组Byte ，将fis读取的数据写入到数组中，将数组中的数据，通过fos写入到内存。
     * 在通过fos flush  fos.close 操作，把缓冲在内存中的数据写入硬碟
     */
    public void fileOutputStreamWriteOne() throws IOException {
        File file = new File("D:/新建文本文档.txt"); //目标文件
        FileInputStream fileInputStream = new FileInputStream(file);    //输入流建立，目标文件关联
        FileOutputStream fileOutputStream = new FileOutputStream("D:/新建文本文档 (2).txt");    //输出流建立，目标文件关联

        byte[] bytes = new byte[1024];  //临时数组builded
        while ((fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes);   //读取数据Start
        }   //读取数据End
        //fos flush
        fileOutputStream.flush();
        //fos flush
        fileOutputStream.close();
        //fis clsoe
        fileInputStream.close();
    }

    /**
     * write（写）方法测试 2
     * fileOutputStream.write(bytes, 0, bytes.length);   //读取数据Start
     * // 目标数据数组，偏移量，写入长度
     */
    public void fileOutputStreamWriteTwo() throws IOException {
        File file = new File("D:/新建文本文档.txt"); //目标文件
        FileInputStream fileInputStream = new FileInputStream(file);    //输入流建立，目标文件关联
        FileOutputStream fileOutputStream = new FileOutputStream("D:/新建文本文档 (2).txt");    //输出流建立，目标文件关联

        byte[] bytes = new byte[2];  //临时数组builded  不建议使用2，应该由一个理性的值
        while ((fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, bytes.length);   //读取数据Start
            // 目标数据，数组型，偏移量，写入长度
        }   //读取数据End
        //fos flush
        fileOutputStream.flush();
        //fos flush
        fileOutputStream.close();
        //fis colse
        fileInputStream.close();
    }

    /**
     * write（写）方法测试 3
     * 每次写入一个int类型的字节， 是否追加
     * private native void write(int b, boolean append) throws IOException;
     * 每次覆写该文件
     * private native void write(int b) throws IOException;
     */
    public void fileOutputStreamWriteThree() throws IOException {
        File file = new File("D:/新建文本文档.txt"); //目标文件
        FileInputStream fileInputStream = new FileInputStream(file);    //输入流建立，目标文件关联
        FileOutputStream fileOutputStream = new FileOutputStream("D:/新建文本文档 (2).txt");    //输出流建立，目标文件关联

        int temp;
        while ((temp = fileInputStream.read()) != -1) {
            fileOutputStream.write(temp);   //读取数据Start
            // 目标数据，数组型，偏移量，写入长度
        }   //读取数据End
        //fos flush
        fileOutputStream.flush();
        //fos flush
        fileOutputStream.close();
        //fis colse
        fileInputStream.close();
    }


    @Test
    public void fileOutputStreamWriteTest() throws IOException {
        fileOutputStreamWriteTwo();
    }

}
