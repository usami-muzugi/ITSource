package cn.ximcloud.itsource.before.day40_deep_learning_jdbc.homework.homework4._04connection_pools.utils;

import org.apache.commons.dbcp.BasicDataSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * Author: wzard
 * Date: 2018-08-06
 * Time: 11:28
 * ProjectName: itsource.cn.ximcloud.itsource.before.day40_deep_learning_jdbc._04connection_pools.util
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

public enum JDBCUtils {
    //    该枚举类唯一实例，用于生成JDBCUtils实例
    INSTANCE;
    private static Properties properties;
    private static BasicDataSource basicDataSource;

    static {
        properties = new Properties();
        basicDataSource = new BasicDataSource();
        try {
            properties.load(new FileInputStream(new File("C:\\Users\\wizard\\IdeaProjects\\itsource\\src\\main\\java\\cn\\ximcloud\\itsource\\day40_deep_learning_jdbc\\_04connection_pools\\resource\\config.properties")));
            basicDataSource.setDriverClassName(properties.getProperty("driverClassName"));
            basicDataSource.setUrl(properties.getProperty("url"));
            basicDataSource.setUsername(properties.getProperty("username"));
            basicDataSource.setPassword(properties.getProperty("password"));
            basicDataSource.setInitialSize(Integer.valueOf(properties.getProperty("initialSize")));
            basicDataSource.setMaxActive(Integer.valueOf(properties.getProperty("maxActive")));
            basicDataSource.setMaxIdle(Integer.valueOf(properties.getProperty("maxIdle")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private JDBCUtils() {
    }

    public JDBCUtils getInstance() {
        return INSTANCE;
    }

    public Connection getConnection() {
        try {
            return basicDataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void close(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (connection != null) connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
