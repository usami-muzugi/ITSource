package cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.dao.impl;

import cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.dao.IListDao;
import cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.domain.List;
import cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-08-10
 * Time: 23:58
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
public class ListImpl extends BaseImpl<List> implements IListDao<List> {

    /**
     *
     */
    public ListImpl() {
        super(List.class);
    }

    /**
     * 保存方法，保存一个T
     *
     * @param list 一个实例对象
     */
    @Override
    public void save(List list) {
        super.save(list);
    }

    /**
     * 更新方法，更新该对象
     *
     * @param list 通过传入一个对象来查询并更新
     */
    @Override
    public void update(List list) {
        super.update(list);
    }

    /**
     * 删除一个对象
     *
     * @param id 通过id主键来查找实例，然后删除该实例
     */
    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

    /**
     * 查找用户
     *
     * @param id 通过id主键来查找实力
     * @return 返回一个用户实例，如果没有查找到实例，返回null
     */
    @Override
    public List find(Integer id) {
        return super.find(id);
    }

    /**
     * 查找所有的用户
     *
     * @return 返回一个ArrayList表，表里面存放的是每一个实例
     */
    @Override
    public ArrayList<List> findAll() {
        return super.findAll();
    }

    /**
     * 创建一张表
     */
    @Override
    public void createTable() {
        JDBCUtil instance = JDBCUtil.getInstance();
        Connection connection = instance.getConnection();
        final String sql = "CREATE TABLE `list` (\n" +
                "  `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `name` varchar(255) DEFAULT NULL,\n" +
                "  `type` varchar(255) DEFAULT NULL,\n" +
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
     * 删除这张表
     */
    @Override
    public void dropTable() {

    }
}
