package cn.ximcloud.itsource.day1_day47.day47_login_ordersale._03captcha.dao.impl;


import cn.ximcloud.itsource.day1_day47.day47_login_ordersale._03captcha.dao.IStudentDao;
import cn.ximcloud.itsource.day1_day47.day47_login_ordersale._03captcha.domain.Student;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-14
 * Time: 09:11
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day46_rebuild._01rebuild.dao.impl
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

public class StudentImpl extends BaseImpl<Student> implements IStudentDao<Student> {

    /**
     * 这个方法是真的棒!(๑•̀ㅂ•́)و✧，获得运行时类型
     */
    public StudentImpl() {
        super(Student.class);
    }

    /**
     * 保存方法，保存一个T
     * 被保存的这个t对象，应该是没有id这个字段的。
     *
     * @param student 一个实例对象
     */
    @Override
    public void save(Student student) {
        super.save(student);
    }

    /**
     * 更新方法，更新该对象
     * 更新是必须要有id这个字段的，用id这个字段来更新
     *
     * @param student 通过传入一个对象来查询并更新
     */
    @Override
    public void update(Student student) {
        super.update(student);
    }

    /**
     * 删除一个对象
     *
     * @param id 通过id主键来查找实例，然后删除该实例
     */
    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

    /**
     * 查找用户
     *
     * @param id 通过id主键来查找实例
     * @return 返回一个用户实例，如果没有查找到实例，返回null
     */
    @Override
    public Student find(Integer id) {
        return super.find(id);
    }

    /**
     * 查找所有的用户
     *
     * @return 返回一个ArrayList表，表里面存放的是每一个实例
     */
    @Override
    public ArrayList<Student> findAll() {
        return super.findAll();
    }

    /**
     * 創建表
     */
    @Override
    public void createTable() {
        super.createTable();
    }

    /**
     * 删除表
     */
    @Override
    public void dropTable() {
        super.dropTable();
    }
}
