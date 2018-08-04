package cn.ximcloud.itsource.day39_mysql_with_jdbc._02_learning_DAO.cn.ximcloud.itsource.dao.impl;

import cn.ximcloud.itsource.day39_mysql_with_jdbc._02_learning_DAO.cn.ximcloud.itsource.dao.IStudentDAO;
import cn.ximcloud.itsource.day39_mysql_with_jdbc._02_learning_DAO.cn.ximcloud.itsource.domain.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
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
 **/

public class StudentDAOImpl implements IStudentDAO {
    /**
     * initial
     * JDBC  jdbc:mysql://主机地址:端口号/库名
     * USERNAME  数据库用户名
     * PASSWORD  数据库密码
     */

    private static final String HOST = "127.0.0.1";
    private static final String PORT = "3306";
    private static final String DATABASE = "itsource";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "*********";
    private static final StringBuffer stringBuffer = new StringBuffer();
    private static Connection connection;

    static {
        stringBuffer.append("jdbc:mysql://").append(HOST).append(":").append(PORT).append("/").append(DATABASE);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("リンケ　スタート！");
            connection = DriverManager.getConnection(stringBuffer.toString(), USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
//        3.选取又三个String的参数列表的这个getConnection()方法，分别对应的是连接主机URL，用户名，密码.获得Connection实例
    }

    /**
     * 增
     * 向表里添加一个Student实例对象
     *
     * @param student 一个Student的实例
     */
    @Override
    public void save(Student student) {
        try (
                Statement statement = connection.createStatement()
        ) {
            final String SQL = "INSERT INTO student(stu_name,stu_age) values " + student.getName() + ", " + student.getAge();
            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
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
        try (Statement statement = connection.createStatement()) {
            final String SQL = "DELETE FROM student WHERE stu_id=" + integer;
            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
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
        try (
                Statement statement = connection.createStatement()
        ) {
            final String SQL = "INSERT INTO student(stu_name,stu_age) values " + student.getName() + ", " + student.getAge() + " WHERE stu_id=" + student.getId();
            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
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
        try (
                Statement statement = connection.createStatement()
        ) {
            final String SQL = "SELECT * FROM student WHERE id=" + integer;
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                return new Student(resultSet.getInt("stu_id"), resultSet.getString("stu_name"), resultSet.getInt("stu_age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
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
        try (
                Statement statement = connection.createStatement()
        ) {
            final String SQL = "SELECT * FROM student WHERE";
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                list.add(new Student(resultSet.getInt("stu_id"), resultSet.getString("stu_name"), resultSet.getInt("stu_age")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 创建表
     */
    public void createTable() {
        try (
                Statement statement = connection.createStatement()
        ) {
            final String SQL = "CREATE  TABLE student(stu_id INT,stu_name VARCHAR (30),stu_age INT )";
            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
