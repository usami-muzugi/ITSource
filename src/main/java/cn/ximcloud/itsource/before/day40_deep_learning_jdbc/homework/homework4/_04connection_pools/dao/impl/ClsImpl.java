package cn.ximcloud.itsource.before.day40_deep_learning_jdbc.homework.homework4._04connection_pools.dao.impl;

import cn.ximcloud.itsource.before.day40_deep_learning_jdbc._04connection_pools.dao.IClassDao;
import cn.ximcloud.itsource.before.day40_deep_learning_jdbc._04connection_pools.domain.Cls;
import cn.ximcloud.itsource.before.day40_deep_learning_jdbc._04connection_pools.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: wzard
 * Date: 2018-08-06
 * Time: 11:46
 * ProjectName: itsource.cn.ximcloud.itsource.before.day40_deep_learning_jdbc._04connection_pools.dao.impl
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

public class ClsImpl implements IClassDao<Cls> {
    private static JDBCUtils instance;

    static {
        instance = JDBCUtils.INSTANCE;
    }

    /**
     * 创建表
     */
    @Override
    public void createTable() {
        Connection connection = instance.getConnection();
        final String sql = "CREATE TABLE `cls` (\n" +
                "  `id` int(30) NOT NULL AUTO_INCREMENT,\n" +
                "  `className` varchar(30) DEFAULT NULL,\n" +
                "  `studentNumber` int(30) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`id`)\n" +
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8;";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(null, preparedStatement, connection);
        }
    }

    /**
     * 删除表
     */
    @Override
    public void droptable() {
        Connection connection = instance.getConnection();
        final String sql = "DROP TABLE cls";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(null, preparedStatement, connection);
        }
    }

    /**
     * 增
     *
     * @param cls
     */
    @Override
    public void save(Cls cls) {

    }

    /**
     * 删
     *
     * @param id
     */
    @Override
    public void delete(Integer id) {

    }

    /**
     * 改
     *
     * @param cls
     */
    @Override
    public void update(Cls cls) {

    }


    /**
     * 查
     *
     * @param id
     * @return
     */
    @Override
    public Cls find(Integer id) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Cls> findAll() {
        return null;
    }
}
