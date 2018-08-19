package cn.ximcloud.itsource.java8_feature;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

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
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 );
        integerList.stream().filter(x -> x.intValue() > 1).forEach(System.out::print);
    }
}
