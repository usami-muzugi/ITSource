package cn.ximcloud.itsource.day40_deep_learning_jdbc._02login_test;

import cn.ximcloud.itsource.day39_mysql_with_jdbc.homework.homework2.itsource.domain.Student;
import cn.ximcloud.itsource.day40_deep_learning_jdbc._02login_test.dao.IStudentDAO;
import cn.ximcloud.itsource.day40_deep_learning_jdbc._02login_test.dao.impl.StudentDAOImpl;
import cn.ximcloud.itsource.day40_deep_learning_jdbc._02login_test.unit.JDBCUtil;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Connection;

/**
 * Created by IntelliJ IDEA.
 * Author: wzard
 * Date: 2018-08-05
 * Time: 10:36
 * ProjectName: itsource.cn.ximcloud.itsource.day40_deep_learning_jdbc._01preparedstatement
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
    private static Connection connection;
    private static IStudentDAO studentDAO;


    /**
     * doBefore
     * get JDBCUtil instance and studentDAO instance
     */
    @BeforeClass
    public static void testConnection() {
        connection = JDBCUtil.getInstance().getConnection();
        studentDAO = new StudentDAOImpl();
    }


    @Test
    public void testLogin() {
        String username = "balabala";
        String password = "123123";
        Student login = studentDAO.login(username, password);
        System.out.println(login);
    }

    @Test
    public void testLogin2() {
        String username = "balabala";
        String password = "123123";
        Student login = studentDAO.login(username);
        System.out.println(login);
    }

}
