package cn.ximcloud.itsource.day26_io_stream_file.homework;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * Student: Wizard
 * Date: 2018-07-14
 * Time: 23:14
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
 * <p>
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
 * //         佛祖保佑          永无BUG        永不修改               //
 * ////////////////////////////////////////////////////////////////////
 * 写一段代码完成一下功能：以你们接受每天我发给你们的资料的根目录为准，
 * 找出其中的所有的视频文件，然后再一个新的路径下面创建对应的文件，暂时不考虑内容，只要有文件就行
 **/
public class HomeWork3 {

    /**
     * 昏睡代码蜜汁完成，不清楚内部结构
     *
     * @param path    源目录
     * @param stuffix 拦截字符串
     * @param newPath 目标目录
     * @throws IOException
     */
    public static void allInOne(File path, String stuffix, File newPath) throws IOException {
        if (path == null || newPath == null || !path.exists()) return;
        for (File file : Objects.requireNonNull(path.listFiles())) {
            File tempPath = null;
            if (file.isDirectory()) {
                boolean mkdirs = (tempPath = new File(newPath, file.getName())).mkdirs();
                allInOne(file, stuffix, new File(newPath, tempPath.getName()));
            } else if (file.isFile() && file.getName().endsWith(stuffix)) {
                File tempFile;
                boolean newFile = (tempFile = new File(newPath, file.getName())).createNewFile();
                FileInputStream fileInputStream = new FileInputStream(file);
                //byte[] bytes = fileInputStream.readAllBytes();
                FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
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
            allInOne(new File("D:\\Java180606"), "avi", new File("D:/test"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
