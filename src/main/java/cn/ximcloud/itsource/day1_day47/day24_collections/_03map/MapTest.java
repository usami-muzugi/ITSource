package cn.ximcloud.itsource.day1_day47.day24_collections._03map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-11
 * Time: 17:41
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * <p>
 * Map的应用示例
 * 使用Map集合统计一个字符串中每一个字符出现的次数
 * String str = "AAAABBCCCCCFFFFFFFFFFFFFF"
 **/

public class MapTest {
    private HashMap<Character, Integer> hashMap; //如果基本类型要使用泛型需要使用其包装类
    private String string = "AAAABBCCCCCFFFFFFFFFFFFFF";

    @Before
    public void doBefore() {
        hashMap = new HashMap<>();
        //传入一个HComparetor的实现类对象

    }

    @Test
    public void test() {
        //使用Map集合统计一个字符串中每一个字符出现的次数
        char[] characters = string.toCharArray();
        for (char character : characters) {
            if (hashMap.containsKey(character)) {
                hashMap.put(character, hashMap.get(character) + 1);
            } else {
                hashMap.put(character, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = hashMap.entrySet();

        for (Map.Entry<Character, Integer> characterIntegerEntry : entrySet) {
            System.out.println(characterIntegerEntry.getKey() + "-----" + characterIntegerEntry.getValue());
        }
    }

    //判断哪个字符在字符串传中出现的次数最多
    //①到map中取出所有的键值对,判断哪个的值最大,
    //放到int max,变量中,然后再遍历map,取出与该max值相等的value的键值对
    @Test
    public void getMax() {
        Collection<Integer> values = hashMap.values();
        //System.out.println(Collections.max(values));

        Object[] objects = values.toArray();

        Arrays.sort(objects);
        System.out.println(Arrays.toString(objects));

    }

    @After
    public void gc() {
        System.gc();
    }

}
