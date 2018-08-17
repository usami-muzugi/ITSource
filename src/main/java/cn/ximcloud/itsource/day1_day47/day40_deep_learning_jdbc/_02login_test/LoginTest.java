package cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._02login_test;

import cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._02login_test.dao.impl.UserImpl;
import cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._02login_test.domain.User;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-06
 * Time: 15:14
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._02login_test
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

public class LoginTest {
    private static UserImpl user;

    @BeforeClass
    public static void doBeforeClass() {
        user = new UserImpl();
//        创建表操作
//        user.createTable();
    }

    /**
     * 保存用户
     */
    @Test
    public void testSaveUser() {
        User testUser = new User();
        testUser.setUserName("彭睿4");
        testUser.setPassWord("password");

        user.save(testUser);
    }


    /**
     * 查找出所有的用户
     */
    @Test
    public void testFindAll() {
        List<User> all = user.findAll();
        all.forEach(x -> System.out.print(x + "\t"));
        all.forEach(System.out::println);
    }


    /**
     * 测试删除一行用过户
     */
    @Test
    public void testDeleteUser() {
        user.delete(4);
    }


    /**
     * 这种登录的方法，安全性高一些
     */
    @Test
    public void testLogin() {
        String userName = "彭睿1";
        String passWord = "password";
        if (user.login1(userName, passWord)) {
            System.out.println("验证成功！");
        } else {
            System.out.println("验证失败！");
        }
    }

    /**
     * 这种登录的方法，安全行低一些，但是用户体验还是比较好的
     */
    @Test
    public void testLogin2() {
        String userName = "彭睿3";
        String passWord = "passwor111112312d";
        User user = LoginTest.user.login2(userName, passWord);
        if (user == null) {
            System.out.println("验证失败！");
        } else {
            if (user.getPassWord().equals(passWord)) {
                System.out.println("认证成功！");
            } else {
                System.out.println("用户名正确，密码错误！");
            }
        }
    }

//    @AfterClass
//    public static void  doAfterClass() {
//        user.dropTable();
//    }

}
