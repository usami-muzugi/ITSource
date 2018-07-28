package cn.ximcloud.itsource.day25_collections_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-12
 * Time: 00:15
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 图种生成工具
 * 解释:
 * 不同的格式可能有一个魔术文字，
 * 就是识别一个文件是否为这个格式的文字。
 * 图种做好之后，将文件用jpg打开，jpg识别到魔术文字，然后就开始用JPG的编码格式正常解码然后完成图片的显示。
 * 直到遇见了不是jpg格式的乱码。
 * 而rar会在读取该文件直到读取到rar的魔术文字之后，开始解码然后就能正常打开。
 * 这实现了一个文件两种格式共存。
 * 但是这有一个缺点是，可能上传到网站上会被自动压缩导致文件与源文件不一致损坏。
 **/

public class test {
    public static void main(String[] args) {
        String mulu = "C:\\Users\\wizard\\Desktop\\";   //文件夹
        String pic = "ohayou.jpg";    //图片
        String rar = "tu.zip";    //压缩包
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(mulu + rar));
            FileInputStream fileInputStream1 = new FileInputStream(new File(mulu + pic));
            FileOutputStream fileOutputStream = new FileOutputStream(mulu + rar + ".jpg");
            int i = 0;
            byte[] bytes = new byte[1024];
            while ((i = fileInputStream1.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, i);
            }
            while ((i = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, i);
            }
            fileInputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
