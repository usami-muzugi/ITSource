package cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.dao.impl;

import cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.dao.IStudentDao;
import cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.domain.Student;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-13
 * Time: 12:13
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.dao.impl
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
    public StudentImpl() {
        super(Student.class);
    }

    /**
     * 增
     *
     * @param student 一个对象
     */
    @Override
    public void save(Student student) {
        super.save(student);
    }

    /**
     * 删
     *
     * @param id 一个对象的ID主键
     */
    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

    /**
     * 改
     *
     * @param student 一个对象
     */
    @Override
    public void update(Student student) {
        super.update(student);
    }

    /**
     * 查一个
     *
     * @param id 主键id
     * @return 查出来的对象
     */
    @Override
    public Student find(Integer id) {
        return super.find(id);
    }

    /**
     * 查所有的对象
     *
     * @return 所有的对象
     */
    @Override
    public ArrayList<Student> findAll() {
        return super.findAll();
    }
}
