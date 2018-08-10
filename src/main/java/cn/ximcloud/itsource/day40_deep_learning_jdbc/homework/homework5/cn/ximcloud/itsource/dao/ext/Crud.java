package cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.ext;

import cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.util.Utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-08-06
 * Time: 22:34
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
public class Crud<T> {
    private static Utils instance;
    private static Connection connection;

    static {
        instance = Utils.INSTANCE;
    }

    public void createTable(String sql) {
        executeUpdate(sql);
    }

    public void droptable(String sql) {
        executeUpdate(sql);
    }

    public void save(String sql) {
        executeUpdate(sql);
    }

    public void delete(String sql) {
        executeUpdate(sql);
    }

    public void update(String sql) {
        executeUpdate(sql);
    }


    public ResultSet find(String sql) {
        return executeQuery(sql);
    }


    private void executeUpdate(String sql) {
        Statement statement = null;
        try {
            connection = instance.getConnection();
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            instance.close(null, statement, connection);
        }
    }

    private ResultSet executeQuery(String sql) {
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = instance.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            return resultSet;
        } catch (SQLException e) {
            instance.close(resultSet, statement, connection);
        }
        return null;
    }

}
