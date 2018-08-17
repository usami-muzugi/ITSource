package cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._04connection_pools.dao.impl;

import cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._04connection_pools.dao.IStudentDao;
import cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._04connection_pools.domain.Student;
import cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._04connection_pools.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: wzard
 * Date: 2018-08-06
 * Time: 11:46
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._04connection_pools.dao.impl
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

public class StudentImpl implements IStudentDao<Student> {

    private static JDBCUtils instance;

    static {
        instance = JDBCUtils.INSTANCE;
    }

    /**
     * 创建表
     */
    @Override
    public void createTable() {
        Connection connection = instance.getConnection();
        final String sql = "CREATE TABLE `student` (\n" +
                "  `id` int(30) NOT NULL AUTO_INCREMENT,\n" +
                "  `cls` int(30) DEFAULT NULL,\n" +
                "  `name` varchar(30) DEFAULT NULL,\n" +
                "  `age` int(30) DEFAULT NULL,\n" +
                "  `address` varchar(100) DEFAULT NULL,\n" +
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
     * 删除表
     */
    @Override
    public void droptable() {
        Connection connection = instance.getConnection();
        final String sql = "DROP TABLE student";
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
     * 增
     * 往数据库里面添加一行数据
     *
     * @param student
     */
    @Override
    public void save(Student student) {
        Connection connection = instance.getConnection();
        String sql = "insert into student(name,age,address) values (?,?,?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());
            preparedStatement.setString(3, student.getAddress());
            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            generatedKeys.next();
            int anInt = generatedKeys.getInt(1);
            sql = "";


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(null, preparedStatement, connection);
        }
    }

    /**
     * 删
     *
     * @param id
     */
    @Override
    public void delete(Integer id) {
        Connection connection = instance.getConnection();
        final String sql = "";
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
     * 改
     *
     * @param student
     */
    @Override
    public void update(Student student) {

    }


    /**
     * 查
     *
     * @param id
     * @return
     */
    @Override
    public Student find(Integer id) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Student> findAll() {
        return null;
    }
}
