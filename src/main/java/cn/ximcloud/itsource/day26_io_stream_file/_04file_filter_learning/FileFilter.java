package cn.ximcloud.itsource.day26_io_stream_file._04file_filter_learning;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-14
 * Time: 14:40
 * ProjectName: ITSource.cn.ximcloud.itsource.day26_io_stream_file._04file_filter_learning
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
 * 手动操作
 * 设计一个过滤器，显示指定文件夹类指定过滤器字符串结尾的文件名
 **/

public class FileFilter {

    /**
     * 传入一个目录和一个过滤字符，获取该目录下所有以该过滤字符结尾的文件
     *
     * @param file   目录
     * @param suffix 过滤字符
     * @return 目录下所有以该过滤字符结尾的文件
     */
    public static String[] fileFilter(File file, String suffix) throws FileNotFoundException {
        if (file == null) throw new FileNotFoundException("目录为空");
        if (!file.isDirectory()) throw new FileNotFoundException("不为目录");
        if (suffix == null || suffix.equals("")) throw new FileNotFoundException("过滤器不能为空");
        String[] list = file.list();
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (String s : list) {
            if (s.endsWith(suffix)) stringArrayList.add(s);
        }
        return stringArrayList.toArray(new String[stringArrayList.size()]);
        /**
         *     public <T> T[] toArray(T[] a) {
         *         if (a.length < size)
         *             // Make a new array of a's runtime type, but my contents:
         *             return (T[]) Arrays.copyOf(elementData, size, a.getClass());
         *         System.arraycopy(elementData, 0, a, 0, size);
         *         if (a.length > size)
         *             a[size] = null;
         *         return a;
         *     }
         */
    }

    /**
     * 测试文件过滤
     */
    @Test
    public void dirFilter() {
        File file = new File("D:/");
        String[] strings = new String[0];
        try {
            strings = fileFilter(file, ".iso");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String s = Arrays.toString(strings);
        System.out.println(s);
    }

}
