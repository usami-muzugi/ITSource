package cn.ximcloud.itsource.day24._00hashmap;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-11
 * Time: 10:12
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * hashmap 学习
 * 重点 hashmap 是继承了AbstractMap抽象类，AbstractMap是实现了Map。所以这里没有接口it...的这个特新（迭代器）还有就是collection这个接口。不是List 和Set的分支
 * 回顾 List的特性是可重复， Set这个...HashSet是用的HashMap，而且只是用到的是这个K，Y他是直接用的final的一个Object所以是不可重复的。Set的特性就是不可重复
 * Map是K key 和V value 。 成对出现的。Entry。
 **/

public class HashMapTest {

    public static void main(String[] args) {
        //初始化hashmap
        Map map = new HashMap();
        //hashmap传入值的操作
        map.put("彭睿", "睿智");       //实现了map的传入值的操作 K  key V value
        map.put(1313, 113);
        System.out.println(map);
    }

}
