package cn.ximcloud.itsource.day26.homework;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
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
 * TODO:写一段代码完成一下功能：以你们接受每天我发给你们的资料的根目录为准，
 * 找出其中的所有的视频文件，然后再一个新的路径下面创建对应的文件，暂时不考虑内容，只要有文件就行
 **/
public class HomeWork3 {

    /**
     * 昏睡代码蜜汁完成，不清楚内部结构
     * @param path
     * @param stuffix
     * @param newPath
     * @throws IOException
     */
    public static void allInOne(File path, String stuffix, File newPath) throws IOException {
        if (path == null || newPath == null || !path.exists()) throw new FileNotFoundException();
        for (File file : path.listFiles()) {
            File tempPath = null;
            if (file.isDirectory()) {
                (tempPath = new File(newPath, file.getName())).mkdirs();
                allInOne(file, "avi", new File(newPath, tempPath.getName()));
            } else {
                if (file.getName().endsWith(stuffix)) new File(newPath, file.getName()).createNewFile();
            }
        }
    }

    @Test
    public void test() {
        File file = new File("E:\\test");
        try {
            allInOne(file, ".avi", new File("E:\\test2"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
