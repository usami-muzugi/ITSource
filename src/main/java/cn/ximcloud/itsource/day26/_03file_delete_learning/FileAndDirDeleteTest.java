package cn.ximcloud.itsource.day26._03file_delete_learning;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-14
 * Time: 11:37
 * ProjectName: ITSource.cn.ximcloud.itsource.day26._03file_delete_learning
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

    public void deleteAdd(File file) throws FileNotFoundException {
        //1.判断传入的对象是否为null
        if (file == null) throw new NullPointerException();
        //2.判断文件是否存在
        if (file.exists()) throw new FileNotFoundException("FileNotFound");
        //3.判断是否是文件 是 删除 return，否 执行下一个判断
        if (file.isFile()) {        //isFile()是判定文件对象是否为一个标准的文件（非隐藏文件...等等）
            file.delete();
            return;
        }
        //4.判断是否为文件夹  是 判断是否有子目录和文件 是执行方法嵌套删除操作，否执行下一个操作
        if (!file.isDirectory()) {
            for (String s : file.list()) {
                //...
                deleteAdd(new File(s));
            }
        }
        //5.方法嵌套删除操作
        //6.删除文件夹
        //7.return
        file.delete();
        //8.
    }
}
