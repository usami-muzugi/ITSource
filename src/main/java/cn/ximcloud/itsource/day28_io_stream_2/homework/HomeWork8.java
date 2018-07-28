package cn.ximcloud.itsource.day28_io_stream_2.homework;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * Student: Wizard
 * Date: 2018-07-18
 * Time: 00:36
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
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
 * //         佛祖保佑          永无BUG          永不修改             //
 * ////////////////////////////////////////////////////////////////////
 * 8、使用它IO流相关知识，读取一共文本文件，统计出其中每一个单词出现的次数，并把结果保存在另外的一个文件中，保存的结果类似如下：(此处假定单词可以是一个或者多个字母组成，不包含数字和_)
 * Hello-10
 * java-5
 * io-3
 **/
public class HomeWork8 {

    public static void main(String[] args) {
        maprecude(new File("D:/a.txt"), new File("D:/b.txt"));
    }

    /**
     * 词频计数
     *
     * @param srcFile  源文件File类型
     * @param destFile 目标文件File类型
     */
    public static void maprecude(File srcFile, File destFile) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        String string;
        PrintStream printStream = null;
        try {
            Scanner scanner = new Scanner(srcFile);
            while (scanner.hasNext()) {
                string = scanner.nextLine();
                String[] split = string.split("[^a-zA-Z]");
                for (String s : split) {
                    if (s.length() > 0)
                        if (hashMap.containsKey(s)) {
                            hashMap.put(s, hashMap.get(s) + 1);
                        } else {
                            hashMap.put(s, 1);
                        }
                }
            }
            System.out.println(hashMap.toString());
            printStream = new PrintStream(destFile);
            Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
            Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Integer> next = iterator.next();
                printStream.print(next.getKey() + "----" + next.getValue());
                printStream.println();
                printStream.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert printStream != null;
            printStream.close();
        }
    }
}
