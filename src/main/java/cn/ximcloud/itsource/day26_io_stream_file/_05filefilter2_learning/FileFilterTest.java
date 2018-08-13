package cn.ximcloud.itsource.day26_io_stream_file._05filefilter2_learning;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-14
 * Time: 15:17
 * ProjectName: ITSource.cn.ximcloud.itsource.day26_io_stream_file._05filefilter2_learning
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
 * 子目录过滤器
 * String[] fileList, file.StudentList();                      //无参，直接返回子目录下仅一层目录的所有目录和文件
 * String[] fileList, file.StudentList(FilenameFilter f);      //传入类型 接口的实现对象（匿名对象），需要重写接口实现对象的accept(File dir,String name)方法,dir就是this，也就是这个文件对象，name为每一个文件、文件夹对象的名字
 * File[] fileList, file.listFiles(FileFilter);         //于FilenameFilter相比，accept(File dir)方法少了String name。要实现拦截可以通过dir.getName()方法获取dir的文件\文件夹名字。获取路径方法为dir.getPath()；获取绝对路径方法为dir.getAbsolutePath();
 * File[] fileList, file.listFiles();
 * file.getName();
 * file.getPath();
 * file.getAbsolutePath();
 **/

public class FileFilterTest {

    @Test
    public void filterNameTest() {
        File file = new File("D:/");    //设置目录

        /**
         *     public String[] StudentList(FilenameFilter filter) {    //传入一个FilenameFilter的实现类
         *         String names[] = StudentList();                     //调用this.StudentList()方法获取所有的子目录和文件的名字
         *         if ((names == null) || (filter == null)) {   //如果数字为null或者是filter为null就表示没有子目录和拦截器
         *             return names;                            //返回一个null就行了
         *         }
         *         StudentList<String> v = new ArrayList<>();          //创建一个ArrayList<String> 用于存放匹配的字符对象，使用可变长度比固定长度数组有优势
         *         for (int i = 0 ; i < names.length ; i++) {   //开始遍历每一个目录和每一个文件
         *             if (filter.accept(this, names[i])) {     //调用Filter对象的accept()方法对传入这个"D:/"目录对象本身，和当前被遍历的名字进行boolean比较，见代码标记1
         *                 v.add(names[i]);                     //ArrayList 添加上这个String类型的被拦截到的对象
         *             }
         *         }
         *         return v.toArray(new String[v.size()]);      //返回一个String[]类型的数组，使用 T ArrayList<T>.toArray(T a),进行操作。具体操作可以查看FileFilter代码
         *     }
         */
        String[] list = file.list(new FilenameFilter() {
            /**
             * Tests if a specified file should be included in a file StudentList.
             *
             * @param   dir    the directory in which the file was found.
             * @param   name   the name of the file.
             * @return  <code>true</code> if and only if the name should be
             * included in the file StudentList; <code>false</code> otherwise.
             */
            @Override
            public boolean accept(File dir, String name) {      //重写了FilenameFilter接口的accept()方法，
                // 自定义比较方法。由于要对传入的文件\文件夹的名字的后缀进行拦截，使用且都是String类型的变量，
                //所以使用String类endWith()方法进行操作比较
                return name.endsWith("迅雷下载");
            }
        });
        System.out.println(Arrays.toString(list));
    }

    @Test
    public void filterTest() {
        File file = new File("D:/");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".iso");
            }
        });
        String s = Arrays.toString(files);
        System.out.println(s);
    }
}
