package cn.ximcloud.itsource.day1_day47.day39_mysql_with_jdbc.homework.homework2.itsource.dao.impl;

import cn.ximcloud.itsource.day1_day47.day39_mysql_with_jdbc.homework.homework2.itsource.dao.IStudentDAO;
import cn.ximcloud.itsource.day1_day47.day39_mysql_with_jdbc.homework.homework2.itsource.domain.Student;
import cn.ximcloud.itsource.day1_day47.day39_mysql_with_jdbc.homework.homework2.itsource.unit.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-08-03
 * Time: 15:59
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day39_mysql_with_jdbc.homework.homework2.itsource.unit
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
        Statement statement = null;
        try {
            statement = connection.createStatement();
            final String SQL = "INSERT INTO student(stu_name,stu_age) values " + student.getName() + ", " + student.getAge();
            statement.executeUpdate(SQL);
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
        Statement statement = null;
        try {
            statement = connection.createStatement();
            final String SQL = "DELETE FROM student WHERE stu_id=" + integer;
            statement.executeUpdate(SQL);
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
        Statement statement = null;
        try {
            statement = connection.createStatement();
            final String SQL = "INSERT INTO student(stu_name,stu_age) values " + student.getName() + ", " + student.getAge() + " WHERE stu_id=" + student.getId();
            statement.executeUpdate(SQL);
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
        Statement statement = null;
        try {
            statement = connection.createStatement();
            final String SQL = "SELECT * FROM student WHERE id=" + integer;
            ResultSet resultSet = statement.executeQuery(SQL);
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
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            final String SQL = "SELECT * FROM student WHERE";
            resultSet = statement.executeQuery(SQL);
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
}
