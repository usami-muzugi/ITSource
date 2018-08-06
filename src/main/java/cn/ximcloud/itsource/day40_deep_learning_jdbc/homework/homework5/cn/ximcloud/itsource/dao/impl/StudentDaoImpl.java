package cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.impl;

import cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.IStudentDao;
import cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.domain.Student;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: wzard
 * Date: 2018-08-05
 * Time: 16:52
 * ProjectName: itsource.cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.IUserDao.impl
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

public class StudentDaoImpl implements IStudentDao<Student> {


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
    public void dropTable() {

    }

    /**
     * 增
     *
     * @param student
     */
    public void save(Student student) {

    }

    /**
     * 删
     *
     * @param integer 通过id来删除
     */
    public void delete(Integer integer) {

    }

    /**
     * 改
     *
     * @param student 修改对象
     */
    public void update(Student student) {

    }

    /**
     * @param integer
     * @return 通过id来查找对象
     */
    public Student find(Integer integer) {
        return null;
    }

    /**
     * @return 查找所有的对象
     */
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
