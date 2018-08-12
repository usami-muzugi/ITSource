package cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.dao.impl;

import cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.dao.IUserDao;
import cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.domain.User;
import cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.utils.JDBCUtil;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-08-10
 * Time: 23:58
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
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
 * //         佛祖保佑          永无BUG          永不修改             //
 * ////////////////////////////////////////////////////////////////////
 **/
public class UserImpl extends BaseImpl<User> implements IUserDao<User> {
    /**
     * 父类没有有参构造方法，这里必须操作一下
     */
    public UserImpl() {
        super(User.class);
    }

    /**
     * 用户登录
     *
     * @param id       id主键
     * @param password 用户密码
     * @return 返回用户，没有找到返回null
     */
    @Override
    public User login(Integer id, String password) {
        User user = find(id);
        if (user != null) {
            if (user.getId().equals(id) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public User login(String username, String password) {
        Integer integer;
        try {
            integer = Integer.valueOf(username);
            return login(integer, password);
        } catch (NumberFormatException e) {
            JDBCUtil instance = JDBCUtil.getInstance();
            Connection connection = instance.getConnection();
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            final String sql = "SELECT id FROM User WHERE username=?";
            System.out.println(sql);
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, username);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    return login(resultSet.getInt(1), password);
                }
            } /*finally {
            instance.close(resultSet, preparedStatement, connection);
        }*/ catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 保存方法，保存一个T
     *
     * @param user 一个实例对象
     */
    @Override
    public void save(User user) {
        super.save(user);
    }

    /**
     * 更新方法，更新该对象
     *
     * @param user 通过传入一个对象来查询并更新
     */
    @Override
    public void update(User user) {
        super.update(user);
    }

    /**
     * 删除一个对象
     *
     * @param id 通过id主键来查找实例，然后删除该实例
     */
    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

    /**
     * 查找用户
     *
     * @param id 通过id主键来查找实力
     * @return 返回一个用户实例，如果没有查找到实例，返回null
     */
    @Override
    public User find(Integer id) {
        return super.find(id);
    }

    /**
     * 查找所有的用户
     *
     * @return 返回一个ArrayList表，表里面存放的是每一个实例
     */
    @Override
    public ArrayList<User> findAll() {
        return super.findAll();
    }

    /**
     * 创建一张表
     */
    @Override
    public void createTable() {
        JDBCUtil instance = JDBCUtil.getInstance();
        Connection connection = instance.getConnection();
        final String sql = "CREATE TABLE `user` (\n" +
                "  `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `username` varchar(255) DEFAULT NULL,\n" +
                "  `password` varchar(255) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`id`)\n" +
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8;";
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
     * 删除这张表
     */
    @Override
    public void dropTable() {

    }
}
