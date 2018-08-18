package cn.ximcloud.itsource.before.day26_io_stream_file._02createfile;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-14
 * Time: 11:13
 * ProjectName: ITSource.cn.ximcloud.itsource.before.day26_io_stream_file._02createfile
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

public class FileAndDirJustCreateDirTest {


    /**
     * 创建一个文件 throws IOException
     * public boolean createNewFile() throws IOException {  //抛出一个IO异常可能文件未找到,父路径未找到等...
     * SecurityManager security = System.getSecurityManager();
     * if (security != null) security.checkWrite(path);
     * if (isInvalid()) {
     * throw new IOException("Invalid file path");
     * }
     * return fs.createFileExclusively(path);
     * }
     */
    @Test
    public void createFile() {
        File file = new File("test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 创建一个文件夹，如果父路径不存在会报错
     * public boolean mkdir() {
     * SecurityManager security = System.getSecurityManager();  //获得系统安全管理对象
     * if (security != null) {
     * security.checkWrite(path);
     * }
     * if (isInvalid()) {
     * return false;
     * }
     * return fs.createDirectory(this);
     * }
     */
    @Test
    public void createDir() {
        File dir = new File("new Dir");
        dir.mkdir();

    }


    /**
     * 如果父路径不存在则自动创建
     * public boolean mkdirs() {
     * if (exists()) {      //如果存在则返回false
     * return false;
     * }
     * if (mkdir()) {       //如果不存在，且创建成功，就返回true
     * return true;
     * }
     * File canonFile = null;
     * try {
     * canonFile = getCanonicalFile();
     * } catch (IOException e) {
     * return false;
     * }
     * <p>
     * File parent = canonFile.getParentFile();
     * return (parent != null && (parent.mkdirs() || parent.exists()) &&
     * canonFile.mkdir());
     * }
     */
    public void createDirs() {
        File dirs = new File("test Dir");
        dirs.mkdirs();

    }
}
