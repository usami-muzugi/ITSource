package cn.ximcloud.itsource.java8_feature;


import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-08-19
 * Time: 21:15
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
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
 * //         佛祖保佑          永无BUG          永不修改             //
 * ////////////////////////////////////////////////////////////////////
 **/
public class ForeachTest {
    public static void main(String[] args) {
//        常规
        List<String> strings = Arrays.asList("1", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2");
        for (String string : strings) {
            System.out.println(string);
        }

//        在java8中你可以使用  foreach  + 拉姆达表达式遍历
        strings.forEach(x -> System.out.print(x));
        System.out.println("简写");
        strings.forEach(System.out::print);

//        也可以做点判定什么的
        System.out.println();
        strings.forEach(x -> {
            if ("2".equals(x)) {
                System.out.print("这个是2");
            } else {
                System.out.print(x);
            }
        });
        System.out.println();
        String[] strs = {"1", "2"};
//        注意数组没有这个foreach()方法
        System.out.println();
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        integerList.stream().filter(x -> x > 1).forEach(System.out::print);
    }

    @Test
    public void test() {
//        普通操作来遍历一个List里面所有的元素
//                咱们可以使用for循环进行遍历
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (Iterator iterator = integerList.iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next());
        }

//        使用增强型for循环
        for (Integer integer : integerList) {
            System.out.print(integer);
        }

//        使用Lambda表达式
        integerList.forEach((Integer x) -> {
            System.out.print(x);
        });

//        简化
        integerList.forEach((x) -> System.out.print(x));

//        简化到极致，一句话搞定。表白函数式编程
        integerList.forEach(System.out::print);

//        ---------------------------------滑稽的分割线-------------------------- -

//                做些操作吧
        for (Iterator<Integer> iterator = integerList.iterator(); iterator.hasNext(); ) {
            int tempInt;
            if ((tempInt = iterator.next()) > 5) {
                System.out.print("没想到吧，" + tempInt + "比5大");
            }
        }

//        简化
        integerList.stream().filter(x -> x > 5).forEach(x -> System.out.println("没想到吧，" + x + "比5大"));
    }

    @Test
    public void testFor() {
        String[] strings = new String[]{"1", "2", "3", "4", "5", "6"};

//        在没有增强型for循环的时候，遍历一个数组是否很难受呢？

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

//        自从学会了增强型for循环，妈妈再也不用担心我的JAVA学习辣

        for (String string : strings) {
            System.out.println(string);
        }
//        对List和Set进行迭代遍历
        List<String> stringList = Arrays.asList("1", "2", "3", "4", "5", "6");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String s : stringList) {
            System.out.println(s);
        }

        Class<?>[] interfaces = String[].class.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getSimpleName());
        }
    }
}
