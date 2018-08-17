package cn.ximcloud.itsource.day1_day47.day47_login_ordersale.homework.homework1.dao;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-13
 * Time: 12:12
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.dao
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

public interface IBaseDao<T> {

    /**
     * @param id       id
     * @param password password
     * @return
     */
    T login(Long id, String password);

    /**
     * @param username username
     * @param password password
     * @return 如果登录成功，返回一个T的实例，如果登录失败，返回null
     */
    T login(String username, String password);

    /**
     * 增
     *
     * @param t 一个对象
     */
    void save(T t);

    /**
     * 删
     *
     * @param id 一个对象的id主键
     */
    void delete(Long id);

    /**
     * 改
     *
     * @param t 一个对象
     */
    void update(T t);

    /**
     * 查一个
     *
     * @param id 主键id
     * @return 查出来的对象
     */
    T find(Long id);

    /**
     * 查所有的对象
     *
     * @return 所有的对象
     */
    ArrayList<T> findAll();

    /**
     * 創建表
     */
    void createTable();

    /**
     * 删除表
     */
    void dropTable();
}
