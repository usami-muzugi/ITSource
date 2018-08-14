package cn.ximcloud.itsource.day46_rebuild._01rebuild.dao.impl;


import cn.ximcloud.itsource.day46_rebuild._01rebuild.dao.IAdminDao;
import cn.ximcloud.itsource.day46_rebuild._01rebuild.domain.Admin;
import cn.ximcloud.itsource.day46_rebuild._01rebuild.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-13
 * Time: 14:23
 * ProjectName: itsource.cn.ximcloud.itsource.day45_javabean.homework.homework5.dao.impl
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

public class AdminImpl extends BaseImpl<Admin> implements IAdminDao<Admin> {

    /**
     * 这个方法是真的棒!(๑•̀ㅂ•́)و✧，获得运行时类型
     */
    public AdminImpl() {
        super(Admin.class);
    }

    @Override
    public Admin login(Integer id, String password) {
        Admin admin = find(id);
        System.out.println("admin:" + admin);
        if (admin != null) {
            if (admin.getId().equals(id) && admin.getPassword().equals(password)) {
                return admin;
            }
        }
        return null;
    }


    public Admin login(String username, String password) {
        Integer integer;
        try {
            integer = Integer.valueOf(username);
            return login(integer, password);
        } catch (NumberFormatException e) {
            JDBCUtil instance = JDBCUtil.getInstance();
            Connection connection = instance.getConnection();
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            final String sql = "SELECT id FROM Admin WHERE admin=?";
            System.out.println(sql);
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, username);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    return login(resultSet.getInt(1), password);
                }
            } /*finally {
            instance.close(resultSet, preparedStatement, connection);
        }*/ catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        return null;
    }
}
