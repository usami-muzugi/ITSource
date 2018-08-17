package cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc.homework.homework1._02login_test.dao;

import cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._02login_test.domain.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-06
 * Time: 15:15
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._02login_test.dao
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

public interface IUserDao {
    /**
     * 增
     */
    void save(User user);

    /**
     * 改
     *
     * @param user 传入一个user实例，修改其中的值
     */
    void update(User user);

    /**
     * 删
     */
    void delete(Integer id);


    /**
     * 通过id来查找用户
     *
     * @param id id 主键
     * @return 返回一个用户，如果是null则表示没有查找到
     */
    User find(Integer id);

    /**
     * 查找所有的用户
     */
    List<User> findAll();
}
