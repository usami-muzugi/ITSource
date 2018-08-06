package cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.impl;

import cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.IUserDao;
import cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.ext.Crud;
import cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.domain.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: wzard
 * Date: 2018-08-06
 * Time: 12:58
 * ProjectName: itsource.cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.impl
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

public class UserDapImpl extends Crud implements IUserDao<User> {
    /**
     * 创建表
     */
    public void createTable() {
        String sql = "UPDATE department(deptName,teacherNumber,studentNumber) values (" + department.getDeptName() + "," + department.getTeacherNumber() + "," + department.getStudentNumber() + ") where id=" + department.getId() + "";
        update(sql);
    }

    /**
     * 删除表
     */
    public void dropTable() {
        String sql = "DROP TABLE department";
        droptable(sql);
    }

    /**
     * 增
     *
     * @param user
     */
    public void save(User user) {
        String sql = "INSERT INTO department(deptName,teacherNumber,studentNumber) values (" + department.getDeptName() + "," + department.getTeacherNumber() + "," + department.getStudentNumber() + ")";
        save(sql);
    }

    /**
     * 删
     *
     * @param integer 通过id来删除
     */
    public void delete(Integer integer) {
        String sql = "DELETE * FROM department WHERE id=" + id + "";
        delete(sql);
    }

    /**
     * 改
     *
     * @param user 修改对象
     */
    public void update(User user) {
        String sql = "UPDATE department(deptName,teacherNumber,studentNumber) values (" + department.getDeptName() + "," + department.getTeacherNumber() + "," + department.getStudentNumber() + ") where id=" + department.getId() + "";
        update(sql);
    }

    /**
     * @param integer
     * @return 通过id来查找对象
     */
    public User find(Integer integer) {
        return null;
    }

    /**
     * @return 查找所有的对象
     */
    public List<User> findAll() {
        return null;
    }
}
