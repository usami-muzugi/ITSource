package cn.ximcloud.itsource.day1_day47.day30_test.zixi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-21
 * Time: 14:28
 * ProjectName: ITSource.cn.ximcloud.itsource.day1_day47.day30_test.zixi
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
 **/

public class HashMapTest {
    public static void main(String[] args) {
        //这两个的hashCode是相同的
        System.out.println(new Character('1').hashCode());
        System.out.println(new Integer(49).hashCode());
        Map map = new HashMap();
        //相同哈希值的不同类型的变量可以添加进去
        map.put('1', " '1' hashCode is 49");
        map.put(49, " 49 hashCode is 49");
        System.out.println(map);
        Object put = map.put(49, 222);
        System.out.println(put);
        System.out.println(map);
        //相同类型的key对象，如果与之前添加的这个类型的key的hashCode和equals相同，就会把之前的Value覆盖掉
    }
}
