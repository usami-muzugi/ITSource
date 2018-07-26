package cn.ximcloud.itsource.day26_io_stream_file.homework;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-14
 * Time: 22:04
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
 * 上课演示过的所有的示例
 **/
public class HomeWork1 {

    /**
     * 认识文件,认识目录。了解文件。了解File类
     * Windows系统文件系统。
     * 1.在同一目录下，不能存在相同名字的两个文件
     * 2.在同一目录下，不能存在相同名字的两个目录
     * 3.在同一目录下，不能存在相同名字的一个文件和一个目录
     */
    @Test
    public void fileTest() {
        //1.JAVA语言，把目录和文件都抽象的看作File，这个抽象的文件，可以是目录，也可以是文件
        //认识File构造方法
        /**
         *  参数列表： pathname
         */
        File file = new File("");

        /**
         * 参数列表：parent路径，child，文件名
         */
        File testFile = new File("", "");

        /**
         * 参数列表：file文件对象的一个路径，文件名
         */
        File file1 = new File(new File(""), "");


        //认识File内部方法

        //File类有方法isFile() ，能判定一个文件是否为一个标准的文件（即非隐藏等等）
        boolean isFile = file.isFile();
        System.out.println("isFile?" + isFile);

        //判断是否为一个目录的方法是isDirectory()。
        boolean isDir = file.isDirectory();
        System.out.println("isDir?" + isDir);

        //判断这个文件/目录是否存在的方法是exist()
        boolean isExists = file.exists();
        System.out.println("isExists?" + isExists);

        //获取这个文件/目录的路径方法getPath()
        String path = file.getPath();
        System.out.println("path:" + path);

        //获取这个文件/目录的绝对路径方法getAbsolutePath()
        String absolutePath = file.getAbsolutePath();
        System.out.println("绝对路径" + absolutePath);

        //获取这个文件/目录的名字的方法
        String name = file.getName();
        System.out.println("name:" + name);

        //返回这个目录下的子目录名和文件名
        String[] list = file.list();
        System.out.println(Arrays.toString(list));

        //以文件数组类型返回这个目录下的子目录对象和文件名
        File[] files = file.listFiles();
        System.out.println(Arrays.toString(files));

        //使用拦截器来对文件进行筛选
        String[] list1 = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {      //拦截方法，需要手动编写逻辑
                return name.endsWith("exe");
            }
        });
        System.out.println(Arrays.toString(list1));

        //使用拦截器来对文件进行筛选
        File[] xxxes = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith("xxx");
            }
        });


        boolean b = file.canRead();
        System.out.println("canRead" + b);

        boolean b1 = file.canWrite();
        System.out.println("canWrite" + b1);

        boolean b2 = file.canExecute();
        System.out.println("canExecute" + b2);
    }
}
