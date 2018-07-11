package cn.ximcloud.itsource.day24._07generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-11
 * Time: 15:40
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 泛型的嵌套使用
 * 1.泛型不支持基本数据类型
 * 2.JAVA1.7之后，如果签名已经写明<Character,Integer>,后面的可以不要
 **/

public class _02TestGeneric {
    public static void main(String[] args) {
        String string = "OOOOOAABBCCDDEFFGGGG";

        char[] characters = string.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (char character : characters) {
            if (hashMap.containsKey(character)) {
                hashMap.put(character, hashMap.get(character) + 1);
            } else {
                hashMap.put(character, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> set = hashMap.entrySet();
        //System.out.println(set);
        for (Map.Entry<Character, Integer> characterIntegerEntry : set) {
            System.out.println(characterIntegerEntry.getKey() + "------" + characterIntegerEntry.getValue());
        }


    }

}
