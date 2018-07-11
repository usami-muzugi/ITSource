package cn.ximcloud.itsource.day24._05properties;

import org.junit.Test;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-11
 * Time: 18:25
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 	Map
 * 	|-TreeMap
 *  |-HashMap[线程不安全的Map]得到线程安全的Map m = Collections.synchronizedMap(new HashMap(...));
 * 	|-HashTable[线程安全的 Map]很少用,因为
 *  |-Properties[特殊的Map实现]一般是用于操作字符串值
 **/

public class PropertiesTest {
    private Properties properties;


    @Test
    public void customMethod() {
//        public synchronized Object put(Object key, Object value) {
//            return map.put(key, value);
//        }
        properties = new Properties();

        //put()方法调用Hashable的put()方法，Properties继承了Hashtable所以能使用Hashtable对的put()等方法
        properties.put("ourinsama", "usamimizugi");
        properties.put("jestom", "time");
        properties.put("lu", "test");
        System.out.println(properties);

    }

    @Test
    public void method() {
        //Properties也有设置Entry的方法，但是参数列表都是String  setProperty()
        properties = new Properties();
        properties.setProperty("xiaowugui", "18");
        properties.setProperty("dawugui", "28");
        properties.setProperty("judawugui", "38");
        properties.setProperty("wudiwugui", "88");

        System.out.println(properties);

        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry);
        }
    }

}
