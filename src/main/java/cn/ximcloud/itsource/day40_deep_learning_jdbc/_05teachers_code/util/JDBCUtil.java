package cn.ximcloud.itsource.day40_deep_learning_jdbc._05teachers_code.util;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
    private static JDBCUtil instance;

    ;
    private static Properties prop;
    private static DataSource ds;

    static {
        prop = new Properties();
        try {
            prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));

            ds = BasicDataSourceFactory.createDataSource(prop);

            // 还可以设置 最大值 。。。
        } catch (Exception e) {
            e.printStackTrace();
        }

        instance = new JDBCUtil();
    }

    private JDBCUtil() {
    }

    public static JDBCUtil getInstance() {
        return instance;
    }

    public Connection getConn() {
        try {
            return ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void close(Connection conn, Statement sm, ResultSet rs) {
        try {
            if (rs != null) rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (sm != null) sm.close();
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
