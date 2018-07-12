package cn.ximcloud.itsource.day24.homework;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-12
 * Time: 08:45
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 1.字符串String str = “ABCDEABCDABC”;定义一个方法query，
 * 该方法算出该字符串中每一个字符的个数，打印格式如：
 * A——3
 * B——3
 * C——3
 * D——2
 * E——1
 **/

public class HomeWork1 {

    @Test
    public void  query() {
        String str = "ABCDEABCDABC";
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('0', 0);
        Set<Character> characters = map.keySet();
        HashMap<Character, Integer> hashMap = (HashMap<Character, Integer>) map.clone();
        for (char aChar : chars) {  //char数字比较次数
            for (Character character : characters) {    //
                if (aChar == character) {
                    hashMap.put(aChar, hashMap.get(aChar) + 1);
                } else {
                    hashMap.put(aChar, 1);
                }
            }
//            Iterator<Character> iterator = characters.iterator();
//            while (iterator.hasNext()) {
//                iterator.next();
//                if (aChar == iterator.next()) {
//                    map.put(aChar, map.get(aChar) + 1);
//                } else {
//                    map.put(aChar, 1);
//                }
//            }
        }

        System.out.println(hashMap);
//
//        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
//        for (Map.Entry<Character, Integer> characterIntegerEntry : entrySet) {
//            System.out.println(characterIntegerEntry.getKey() + "---" + characterIntegerEntry.getValue()+"\n");
//        }

    }

//    @Test
//    public void  test() {
//        String str = "ABCDEABCDABC";
//        char[] chars = str.toCharArray();
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        int tempVar = 0;
//        for (char aChar : chars) {
//            if (map.put(1)) {
//            }
//        }
//
//        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
//        for (Map.Entry<Character, Integer> characterIntegerEntry : entrySet) {
//            System.out.println(characterIntegerEntry.getKey() + "---" + characterIntegerEntry.getValue()+"\n");
//        }
//
//    }


}
