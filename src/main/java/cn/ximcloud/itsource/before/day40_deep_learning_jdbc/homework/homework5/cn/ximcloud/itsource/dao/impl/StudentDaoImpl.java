package cn.ximcloud.itsource.before.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.impl;

import cn.ximcloud.itsource.before.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.IStudentDao;
import cn.ximcloud.itsource.before.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.ext.Crud;
import cn.ximcloud.itsource.before.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.domain.Student;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: wzard
 * Date: 2018-08-05
 * Time: 16:52
 * ProjectName: itsource.cn.ximcloud.itsource.before.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.IUserDao.impl
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

public class StudentDaoImpl extends Crud implements IStudentDao<Student> {


    /**
     * 创建表
     */
    @Override
    public void createTable() {
        String sql = "CREATE TABLE `department` (\n" +
                "  `id` int(11) NOT NULL DEFAULT '0',\n" +
                "  `deptName` varchar(30) DEFAULT NULL,\n" +
                "  `teacherNumber` int(11) DEFAULT NULL,\n" +
                "  `studentNumber` int(11) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`id`)\n" +
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8;\n";
        createTable(sql);
    }

    /**
     * 删除表
     */
    @Override
    public void dropTable() {
        String sql = "DROP TABLE department";
        droptable(sql);
    }

    /**
     * 增
     *
     * @param student
     */
    @Override
    public void save(Student student) {
//        String sql = "INSERT INTO department(deptName,teacherNumber,studentNumber) values (" + department.getDeptName() + "," + department.getTeacherNumber() + "," + department.getStudentNumber() + ")";
//        save(sql);
    }

    /**
     * 删
     *
     * @param integer 通过id来删除
     */
    @Override
    public void delete(Integer integer) {
        String sql = "DELETE * FROM department WHERE id=" + integer + "";
        delete(sql);
    }

    /**
     * 改
     *
     * @param student 修改对象
     */
    @Override
    public void update(Student student) {
//        String sql = "UPDATE department(deptName,teacherNumber,studentNumber) values (" + department.getDeptName() + "," + department.getTeacherNumber() + "," + department.getStudentNumber() + ") where id=" + department.getId() + "";
//        update(sql);
    }

    /**
     * @param integer
     * @return 通过id来查找对象
     */
    @Override
    public Student find(Integer integer) {
        return null;
    }

    /**
     * @return 查找所有的对象
     */
    @Override
    public List<Student> findAll() {
        return null;
    }

    /**
     * 获取学生的成绩
     *
     * @param integer 学号
     * @return 成绩
     */
    @Override
    public int score(Integer integer) {
        return 0;
    }
}
