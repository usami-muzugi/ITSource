package cn.ximcloud.itsource.java8_feature.lambda.lambda4;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-19
 * Time: 16:41
 * ProjectName: itsource.cn.ximcloud.itsource.java8_feature.lambda.lambda4
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

public class PersonTest {
    @Test
    public void testPersonCreate() {
        /**
         * 需求:
         *      有一个Person类
         *      有一个获得Person对象的接口的工厂
         *      想通过公差个来获得一个Person对象
         *      需要现有一个实际的工厂对象
         */
//        匿名内部类
        PersonFactory personFactory = new PersonFactory() {
            @Override
            public Person createPerson(String fisrstName, String lastName) {
                return new Person(fisrstName, lastName);
            }
        };
        Person person = personFactory.createPerson("卢", "思颖");
        System.out.println(person.toString());
    }

    @Test
    public void testLambda() {

        /**
         * 接下来使用lambda表达式来创建一个对象
         */
        PersonFactory personFactory = (x, y) -> new Person(x, y);
        Person person = personFactory.createPerson("文", "国印");
        System.out.println(person);

    }


    /**
     * Lambda 创建Person对象，构造方法的引用
     */
    @Test
    public void testLambda3() {

        /**
         * 接下来使用lambda表达式来创建一个对象
         * 这个是上面的简写，简直看不懂了
         */
        //使用Lambda表达式构造方法的引用，
        // 这里要注意下就是方法里面的参数列表要和构造方法的参数列表相同
        PersonFactory personFactory = Person::new;
        Person person = personFactory.createPerson("文", "国印");
        System.out.println(person);
    }
}
