package cn.ximcloud.itsource.day1_day47.day30_test.leveltest;

import org.junit.Test;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-19
 * Time: 14:52
 * ProjectName: ITSource.cn.ximcloud.itsource.day1_day47.day30_test.leveltest
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 7.	使用IO流实现文件的拷贝
 **/

public class Test_7 {
    public void sulotion(File src, File dest) {
//        FileInputStream fileInputStream = new FileInputStream(src);
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//
//        FileOutputStream fileOutputStream = new FileOutputStream(dest);
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//
//        byte[] bytes = new byte[1024];
//        int length;
//        while ((length = bufferedInputStream.read(bytes)) != -1) {
//            bufferedOutputStream.write(bytes, 0, length);
//        }
//        bufferedOutputStream.flush();
//        bufferedOutputStream.close();
//        fileOutputStream.close();
//        bufferedInputStream.close();
//        fileInputStream.close();

        try (
                //实现AutoCloseabl接口的类，可以方法try()的()中间自动关闭流。
                FileInputStream fileInputStream = new FileInputStream(src);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

                FileOutputStream fileOutputStream = new FileOutputStream(dest);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ) {
            byte[] bytes = new byte[1024];
            int length;
            while ((length = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, length);
            }
            bufferedOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test   //success
    public void fileCopyTest() {
        sulotion(new File("D:/ubuntu-14.04.5-desktop-amd64.iso"), new File("D:/test.iso"));
    }


}
