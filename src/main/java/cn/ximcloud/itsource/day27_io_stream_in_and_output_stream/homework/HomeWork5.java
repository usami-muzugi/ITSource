package cn.ximcloud.itsource.day27_io_stream_in_and_output_stream.homework;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-16
 * Time: 15:37
 * ProjectName: ITSource.cn.ximcloud.itsource.day27_io_stream_in_and_output_stream.homework
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

public class HomeWork5 {
    /**
     * 直接把源目录里面的所有东西，包含文件的数据内容一并复制到目标目录里
     *
     * @param srcPath  源目录
     * @param destPath 目标目录
     * @throws IOException FileNotFoundException
     */
    private static void allInOne(File srcPath, File destPath) throws IOException {
        if (srcPath == null || destPath == null || !srcPath.exists()) return;
        for (File file : Objects.requireNonNull(srcPath.listFiles())) {
            File temp = null;
            if (file.isDirectory()) {
                (temp = new File(destPath, file.getName())).mkdirs();
                allInOne(file, new File(destPath, temp.getName()));
            } else {
                (temp = new File(destPath, file.getName())).createNewFile();
                FileInputStream fileInputStream = new FileInputStream(file);
                //byte[] bytes = fileInputStream.readAllBytes();
                FileOutputStream fileOutputStream = new FileOutputStream(temp);
                byte[] bytes = new byte[1024];
                int read;
                while ((read = fileInputStream.read(bytes)) != -1) {
                    fileOutputStream.write(bytes, 0, read);
                }
                //fileOutputStream.write(bytes);
                fileOutputStream.flush();
                fileOutputStream.close();
                fileInputStream.close();
            }
        }
    }

    @Test
    public void test() {
        try {
            allInOne(new File("D:\\Java180606"), new File("D:/test"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
