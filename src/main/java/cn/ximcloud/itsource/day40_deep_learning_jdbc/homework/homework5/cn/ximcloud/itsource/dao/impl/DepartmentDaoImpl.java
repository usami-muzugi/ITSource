package cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.impl;

import cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.IDepartmentDao;
import cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.ext.Crud;
import cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.domain.Department;
import cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.util.Utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: wzard
 * Date: 2018-08-06
 * Time: 11:13
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

public class DepartmentDaoImpl extends Crud<Department> implements IDepartmentDao<Department> {
    /**
     * 创建表
     */
    @Override
    public void createTable() {
    }

    /**
     * 删除表
     */
    @Override
    public void droptable() {
        String sql = "DROP TABLE department";
        droptable(sql);
    }

    /**
     * 增
     *
     * @param department
     */
    @Override
    public void save(Department department) {
        String sql = "INSERT INTO department(deptName,teacherNumber,studentNumber) values (" + department.getDeptName() + "," + department.getTeacherNumber() + "," + department.getStudentNumber() + ")";
        save(sql);
    }

    /**
     * 删
     *
     * @param id
     */
    @Override
    public void delete(Integer id) {
        String sql = "DELETE * FROM department WHERE id=" + id + "";
        delete(sql);
    }

    /**
     * 改
     *
     * @param department
     */
    @Override
    public void update(Department department) {
        String sql = "UPDATE department(deptName,teacherNumber,studentNumber) values (" + department.getDeptName() + "," + department.getTeacherNumber() + "," + department.getStudentNumber() + ") where id=" + department.getId() + "";
        update(sql);
    }


    /**
     * 查
     *
     * @param id
     * @return
     */
    @Override
    public Department find(Integer id) {
        String sql = "SELECT * FROM department WHERE id= " + id + "";
        ResultSet resultSet = find(sql);
        Department department = null;
        try {
            resultSet.next();
            department = new Department();
            department.setId(resultSet.getInt("id"));
            department.setDeptName(resultSet.getString("deptName"));
            department.setStudentNumber(resultSet.getInt("teacherNumber"));
            department.setTeacherNumber(resultSet.getInt("studentNumber"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return department;
    }

    /**
     * @return
     */
    @Override
    public List<Department> findAll() {
        String sql = "SELECT * FROM department WHERE";
        ResultSet resultSet = find(sql);
        List<Department> list = new ArrayList<>();
        try {
            while (resultSet.next()) {
                Department department = new Department();
                department.setId(resultSet.getInt("id"));
                department.setDeptName(resultSet.getString("deptName"));
                department.setStudentNumber(resultSet.getInt("teacherNumber"));
                department.setTeacherNumber(resultSet.getInt("studentNumber"));
                list.add(department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
