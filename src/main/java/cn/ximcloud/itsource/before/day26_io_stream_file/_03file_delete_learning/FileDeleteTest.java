package cn.ximcloud.itsource.before.day26_io_stream_file._03file_delete_learning;

import org.junit.Test;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-14
 * Time: 11:23
 * ProjectName: ITSource.cn.ximcloud.itsource.before.day26_io_stream_file._03file_delete_learning
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

public class FileDeleteTest {

    /**
     * delete()可以删除文件和目录
     * 删除目录
     * 如果删除的目录不存在返回false ，存在删除该文件夹并返回true
     * 如果一个目录里面存在文件，不能直接删除。只有为空的目录才能直接删除
     * <p>
     * 删除文件
     * 文件不和目录类似，文件存在直接删除并返回true。
     * 文件不存在返回false
     * public boolean delete() {
     * SecurityManager security = System.getSecurityManager();
     * if (security != null) {
     * security.checkDelete(path);
     * }
     * if (isInvalid()) {
     * return false;
     * }
     * return fs.delete(this);
     * }
     */
    @Test
    public void fileDeteleTest() {
        File file = new File("");
        file.delete();
    }
}
