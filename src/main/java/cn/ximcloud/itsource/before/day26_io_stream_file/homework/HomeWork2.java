package cn.ximcloud.itsource.before.day26_io_stream_file.homework;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by IntelliJ IDEA.
 * Student: Wizard
 * Date: 2018-07-14
 * Time: 22:29
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
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 * 完成上课所提到的删除方法【高级部分】：撤销删除（撤销上面刚删除的目录）功能
 **/
public class HomeWork2 {
    public static final int RM_RF = 0;
    public static final int RM_TRASHCAN = 1;

    //数据无价  谨慎操作
    public static void delete(File file, int operation) throws FileNotFoundException {
        if (file == null) throw new NullPointerException();     //递归循环不会throw这个错误
        if (!file.exists()) throw new FileNotFoundException();  //递归循环不会搞这个骚操作
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                delete(file1, operation);
            }
            //删完文件再删除目录
            file.delete();
        }
        if (file.isFile()) {    //不删非标准文件
            if (operation == 0) {
                //删就完事
                file.delete();
            } else if (operation == 1) {

            } else {
                throw new NumberFormatException("RM_RF = 0,RM_TRASHCAN = 1");
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("E:/test");
        try {
            delete(file, HomeWork2.RM_RF);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
