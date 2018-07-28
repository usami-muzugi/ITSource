package cn.ximcloud.itsource.day27_io_stream_in_and_output_stream._04encode;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-16
 * Time: 09:57
 * ProjectName: ITSource.cn.ximcloud.itsource.day27_io_stream_in_and_output_stream._04encode
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
 * 编码
 * 计算机的文字有许多不同的编码，编码和解码不一致，会导致乱码现象。
 * 但是有的编码方式可能会兼容其他编码方式。
 * 阿斯克码没有中文
 * 有中文的编码方式为: UTF-8 UTF -16 GBK...
 **/

public class Encode {

    /**
     * @throws IOException
     */
    public void encode() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\wizard\\IdeaProjects\\itsource\\src\\main\\java\\cn\\ximcloud\\itsource\\day27_io_stream_in_and_output_stream\\_99teachercode\\itsource_04Encode\\TestEncode.java"));
        ArrayList<Byte> arrayList = new ArrayList<>();
        byte temp;
        while ((temp = (byte) fileInputStream.read()) != -1) {
            arrayList.add(temp);
        }
        byte[] bytes = new byte[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            bytes[i] = arrayList.get(i);
        }
        System.out.println("byte:");
        System.out.println(arrayList);
        System.out.println("GBK:");
        System.out.println(new String(bytes, "GBK"));
        System.out.println("UTF-16");
        System.out.println(new String(bytes, "UTF-16"));
        System.out.println("UTF-8");
        System.out.println(new String(bytes, "UTF-8"));
    }

    @Test
    public void encodeTest() throws IOException {
        encode();
    }


}
