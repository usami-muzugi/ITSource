package cn.ximcloud.itsource.day24_collections._07generic;

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
 * <p>
 * 获取各个字符的出现次数，求词频
 **/

public class _02TestGeneric {
    public static void main(String[] args) {
        //一个字符串类型的数据
        String string = "OOOOOAABBCCDDEFFGGGG";

        //首先将他转换为字符数组
        char[] characters = string.toCharArray();

        //指定了K和V的类型，所以只能传入相同类型的值
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        //这里使用了foreach循环遍历character
        for (char character : characters) {
            if (hashMap.containsKey(character)) {   //首先是判断hashMap当中是否有这个K
                hashMap.put(character, hashMap.get(character) + 1); //有的话，就+1
            } else {
                hashMap.put(character, 1);  //没有的话，就初始化Entry，K是这个字符，V是1（因为是求词频）
            }
        }
        //调用entrySet()方法，返回的是Set的对象，Set是泛型可以传入一个Map.Entry的泛型。
        Set<Map.Entry<Character, Integer>> set = hashMap.entrySet();
        //System.out.println(set);
        for (Map.Entry<Character, Integer> characterIntegerEntry : set) {
            System.out.println(characterIntegerEntry.getKey() + "------" + characterIntegerEntry.getValue());
        }


    }

}
