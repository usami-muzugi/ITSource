package cn.ximcloud.itsource.day42_learning_servlet.homework.homework3.dao.impl;

import cn.ximcloud.itsource.day42_learning_servlet.homework.homework3.dao.IUserDao;
import cn.ximcloud.itsource.day42_learning_servlet.homework.homework3.domain.User;
import cn.ximcloud.itsource.day42_learning_servlet.homework.homework3.utils.JDBCUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-09
 * Time: 15:52
 * ProjectName: itsource.cn.ximcloud.itsource.day42_learning_servlet.homework.homework3.dao
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

public class UserImpl implements IUserDao {

    private static Connection connection;

    static {
        connection = JDBCUtil.getInstance().getConnection();
    }

    @Override
    public User find(String username, String password) {
        if (!(username == null || password == null || username.length() == 0 || password.length() == 0)) {
            final String sql = "SELECT * FROM user WHERE username=? AND password=?";
            try {
                User user;
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,username);
                preparedStatement.setString(2, password);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    user = new User(resultSet.getInt("id"),
                            resultSet.getString("username"),
                            resultSet.getString("password"),
                            resultSet.getString("hobby"));
//                    System.out.println("user:"+user);
                    return user;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
