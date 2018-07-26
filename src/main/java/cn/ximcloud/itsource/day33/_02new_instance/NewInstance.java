package cn.ximcloud.itsource.day33._02new_instance;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-26
 * Time: 16:04
 * ProjectName: ITSource.cn.ximcloud.itsource.day33._01ClassTest
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

public class NewInstance {
    @Test
    public void newInstanceTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Student> studentClass = Student.class;
        Constructor<Student> constructor = studentClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Student student1 = constructor.newInstance();
        Student student2 = constructor.newInstance();
        Student student3 = constructor.newInstance();
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        Constructor<Student> constructor1 = studentClass.getConstructor(String.class, Integer.TYPE);
        Student student = constructor1.newInstance("1", 2);
        System.out.println(student);


        //换了保安了,每一个获得的构造器，都是一个不同的对象。
//        Constructor<Student> constructor2 = studentClass.getDeclaredConstructor();
//        Student student4 = constructor2.newInstance();
//        System.out.println(student4);

    }
}
