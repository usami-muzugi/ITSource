package cn.ximcloud.itsource.day39_mysql_jdbc.jdbcunit;

import java.sql.*;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-08-03
 * Time: 16:00
 * ProjectName: itsource.cn.ximcloud.itsource.day39_mysql_jdbc.jdbcunit
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

public class JDBCUtil {
    private static JDBCUtil instance = null;
    //用作读取资源文件
    private static Properties prop = null;

    static {
        try {
            prop = new Properties();
            //去加载资源文件
            prop.load(Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream("jdbc.properties"));
            //注册驱动
            Class.forName(prop.getProperty("driverName"));
            instance = new JDBCUtil();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private JDBCUtil() {
    }

    public static JDBCUtil getInstance() {
        return instance;
    }

    /**
     * 拿到连接对象
     *
     * @return
     */
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(prop.getProperty("url"),
                    prop.getProperty("userName"), prop.getProperty("password"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 用来关闭资源
     */
    public void close(ResultSet rs, Statement st, Connection conn) {
        try {
            if (rs != null) rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conn != null) conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
