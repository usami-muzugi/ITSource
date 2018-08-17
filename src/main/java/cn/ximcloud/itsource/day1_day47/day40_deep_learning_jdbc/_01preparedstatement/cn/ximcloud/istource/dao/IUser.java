package cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._01preparedstatement.cn.ximcloud.istource.dao;

import cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._01preparedstatement.cn.ximcloud.istource.domain.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: wzard
 * Date: 2018-08-06
 * Time: 09:11
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day40_deep_learning_jdbc._01preparedstatement.cn.ximcloud.istource.domain
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

public interface IUser {

    /**
     * 创建表
     */
    void createTable();

    /**
     * 删除表
     */
    void dropTable();


    /**
     * 保存一个对象到 表中
     *
     * @param t 保存的对象
     */
    void save(User t);

    /**
     * 通过主键id来删除一个对象
     *
     * @param id
     */
    void delete(Integer id);

    /**
     * 通过一个对象来更新改行数据信息
     *
     * @param t
     */
    void update(User t);

    /**
     * 通过id来查找
     *
     * @param id 唯一主键id
     * @return 返回一个User对象  null表示未查询到
     */
    User find(Integer id);

    /**
     * 通过userName来查找
     *
     * @param userName 用户名
     * @return 返回一个Ueser对象 null表示未查询到
     */
    User find(String userName);


    /**
     * 查找出所有的对象并以List的形式返回
     *
     * @return 返回List对象，内部存放User对象
     */
    List<User> findAll();

}
