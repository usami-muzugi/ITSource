package cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.dao.impl;

import cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.dao.IUserDao;
import cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-16
 * Time: 10:05
 * ProjectName: itsource.cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.dao.impl
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

public class UserImpl extends BaseImpl<User> implements IUserDao<User> {
    /**
     * 没有无参构造方法，意味着子类继承这个BaseImpl类的话，必须调用下这个方法才能生成对象
     */
    public UserImpl() {
        super(User.class);
    }

    /**
     * @param username username
     * @param password password
     * @return 如果登录成功，返回一个T的实例，如果登录失败，返回null
     */
    @Override
    public User login(String username, String password) {
        return super.login(username, password);
    }

    /**
     * 增
     *
     * @param user 一个对象
     */
    @Override
    public void save(User user) {
        super.save(user);
    }

    /**
     * 删
     *
     * @param id 一个对象的id主键
     */
    @Override
    public void delete(Long id) {
        super.delete(id);
    }

    /**
     * 改
     *
     * @param user 一个对象
     */
    @Override
    public void update(User user) {
        super.update(user);
    }

    /**
     * 查一个
     *
     * @param id 主键id
     * @return 查出来的对象
     */
    @Override
    public User find(Long id) {
        return super.find(id);
    }

    /**
     * 查所有的对象
     *
     * @return 所有的对象
     */
    @Override
    public ArrayList<User> findAll() {
        return super.findAll();
    }

    /**
     * 創建表
     */
    @Override
    public void createTable() {
        //        获取连接对象，并获取PreparedStatement
        Connection connection = instance.getConnection();
        PreparedStatement preparedStatement = null;
//        标准查询语句
        final String sql = "CREATE TABLE `" + User.class.getSimpleName() + "` (\n" +
                "  `id` bigint(20) NOT NULL AUTO_INCREMENT,\n" +
                "  `username` varchar(255) DEFAULT NULL,\n" +
                "  `password` varchar(255) DEFAULT NULL,\n" +
                "  `address` varchar(255) DEFAULT NULL,\n" +
                "  `Balance` double DEFAULT NULL,\n" +
                "  `sex` bit(1) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`id`)\n" +
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8";
        System.out.println(sql);
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
     * 删除表
     */
    @Override
    public void dropTable() {
        super.dropTable();
    }
}
