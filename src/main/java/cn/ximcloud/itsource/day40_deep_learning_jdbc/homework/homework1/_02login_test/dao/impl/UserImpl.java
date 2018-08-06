package cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework1._02login_test.dao.impl;

import cn.ximcloud.itsource.day40_deep_learning_jdbc._02login_test.dao.IUserDao;
import cn.ximcloud.itsource.day40_deep_learning_jdbc._02login_test.domain.User;
import cn.ximcloud.itsource.day40_deep_learning_jdbc._02login_test.jdbcutil.LoginUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wizard
 * @date: 2018-08-06
 * Time: 15:18
 * ProjectName: itsource.cn.ximcloud.itsource.day40_deep_learning_jdbc._02login_test.dao.impl
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
    private static LoginUtils instance;


    static {
        instance = LoginUtils.INSTANCE;
    }


    public boolean login1(String userName, String passWord) {
        Connection connection = instance.getConnection();
        String sql = "SELECT * FROM user WHERE username=? and password=?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        User user = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, passWord);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUserName(resultSet.getString("username"));
                user.setPassWord(resultSet.getString("password"));
                break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(resultSet, preparedStatement, connection);
        }
        return user != null;
    }

    public User login2(String userName, String passWord) {
        Connection connection = instance.getConnection();
        String sql = "SELECT * FROM user WHERE username=?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        User user = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUserName(resultSet.getString("username"));
                user.setPassWord(resultSet.getString("passWord"));
                break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(resultSet, preparedStatement, connection);
        }
        return user;
    }


    /**
     * 增
     */
    @Override
    public void save(User user) {
        Connection connection = instance.getConnection();
        String sql = "INSERT INTO user(username,password) values (?,?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassWord());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(null, preparedStatement, connection);
        }
    }

    /**
     * 改
     *
     * @param user 传入一个user实例，修改其中的值
     */
    @Override
    public void update(User user) {
        Connection connection = instance.getConnection();
        String sql = "UPDATE user SET id=?,username=?,password=? WHERE id=?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.setString(3, user.getPassWord());
            preparedStatement.setInt(4, user.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(null, preparedStatement, connection);
        }
    }

    /**
     * 删
     */
    @Override
    public void delete(Integer id) {
        Connection connection = instance.getConnection();
        String sql = "DELETE FROM user WHERE id=?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(null, preparedStatement, connection);
        }
    }

    /**
     * 通过id来查找用户
     *
     * @param id id 主键
     * @return 返回一个用户，如果是null则表示没有查找到
     */
    @Override
    public User find(Integer id) {
        Connection connection = instance.getConnection();
        String sql = "SELECT * FROM user WHERE id=?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        User user = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUserName(resultSet.getString("username"));
                user.setPassWord(resultSet.getString("password"));
                break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(resultSet, preparedStatement, connection);
        }
        return user;
    }

    /**
     * 查找所有的用户
     */
    @Override
    public List<User> findAll() {
        Connection connection = instance.getConnection();
        String sql = "SELECT * FROM user";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<User> userList = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUserName(resultSet.getString("username"));
                user.setPassWord(resultSet.getString("password"));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(resultSet, preparedStatement, connection);
        }
        return userList;
    }

    /**
     * 用于初始化操作，创建一张表
     */
    public void createTable() {
        Connection connection = instance.getConnection();
        String sql = "CREATE TABLE `user` (\n" +
                "  `id` int(30) NOT NULL AUTO_INCREMENT,\n" +
                "  `username` varchar(30) DEFAULT NULL,\n" +
                "  `password` varchar(30) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`id`)\n" +
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8;\n" +
                "\n";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(null, preparedStatement, connection);
        }
    }

    /**
     * 结尾操作，删除这张表
     */
    public void dropTable() {
        Connection connection = instance.getConnection();
        String sql = "DROP TABLE user";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(null, preparedStatement, connection);
        }
    }
}
