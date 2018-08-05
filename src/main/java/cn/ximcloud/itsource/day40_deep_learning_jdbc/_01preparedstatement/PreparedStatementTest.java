package cn.ximcloud.itsource.day40_deep_learning_jdbc._01preparedstatement;

import cn.ximcloud.itsource.day39_mysql_with_jdbc.homework.homework2.itsource.dao.IStudentDAO;
import cn.ximcloud.itsource.day39_mysql_with_jdbc.homework.homework2.itsource.unit.JDBCUtil;
import cn.ximcloud.itsource.day40_deep_learning_jdbc._01preparedstatement.dao.impl.StudentDAOImpl;
import cn.ximcloud.itsource.day40_deep_learning_jdbc._01preparedstatement.domain.Student;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

public class PreparedStatementTest {
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


    /**
     * create table by using preparedStatement
     */
    @Test
    public void testCreateTable() {
        final String SQL = "CREATE TABLE test_student (stu_id INT,stu_name VARCHAR (30),stu_age INT )";
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * insert a student instance to table
     */
    @Test
    public void testSave() {
        Student student = new Student();
        student.setId(100);
        student.setAge(20);
        student.setName("彭睿");
        final String SQL = "INSERT INTO test_student VALUES (?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Update student
     */
    @Test
    public void testUpdate() {
        Student student = new Student();
        student.setId(100);
        student.setAge(20);
        student.setName("彭睿二号");
        final String SQL = "UPDATE test_student SET stu_id=?,stu_name=?,stu_age=? WHERE stu_id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.setInt(4, student.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     *
     */
    @Test
    public void testSelect() {
        Integer integer = 1;
        final String SQL = "SELECT * FROM test_student WHERE stu_id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            preparedStatement.setInt(1, integer);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(new Student(resultSet.getInt("stu_id"), resultSet.getString("stu_name"), resultSet.getInt("stu_age")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
