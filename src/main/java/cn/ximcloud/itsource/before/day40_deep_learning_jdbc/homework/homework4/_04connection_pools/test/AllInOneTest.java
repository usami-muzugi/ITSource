package cn.ximcloud.itsource.before.day40_deep_learning_jdbc.homework.homework4._04connection_pools.test;

import cn.ximcloud.itsource.before.day40_deep_learning_jdbc._04connection_pools.dao.impl.ClsImpl;
import cn.ximcloud.itsource.before.day40_deep_learning_jdbc._04connection_pools.dao.impl.StudentImpl;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wizard
 * @date 2018-08-06
 * Time: 14:17
 * ProjectName: itsource.cn.ximcloud.itsource.before.day40_deep_learning_jdbc._04connection_pools.test
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

public class AllInOneTest {
    private static StudentImpl student;
    private static ClsImpl cls;

    /**
     * 实例初始化
     */
    @BeforeClass
    public static void doBeforeClass() {
        student = new StudentImpl();
        student.createTable();
        cls = new ClsImpl();
        cls.createTable();

    }

    /**
     * 添加一个学生，会自动在学生表中进行添加并且还会在cls表中查询是否有学生表的这个cls字段，没有就在cls表中创建这个字段
     */
    @Test
    public void testSave() {

    }

//    @AfterClass
//    public static void doAfterClass() {
//        student.droptable();
//    }
}
