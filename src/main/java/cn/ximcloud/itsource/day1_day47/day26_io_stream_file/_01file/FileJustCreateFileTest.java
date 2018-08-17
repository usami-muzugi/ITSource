package cn.ximcloud.itsource.day1_day47.day26_io_stream_file._01file;

import org.junit.Test;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-14
 * Time: 10:43
 * ProjectName: ITSource.cn.ximcloud.itsource.day1_day47.day26_io_stream_file._01file
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
 * <p>
 * File 文件和目录路径的抽象表示形式
 * <p>
 * 日志文件，游戏软件等希望保存再磁盘里的东西
 * <p>
 * 文件和目录的特点:文件和目录是不能重名的。文件和文件也是，目录和目录也是
 **/

public class FileJustCreateFileTest {

    /**
     * 传递一个String，可以是路径，也可以是文件名
     * public File(String pathname) {
     * if (pathname == null) {
     * throw new NullPointerException();
     * }
     * this.path = fs.normalize(pathname);
     * this.prefixLength = fs.prefixLength(this.path);
     * }
     */
    @Test
    public void createFileTest() {
        File file = new File("傻逼网友彭睿.txt");
        System.out.println(file);
    }

    /**
     * 传递两个String 一个目录，一个文件名
     * public File(String parent, String child) {
     * if (child == null) {
     * throw new NullPointerException();
     * }
     * if (parent != null) {
     * if (parent.equals("")) {
     * this.path = fs.resolve(fs.getDefaultParent(),
     * fs.normalize(child));
     * } else {
     * this.path = fs.resolve(fs.normalize(parent),
     * fs.normalize(child));
     * }
     * } else {
     * this.path = fs.normalize(child);
     * }
     * this.prefixLength = fs.prefixLength(this.path);
     * }
     */
    @Test
    public void createFileTest2() {
        File file = new File("", "");
    }


    /**
     * public File(File parent, String child) {
     * if (child == null) {
     * throw new NullPointerException();
     * }
     * if (parent != null) {
     * if (parent.path.equals("")) {
     * this.path = fs.resolve(fs.getDefaultParent(),
     * fs.normalize(child));
     * } else {
     * this.path = fs.resolve(parent.path,
     * fs.normalize(child));
     * }
     * } else {
     * this.path = fs.normalize(child);
     * }
     * this.prefixLength = fs.prefixLength(this.path);
     * }
     */
    @Test
    public void createFileTest3() {
        File file = new File("/目录");
        File file1 = new File(file, "");
    }
}
