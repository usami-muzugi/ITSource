package cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._01preparedstatement.cn.ximcloud.istource.test;

import cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._01preparedstatement.cn.ximcloud.istource.dao.IUser;
import cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._01preparedstatement.cn.ximcloud.istource.dao.impl.UserImpl;
import cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._01preparedstatement.cn.ximcloud.istource.domain.User;
import cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._01preparedstatement.cn.ximcloud.istource.jdbcutil.JDBCUtils;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: wzard
 * Date: 2018-08-06
 * Time: 09:59
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._01preparedstatement.cn.ximcloud.istource.test
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

public class PreparedStatementTest {
    private static JDBCUtils jdbcUtils;
    private static IUser user;

    @BeforeClass
    public static void doBeforeClass() {
        jdbcUtils = JDBCUtils.getInstance();
        user = new UserImpl();
    }

    /**
     * 创建表
     */
    @Test
    public void testCreateTable() {
        user.createTable();
    }

    @Test
    public void testSaveUser() {
        user.save(new User("傻逼网友", "彭睿"));
    }

    @Test
    public void testFind() {
        System.out.println(user.find("傻逼网友"));
    }

    @Test
    public void testFind2() {
        System.out.println(user.find(2));
    }

    @Test
    public void testFindAll() {
        List<User> all = user.findAll();
        all.forEach(System.out::println);
    }

    @Test
    public void testFindAll2() {
        List<User> all = user.findAll();
        all.forEach(a -> System.out.println(a));
    }

    @Test
    public void testFindAll3() {
        List<User> all = user.findAll();
        for (User user1 : all) {
            System.out.println(user1);
        }
    }


    @Test
    public void testDelete() {
        user.delete(null);
    }

    @Test
    public void testDropTable() {
        user.dropTable();
    }
}
