package cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.dao.impl;


import cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.dao.IListDao;
import cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.domain.StudentList;

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
 * Entity
 * JavaBean
 **/
public class ListImpl extends BaseImpl<StudentList> implements IListDao<StudentList> {


    public ListImpl() {
        super(StudentList.class);
    }

    /**
     * 增
     *
     * @param studentList 一个对象
     */
    @Override
    public void save(StudentList studentList) {
        super.save(studentList);
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
     * @param studentList 一个对象
     */
    @Override
    public void update(StudentList studentList) {
        super.update(studentList);
    }

    /**
     * 查一个
     *
     * @param id 主键id
     * @return 查出来的对象
     */
    @Override
    public StudentList find(Integer id) {
        return super.find(id);
    }

    /**
     * 查所有的对象
     *
     * @return 所有的对象
     */
    @Override
    public ArrayList<StudentList> findAll() {
        return super.findAll();
    }
}
