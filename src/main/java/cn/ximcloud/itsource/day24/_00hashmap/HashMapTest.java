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
 * HASHMAP 学习
 **/

public class HashMapTest {

    public static void main(String[] args) {
        //初始化hashmap
        Map map = new HashMap();
        //hashmap传入值的操作
        map.put("彭睿", "睿智");
        map.put(1313, 113);
        System.out.println(map);
    }

}
