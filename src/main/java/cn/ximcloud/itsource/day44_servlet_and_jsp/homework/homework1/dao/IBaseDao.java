package cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.dao;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-08-10
 * Time: 23:57
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
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
 * //         佛祖保佑          永无BUG          永不修改             //
 * ////////////////////////////////////////////////////////////////////
 **/
public interface IBaseDao<T> {
    /**
     * 保存方法，保存一个T
     * @param t 一个实例对象
     */
    void save(T t);

    /**
     * 更新方法，更新该对象
     * @param t 通过传入一个对象来查询并更新
     */
    void update(T t);

    /**
     * 删除一个对象
     * @param id    通过id主键来查找实例，然后删除该实例
     */
    void delete(Integer id);

    /**
     * 查找用户
     * @param id 通过id主键来查找实力
     * @return  返回一个用户实例，如果没有查找到实例，返回null
     */
    T find(Integer id);

    /**
     * 查找所有的用户
     * @return  返回一个ArrayList表，表里面存放的是每一个实例
     */
    ArrayList<T> findAll();


    /**
     *  创建一张表
     */
    void createTable();

    /**
     *  删除这张表
     */
    void dropTable();
}
