package cn.ximcloud.itsource.day25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-12
 * Time: 00:15
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
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
