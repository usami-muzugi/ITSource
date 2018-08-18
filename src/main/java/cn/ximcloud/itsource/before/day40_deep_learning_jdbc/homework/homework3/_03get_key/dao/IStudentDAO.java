package cn.ximcloud.itsource.before.day40_deep_learning_jdbc.homework.homework3._03get_key.dao;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-08-03
 * Time: 16:00
 * ProjectName: itsource.cn.ximcloud.itsource.before.day39_mysql_with_jdbc.homework.homework2.itsource.unit
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

import cn.ximcloud.itsource.before.day39_mysql_with_jdbc.homework.homework2.itsource.domain.Student;

import java.util.List;

/**
 * @author Wizard
 * 增删改查
 */
public interface IStudentDAO {

    /**
     * 增
     * 向表里添加一个Student实例对象
     *
     * @param student 一个Student的实例
     */
    void save(Student student);

    /**
     * 删
     * 从表里删除一的用户
     *
     * @param integer 通过id来删除用户
     */
    void delete(Integer integer);

    /**
     * 改
     * 从表里修改一个学生
     *
     * @param student 被修改的学生
     */
    void update(Student student);


    /**
     * 通过id来查找学生
     *
     * @param integer 学生的id
     * @return 返回被查找的学生
     */
    Student find(Integer integer);

    /**
     * 查
     * 查询出所有的学生
     *
     * @return 返回一个ArrayList表
     */
    List<Student> findAll();


}
