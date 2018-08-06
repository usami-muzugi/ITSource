package cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework4._04connection_pools.dao;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: wzard
 * Date: 2018-08-06
 * Time: 11:47
 * ProjectName: itsource.cn.ximcloud.itsource.day40_deep_learning_jdbc._04connection_pools.dao
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

public interface IbasicDao<T> {

    /**
     * 创建表
     */
    void createTable();

    /**
     * 删除表
     */
    void droptable();

    /**
     * 增
     *
     * @param t
     */
    void save(T t);

    /**
     * 删
     *
     * @param id
     */
    void delete(Integer id);

    /**
     * 改
     *
     * @param id
     */
    void update(Integer id);

    /**
     * 查
     *
     * @param id
     * @return
     */
    T find(Integer id);

    /**
     * @return
     */
    List<T> findAll();


}
