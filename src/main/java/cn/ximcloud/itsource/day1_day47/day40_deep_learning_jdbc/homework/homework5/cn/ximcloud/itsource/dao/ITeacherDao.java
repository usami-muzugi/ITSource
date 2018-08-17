package cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: wzard
 * Date: 2018-08-05
 * Time: 16:52
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.IUserDao
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

public interface ITeacherDao<T> extends IBasicDao<T> {

    /**
     * 增
     *
     * @param t
     */
    void save(T t);

    /**
     * 删
     *
     * @param integer 通过id来删除
     */
    void delete(Integer integer);

    /**
     * 改
     *
     * @param t 修改对象
     */
    void update(T t);

    /**
     * @param integer
     * @return 通过id来查找对象
     */
    T find(Integer integer);

    /**
     * @return 查找所有的对象
     */
    List<T> findAll();


    /**
     * 通过id获取老师的工资
     *
     * @param integer id
     * @return 工资
     */
    Double balance(Integer integer);
}
