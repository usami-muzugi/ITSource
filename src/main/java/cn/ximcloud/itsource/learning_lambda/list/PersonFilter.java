package cn.ximcloud.itsource.learning_lambda.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-07
 * Time: 19:52
 * ProjectName: itsource.cn.ximcloud.itsource.learning_lambda.List
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

public class PersonFilter {
    @Test
    public void test() {
        Persion persion1 = new Persion("彭睿", 20);
        Persion persion2 = new Persion("小鱼儿", 24);
        Persion persion3 = new Persion("印酱", 22);
        Persion persion4 = new Persion("卢酱", 26);


        List<Persion> list = Arrays.asList(persion1, persion2, persion3, persion4);
        Stream<Persion> stream = list.stream();
        Stream<Persion> persionStream = stream.filter(persion -> persion.getAge() > 30);
        System.out.println();

//      在Java8以前，要实现程序的可扩展性，我们常用匿名内部类传递用于扩展的代码，举个例子：
//      实现一个能从List集合中筛选指定对象的函数filter。
//      若List中存放Person对象，要求筛选出30岁以上的Person
//      若List中存放Apple，要求筛选出红色的Apple

    }

}
