package cn.ximcloud.itsource.day39_mysql_jdbc._03retry_learning_jdbc_two_method;

import com.mysql.jdbc.Driver;
import org.junit.Test;

import java.sql.*;

/**
 * Created by IntelliJ IDEA.
 * User: wizard
 * Date: 2018-08-04
 * Time: 10:50
 * ProjectName: itsource.cn.ximcloud.itsource.day39_mysql_jdbc._03retry_learning_jdbc_two_method
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 使用jdbc mysql注册驱动
 **/

public class RegisterJDBCDriver {

    /**
     * 注册方式1
     * 通过创建对象的方式注册驱动
     */
    @Test
    public void testRegister() throws SQLException {
//        com.mysql.jdbc.Driver 是 java.sql.Driver 的实现类
        /**
         *   com.mysql.jdbc.Driver
         *     public Driver() throws SQLException {
         *     }
         *
         *     static {
         *         try {
         *             DriverManager.registerDriver(new Driver());
         *         } catch (SQLException var1) {
         *             throw new RuntimeException("Can't register driver!");
         *         }
         *     }
         */
        java.sql.Driver driver = new Driver();
//            public static void registerDriver(java.sql.Driver driver)
        DriverManager.registerDriver(driver);
    }

    /**
     * 注册方式2
     * 通过反射的方式注册驱动
     *
     * @throws ClassNotFoundException 抛出类未被找到异常，需要排查完全限定名是否写正确
     */
    @Test
    public void testRegister2() throws ClassNotFoundException {
//        new Driver();
        Class.forName("com.mysql.jdbc.Driver");
    }


    /**
     * 高端关闭
     * Connection  extends Wrapper, AutoCloseable
     * Statement extends Wrapper, AutoCloseable
     */
    @Test
    public void testGetConnection() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itsource", "root", "****")) {
            try (
                    Statement statement = connection.createStatement()
            ) {
                statement.executeUpdate("CREATE TABLE `newtable` (\n" +
                        "  `test_id` int(11) DEFAULT NULL,\n" +
                        "  `test_name` varchar(30) DEFAULT NULL\n" +
                        ") ENGINE=InnoDB DEFAULT CHARSET=utf8;\n" +
                        "\n ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 低端关闭1
     * Connection  extends Wrapper, AutoCloseable
     * Statement extends Wrapper, AutoCloseable
     */
    @Test
    public void testGetConnection2() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itsource", "root", "****");
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE `newtable` (\n" +
                    "  `test_id` int(11) DEFAULT NULL,\n" +
                    "  `test_name` varchar(30) DEFAULT NULL\n" +
                    ") ENGINE=InnoDB DEFAULT CHARSET=utf8;\n" +
                    "\n ");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert statement != null;
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 低端关闭2
     * <p>
     * try块儿放可能会抛出异常的方法，由于作用域的原因，不能在finally访问到。
     * 所以需要定义在try之外，这样finally才能访问到然后执行关闭。
     * 关闭语句也不能写在同一个try里面，因为第一个如果没有成功关闭的话，会直接抛出异常。导致第二个无法成功关闭。
     * Connection  extends Wrapper, AutoCloseable
     * Statement extends Wrapper, AutoCloseable
     */
    @Test
    public void testGetConnection3() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itsource", "root", "****");
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE `newtable` (\n" +
                    "  `test_id` int(11) DEFAULT NULL,\n" +
                    "  `test_name` varchar(30) DEFAULT NULL\n" +
                    ") ENGINE=InnoDB DEFAULT CHARSET=utf8;\n" +
                    "\n ");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert statement != null;
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    assert connection != null;
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 测试查询语句，使用executeQuery()方法
     */
    @Test
    public void testGetQuery() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itsource", "root", "WGY199667");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT  * FROM newtable");
            while (resultSet.next()) {
                System.out.println(resultSet.getObject(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert resultSet != null;
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    assert statement != null;
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        assert connection != null;
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * 插入查询语句，Can not issue data manipulation statements with executeQuery(). 这个错误是不能使用executeQuery 而是要使用executeUpdate()方法
     */
    @Test
    public void testGetSave() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itsource", "root", "WGY199667");
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO test(test_id,test_name) SELECT test_id,test_name FROM test;");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert statement != null;
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    assert connection != null;
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
