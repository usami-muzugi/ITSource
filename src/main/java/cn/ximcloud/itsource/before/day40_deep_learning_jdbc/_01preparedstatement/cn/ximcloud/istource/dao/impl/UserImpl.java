package cn.ximcloud.itsource.before.day40_deep_learning_jdbc._01preparedstatement.cn.ximcloud.istource.dao.impl;

import cn.ximcloud.itsource.before.day40_deep_learning_jdbc._01preparedstatement.cn.ximcloud.istource.dao.IUser;
import cn.ximcloud.itsource.before.day40_deep_learning_jdbc._01preparedstatement.cn.ximcloud.istource.domain.User;
import cn.ximcloud.itsource.before.day40_deep_learning_jdbc._01preparedstatement.cn.ximcloud.istource.jdbcutil.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: wizard
 * Date: 2018-08-06
 * Time: 09:12
 * ProjectName: itsource.cn.ximcloud.itsource.before.day40_deep_learning_jdbc._01preparedstatement.cn.ximcloud.istource.dao.impl
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

public class UserImpl implements IUser {
    private static JDBCUtils jdbcUtils = JDBCUtils.getInstance();

    /**
     * 创建表 test_user
     */
    @Override
    public void createTable() {
        Connection connection = jdbcUtils.getConnection();
        PreparedStatement preparedStatement = null;
        final String SQL = "CREATE TABLE `test_user` (\n" +
                "  `id` INT(20) NOT NULL AUTO_INCREMENT,\n" +
                "  `user_name` varchar(30) DEFAULT NULL,\n" +
                "  `user_password` varchar(30) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`id`)\n" +
                ") ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;\n" +
                "\n";
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.close(connection, preparedStatement, null);
        }
    }

    /**
     * 删除表
     */
    @Override
    public void dropTable() {
        Connection connection = jdbcUtils.getConnection();
        PreparedStatement preparedStatement = null;
        final String SQL = "DROP TABLE test_user";
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.close(connection, preparedStatement, null);
        }
    }

    /**
     * 存储一个用户
     *
     * @param user
     */
    @Override
    public void save(User user) {
        Connection connection = jdbcUtils.getConnection();
        PreparedStatement preparedStatement = null;
        final String SQL = "INSERT INTO test_user (user_name,user_password) VALUES (?,?)";
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.close(connection, preparedStatement, null);
        }
    }

    /**
     * 通过id来删除一个用户
     *
     * @param id 用户的id
     */
    @Override
    public void delete(Integer id) {
        Connection connection = jdbcUtils.getConnection();
        PreparedStatement preparedStatement = null;
        final String SQL = "DELETE * From test_user WHERE id=?";
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.close(connection, preparedStatement, null);
        }
    }

    /**
     * 通过该user来更新一个用户
     *
     * @param user 用户实例
     */
    @Override
    public void update(User user) {
        Connection connection = jdbcUtils.getConnection();
        PreparedStatement preparedStatement = null;
        final String SQL = "INSERT INTO test_user (id,user_name,user_password) VALUES (?,?,?) WHERE id=?";
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setInt(1, user.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.close(connection, preparedStatement, null);
        }
    }

    /**
     * 通过id来查找到一个用户
     *
     * @param id id
     * @return 返回一个用户实例
     */
    @Override
    public User find(Integer id) {
        Connection connection = jdbcUtils.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        final String SQL = "SELECT * FROM test_user WHERE id=?";
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            String user_name = resultSet.getString("user_name");
            String user_password = resultSet.getString("user_password");
            return new User(id, user_name, user_password);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.close(connection, preparedStatement, resultSet);
        }
        return null;
    }

    /**
     * 通过用户名来查找一个用户
     *
     * @param userName 该用户的名字
     * @return 返回一个用户实例或者返回null
     */
    @Override
    public User find(String userName) {
        Connection connection = jdbcUtils.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        User user = null;
        final String SQL = "SELECT * FROM test_user WHERE user_name=?";
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, userName);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String user_name = resultSet.getString("user_name");
                String user_password = resultSet.getString("user_password");
                user = new User(id, user_name, user_password);
                break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.close(connection, preparedStatement, resultSet);
        }
        return user;
    }

    /**
     * 查找该表中的所有用户
     *
     * @return 返回一个list集合，如果有用户该集合不为空
     */
    @Override
    public List findAll() {
        Connection connection = jdbcUtils.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<User> users = new ArrayList<>();
        final String sql = "SELECT * FROM test_user";
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String user_name = resultSet.getString("user_name");
                String user_password = resultSet.getString("user_password");
                users.add(new User(id, user_name, user_password));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.close(connection, preparedStatement, resultSet);
        }
        return users;
    }
}
