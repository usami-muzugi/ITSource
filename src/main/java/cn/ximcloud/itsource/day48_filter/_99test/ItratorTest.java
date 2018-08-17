package cn.ximcloud.itsource.day48_filter._99test;

import org.junit.Test;

import java.lang.reflect.Type;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-17
 * Time: 12:27
 * ProjectName: itsource.cn.ximcloud.itsource.day48_filter._99test
 * To change this template use File | Settings | Editor | File and Code Templates.
 * <p>
 * you are not expected to understand this.
 * <p>
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

public class ItratorTest {

    @Test
    public void testIterator() {
        int[] ints = new int[100];
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        ArrayList<Object> objects = new ArrayList<>();
        System.out.println("foreach");
        for (Object object : objects) {
            System.out.println(object);
        }
        System.out.println("----------------------------------");
        System.out.println("iterator");
        Iterator<Object> iterator = objects.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        Class<?>[] interfaces1 = Collection.class.getInterfaces();
        for (Class<?> aClass : interfaces1) {
            System.out.println(aClass.getSimpleName());
        }

        System.out.println("----------------------------------");
        Class<?>[] interfaces = int[].class.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getSimpleName());
        }

    }
}
