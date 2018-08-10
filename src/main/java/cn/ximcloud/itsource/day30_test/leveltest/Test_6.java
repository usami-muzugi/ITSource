package cn.ximcloud.itsource.day30_test.leveltest;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-19
 * Time: 14:36
 * ProjectName: ITSource.cn.ximcloud.itsource.day30_test.leveltest
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 6.	有如下的一个字符串  String str = “ksjhfkjashfkahfkahfiuuytwurekahd”;
 * ① 请统计出其中每一个字母出现的次数，并把结果保存到一个文件中去：
 * ② 请打印出字母次数最多的那一对
 * 请用到知识：泛型、Map、IO
 **/

public class Test_6 {

    @Test
    public void solution() throws FileNotFoundException {
        String str = "ksjhfkjashfkahfkahfiuuytwurekahd";
        char[] chars = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                map.put(aChar, map.get(aChar) + 1);
            } else {
                map.put(aChar, 1);
            }
        }

        //将map的所有值，创建一个arrayList，再顺序排序，获取最后一个索引，就是最大值
        ArrayList<Integer> arrayList = new ArrayList<>(map.values());
        Collections.sort(arrayList);
        System.out.println(arrayList);
        int maxVal = arrayList.get(arrayList.size() - 1);


        //System.out.println(maxVal);
        System.out.println("请打印出字母次数最多的那一对");

        PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("D:/keyAndValue.txt")));
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = entrySet.iterator();

        //
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> next = iterator.next();
            printWriter.println(next.getKey() + "----" + next.getValue());

            //最大值的Entry元素可能不止一个，所以通过这个复杂的方法来获取Value == maxVal的Entry。然后打印
            if (next.getValue() == maxVal) {
                System.out.println(next.getKey() + "----" + next.getValue());
            }
        }
        printWriter.flush();
        printWriter.close();

        //不适合Properties，properties是添加的<String,String>所以会报下面这个错
        //java.base/java.lang.Character cannot be cast to java.base/java.lang.String
//        Properties properties = new Properties();
//        properties.putAll(map);
//        properties.List(new PrintWriter(new FileOutputStream(new File("D:/keyAndValue.txt"))));
    }
}
