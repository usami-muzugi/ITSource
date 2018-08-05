package cn.ximcloud.itsource.day40_deep_learning_jdbc._02login_test.dao.impl;


import cn.ximcloud.itsource.day39_mysql_with_jdbc.homework.homework2.itsource.domain.Student;
import cn.ximcloud.itsource.day40_deep_learning_jdbc._02login_test.dao.IStudentDAO;
import cn.ximcloud.itsource.day40_deep_learning_jdbc._02login_test.unit.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wizard
 * Date: 2018-08-03
 * Time: 15:59
 * ProjectName: itsource.cn.ximcloud.itsource.day39_mysql_with_jdbc.homework.homework2.itsource.unit
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
 * 学习preparedStatement
 **/

public class StudentDAOImpl implements IStudentDAO {
    private JDBCUtil jdbcUtil = JDBCUtil.getInstance();


    /**
     * 增
     * 向表里添加一个Student实例对象
     *
     * @param student 一个Student的实例
     */
    @Override
    public void save(Student student) {
        Connection connection = jdbcUtil.getConnection();
        PreparedStatement statement = null;
        try {
            final String SQL = "INSERT INTO student(stu_name,stu_age) values (?,?)";
            statement = connection.prepareStatement(SQL);
            statement.setString(1, student.getName());
            statement.setInt(2, student.getAge());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtil.close(connection, statement, null);
        }
    }

    /**
     * 删
     * 从表里删除一的用户
     *
     * @param integer 通过id来删除用户
     */
    @Override
    public void delete(Integer integer) {
        Connection connection = jdbcUtil.getConnection();
        PreparedStatement statement = null;
        try {
            final String SQL = "DELETE FROM student WHERE stu_id=?";
            statement = connection.prepareStatement(SQL);
            statement.setInt(1, integer);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtil.close(connection, statement, null);
        }
    }

    /**
     * 改
     * 从表里修改一个学生
     *
     * @param student 被修改的学生
     */
    @Override
    public void update(Student student) {
        Connection connection = jdbcUtil.getConnection();
        PreparedStatement statement = null;
        try {
            final String SQL = "INSERT INTO student(stu_name,stu_age) values (?,?) WHERE stu_id=?";
            statement = connection.prepareStatement(SQL);
            statement.setString(1, student.getName());
            statement.setInt(2, student.getAge());
            statement.setInt(3, student.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtil.close(connection, statement, null);
        }
    }

    /**
     * 通过id来查找学生
     *
     * @param integer 学生的id
     * @return 返回被查找的学生
     */
    @Override
    public Student find(Integer integer) {
        Connection connection = jdbcUtil.getConnection();
        PreparedStatement statement = null;
        try {
            final String SQL = "SELECT * FROM student WHERE id=?";
            statement = connection.prepareStatement(SQL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                return new Student(resultSet.getInt("stu_id"), resultSet.getString("stu_name"), resultSet.getInt("stu_age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtil.close(connection, statement, null);
        }
        return null;
    }

    /**
     * 查
     * 查询出所有的学生
     *
     * @return 返回一个ArrayList表
     */
    @Override
    public List<Student> findAll() {
        List<Student> list = new ArrayList<>();
        Connection connection = jdbcUtil.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            final String SQL = "SELECT * FROM student";
            statement = connection.prepareStatement(SQL);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                list.add(new Student(resultSet.getInt("stu_id"), resultSet.getString("stu_name"), resultSet.getInt("stu_age")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtil.close(connection, statement, resultSet);
        }
        return list;
    }

    /**
     * @param username username
     * @param password passoword
     * @return student instance or null
     */
    @Override
    public Student login(String username, String password) {
        Connection connection = jdbcUtil.getConnection();
        PreparedStatement statement = null;
        Student student = null;
        try {
            final String SQL = "SELECT * From test_student WHERE stu_name = ? AND stu_age = ?";
            statement = connection.prepareStatement(SQL);
            statement.setString(1, username);
            statement.setInt(2, Integer.valueOf(password));
            ResultSet resultSet = statement.executeQuery();
            student = new Student();
            while (resultSet.next()) {
                student.setAge(resultSet.getInt("stu_age"));
                student.setId(resultSet.getInt("stu_id"));
                student.setName(resultSet.getString("stu_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }
        return student;
    }

    /**
     * @param username username
     * @return student instance or null
     */
    @Override
    public Student login(String username) {
        return null;
    }
}
