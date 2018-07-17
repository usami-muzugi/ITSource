package cn.ximcloud.itsource.day27._98test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-16
 * Time: 16:15
 * ProjectName: ITSource.cn.ximcloud.itsource.day27._98test
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

public class TuZhong{
    public static void main(String[] args) {
        String mulu = "C:\\Users\\wizard\\Desktop\\";   //文件夹
        String pic = "20141107180644974.jpg";    //图片
        String rar = "新建 WinRAR 压缩文件.zip";    //压缩包
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(mulu + rar));
            FileInputStream fileInputStream1 = new FileInputStream(new File(mulu + pic));
            FileOutputStream fileOutputStream = new FileOutputStream(mulu + rar+".jpg");
            int i;
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

