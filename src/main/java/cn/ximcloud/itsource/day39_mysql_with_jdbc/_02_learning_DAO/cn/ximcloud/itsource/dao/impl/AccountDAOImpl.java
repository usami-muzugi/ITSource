package cn.ximcloud.itsource.day39_mysql_jdbc._02_learning_DAO.cn.ximcloud.itsource.dao.impl;

import cn.ximcloud.itsource.day39_mysql_jdbc._02_learning_DAO.cn.ximcloud.itsource.dao.IAccoutDAO;
import cn.ximcloud.itsource.day39_mysql_jdbc._02_learning_DAO.cn.ximcloud.itsource.domain.Account;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-08-04
 * Time: 15:33
 * ProjectName: itsource.cn.ximcloud.itsource.day39_mysql_jdbc._02_learning_DAO.cn.ximcloud.itsource.dao.impl
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

public class AccountDAOImpl implements IAccoutDAO {
    /**
     * 添加方法、保存
     *
     * @param account 一个具体的account对象
     */
    @Override
    public void save(Account account) {

    }

    /**
     * 更新Account实例
     *
     * @param account 一个accout实例
     */
    @Override
    public void update(Account account) {

    }

    /**
     * 删除用户，使用唯一主键就可以删除了
     *
     * @param id id
     */
    @Override
    public void delete(Integer id) {

    }

    /**
     * @param id id
     * @return 返回一个用户
     */
    @Override
    public Account find(Integer id) {
        return null;
    }

    @Override
    public List<Account> findAll() {
        return null;
    }
}
