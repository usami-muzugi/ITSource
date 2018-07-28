package cn.ximcloud.itsource.day26_io_stream_file._03file_delete_learning;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-14
 * Time: 11:37
 * ProjectName: ITSource.cn.ximcloud.itsource.day26_io_stream_file._03file_delete_learning
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

public class FileAndDirDeleteTest {
    public static final int RM_RF = 0;
    public static final int RM_TRASHCAN = 1;

    public static void delete(File file, int operation) throws FileNotFoundException {
        if (file == null) throw new NullPointerException();     //递归循环不会throw这个错误
        if (!file.exists()) throw new FileNotFoundException();  //递归循环不会搞这个骚操作
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                delete(file1, operation);
            }
            file.delete();
        } else {
            if (operation == 0) {
                //删就完事
                file.delete();
            } else if (operation == 1) {
                //什么事都不做
            } else {
                throw new NumberFormatException("RM_RF = 0,RM_TRASHCAN = 1");
            }
        }
    }

    @Test
    public void deleteAllTest() throws FileNotFoundException {
        delete(new File("E:/test"), FileAndDirDeleteTest.RM_TRASHCAN);
    }
}
