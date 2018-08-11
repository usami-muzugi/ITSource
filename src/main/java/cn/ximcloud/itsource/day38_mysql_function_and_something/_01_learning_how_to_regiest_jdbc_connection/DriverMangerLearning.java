package cn.ximcloud.itsource.day38_mysql_function_and_something._01_learning_how_to_regiest_jdbc_connection;

import com.mysql.jdbc.Driver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.*;

/**
 * Created by IntelliJ IDEA.
 * User: wizard
 * Date: 2018-08-02
 * Time: 14:22
 * ProjectName: itsource.cn.ximcloud.itsource.day39_mysql_with_jdbc._01_learning_how_to_regiest_jdbc_connection
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
 * 学习使用DriverManger类
 **/

public class DriverMangerLearning {
    private static final String HOST = "127.0.0.1";
    private static final String PORT = "3306";
    private static final String DATABASE = "itsource";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "*********";
    /**
     * initial
     * JDBC  jdbc:mysql://主机地址:端口号/库名
     * USERNAME  数据库用户名
     * PASSWORD  数据库密码
     */
//    private static final String JDBCADDRESS = "jdbc:mysql://localhost:3306/itsource";
//    //    简写 "jdbc:mysql://itsource"
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "WGY199667";


    //    优化
    private static StringBuffer stringBuffer = new StringBuffer();
    private static Connection connection;

    static {
        stringBuffer.append("jdbc:mysql://").append(HOST).append(":").append(PORT).append("/").append(DATABASE);
    }


    /**
     * 注册驱动方式1
     * <p>
     * Java要操作数据库，也需要注册驱动，这样才能建立联系
     * 通过registerDriver（Driver driver）方法 向DriverManger注册给定驱动程序
     *
     * @throws SQLException 抛出数据库异常
     */
    @BeforeClass
    public static void doBeforeClass() throws SQLException {
        /**     DriverManager只有一个构造方法且私有化，不能直接通过new关键字创建实例
         *      而且该类当中全是静态方法
         *     Prevent the DriverManager class from being instantiated.
         *     private DriverManager() {}
         *
         */

//        1.创建一个驱动实例     com.mysql.jdbc.Driver
        Driver driver = new Driver();
//        2.通过DriverManager.registerDriver()方法注册驱动      这里，我可以偏不写，就是不写，绝对还是能够运行的
        DriverManager.registerDriver(driver);
        System.out.println("リンケ　スタート！");
//        3.选取又三个String的参数列表的这个getConnection()方法，分别对应的是连接主机URL，用户名，密码.获得Connection实例
        connection = DriverManager.getConnection(stringBuffer.toString(), USERNAME, PASSWORD);
    }


    /**
     * 注册驱动方式2
     * <p>
     * 使用反射注册驱动
     *
     * @throws ClassNotFoundException 抛出未找到Class异常
     * @throws SQLException           抛出SQL异常      "Host 'Wizard' is not allowed to connect to this MySQL server"
     */
    @BeforeClass
    public static void doBefore() throws ClassNotFoundException, SQLException {
        //通过反射的方法成功注册驱动并获取连接
        Class.forName("com.mysql.jdbc.Driver");     //所有说一行能够解决加载，很骚。
        /**
         * 有两种方法的原因
         * public class Driver extends NonRegisteringDriver implements java.sql.Driver {
         *     public Driver() throws SQLException {        //通过这种方法直接创建一个Driver的实例
         *     }
         *
         *     static {     //当Driver类被加载带虚拟机的时候，就会执行这个静态代码块，就会执行这个方法
         *         try {
         *             DriverManager.registerDriver(new Driver());  //这个方法其实就是给DriverManager类调用registerDriver()方法。这里DriverManager也会被加载到虚拟机然后各种初始化
         *         } catch (SQLException var1) {
         *             throw new RuntimeException("Can't register driver!");
         *         }
         *     }
         * }
         */
        connection = DriverManager.getConnection(stringBuffer.toString(), USERNAME, PASSWORD);
    }

    /**
     * 关闭操作
     *
     * @throws SQLException 抛出
     */
    @AfterClass
    public static void doAfterClass() throws SQLException {
//        最后的操作，关闭连接。
        connection.close();
        System.out.println("Connection has been closed! リンケ 終わりました！");
    }

    /**
     * 通过DriverManager.getConnction()方法获得connection对象实例
     * 打印实例
     */
    @Test
    public void testGetConnection() {
        System.out.println(connection);
//        com.mysql.jdbc.JDBC4Connection@20d28811   成功打印对象，证明连接成功
    }

    /**
     * 通过connection对象实例获得(创建)声明statements，并执行了一条查询语句。
     *
     * @throws SQLException 抛出一个异常
     */
    @Test
    public void testGetStatements() throws SQLException {
        Statement statement = connection.createStatement();
        final String SQL = "SHOW DATABASES";
        int i = statement.executeUpdate(SQL);
        /**
         * either (1) the row _04count for SQL Data Manipulation Language (DML) statements
         *      *         or (2) 0 for SQL statements that return nothing
         */
//        但是看不到这条语句执行的效果，但是这个方法会返回一个int，打印一下
        System.out.println(i);  //看不懂
//        使用完记得关闭哟
        statement.close();
    }

    /**
     * 拿到列名为id的所有
     *
     * @throws SQLException 抛出SQL异常
     */
    @Test
    public void testDQL() throws SQLException {
        Statement statement = connection.createStatement();
        final String SQL = "SELECT * FROM product";
        ResultSet resultSet = statement.executeQuery(SQL);
        System.out.println(resultSet);
        while (resultSet.next()) {
            System.out.println(resultSet.getLong("id"));
        }
        resultSet.close();
        statement.close();
    }

    /**
     * 查
     * 我全都要!
     *
     * @throws SQLException 抛出SQL异常
     */
    @Test
    public void testGetAll() throws SQLException {
        Statement statement = connection.createStatement();
        final String SQL = "SELECT * FROM product";
        ResultSet resultSet = statement.executeQuery(SQL);
        System.out.println(resultSet);
        StringBuffer stringBuffer = new StringBuffer();
        while (resultSet.next()) {
            long id = resultSet.getLong("id");
            String productName = resultSet.getString("productName");
            long dir_id = resultSet.getLong("dir_id");
            double salePrice = resultSet.getDouble("salePrice");
            String supplier = resultSet.getString("supplier");
            String brand = resultSet.getString("brand");
            double cutoff = resultSet.getDouble("cutoff");
            stringBuffer.append(id + "\t").append(productName + "\t").append(dir_id + "\t").append(salePrice + "\t")
                    .append(supplier + "\t").append(brand + "\t").append(cutoff + "\t").append("\n");
        }
        System.out.println(stringBuffer);
//        关闭连接
        resultSet.close();
//        关闭statement
        statement.close();
    }

    /**
     * @throws SQLException Column Index out of range, 0 < 1.
     */
    @Test
    public void testSelect() throws SQLException {
        Statement statement = connection.createStatement();
        final String SQL = "SELECT * FROM product";
        ResultSet resultSet = statement.executeQuery(SQL);
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount(); //2
        System.out.println(columnCount);
        System.out.println("开始");
        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print("Name = " + metaData.getColumnName(i) + "\t");
                System.out.print("Type = " + metaData.getColumnTypeName(i) + "\t");
                String object = resultSet.getObject(i, String.class);
                System.out.print("Value = " + object + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 改
     * 测试更新(修改)数据
     *
     * @throws SQLException 抛出一个异常  Can not issue empty query.
     */
    @Test
    public void testUpdate() throws SQLException {
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate("UPDATE product SET product.supplier=\"辣鸡\" WHERE product.brand=\"彭睿\"");
        System.out.println(i);
        statement.close();

    }

//    /**
//     * 无限插入
//     * @throws SQLException
//     */
//    @Test
//    public void testInsert2() throws SQLException {
//        while (true) {
//            Statement statement = connection.createStatement();
//            final String SQL = "INSERT INTO test(test_id,test_name) SELECT test_id,test_name FROM test";
//            int i = statement.executeUpdate(SQL);
//            System.out.println(i);
//            statement.close();
//        }
//    }

    /**
     * 增
     * 测试插入一条数据
     *
     * @throws SQLException 抛出 插入未成功异常 SQL异常 Data truncated for column 'costPrice' at row 1     Duplicate entry '10087' for key 'PRIMARY
     */
    @Test
    public void testInsert() throws SQLException {
        Statement statement = connection.createStatement();
        final String SQL = "INSERT INTO product(productName," +
                "dir_id,salePrice,supplier,brand,cutoff,costPrice) VALUES (\"垃圾M90\",3,2333,\"垃圾\",\"彭睿\",0.1,100)";
        int i = statement.executeUpdate(SQL);
        System.out.println(i);
        statement.close();
    }

    /**
     * 创建一张表
     *
     * @throws SQLException Table 'test' already exists
     */
    @Test
    public void testCreateTable() throws SQLException {
        Statement statement = connection.createStatement();
        final String SQL = "CREATE TABLE test (test_id INT,test_name VARCHAR (30))";
        int i = statement.executeUpdate(SQL);
        System.out.println(i);
        statement.close();
    }

    /*
     *
     * 为了测试MySQL show processlist 效果，暂时注释掉关闭连接方法/
     * 确认连接建立。时间很短暂，不容易观察到
     *     mysql> show processlist;
     *         +----+------+-----------------+----------+---------+------+-------+------------------+
     *         | Id | User | Host            | db       | Command | Time | State | Info             |
     *         +----+------+-----------------+----------+---------+------+-------+------------------+
     *         | 53 | root | localhost:58143 | NULL     | Query   |    0 | NULL  | show processlist |
     *         | 55 | root | localhost:58198 | itsource | Sleep   |    0 |       | NULL             |
     *         +----+------+-----------------+----------+---------+------+-------+------------------+
     *     2 rows in set (0.00 sec)
     *
     */

    /**
     * 删除一张表
     *
     * @throws SQLException SQL语句没有写对
     *                      Table 'test' already exists You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'TABLE test1)' at line 1
     *                      删表DDL DROP
     *                      You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'TABLE test1' at line 1
     *                      找不到这个表
     *                      Unknown table 'test1'
     */
    @Test
    public void testDeleteTable() throws SQLException {
        Statement statement = connection.createStatement();
        final String SQL = "DROP TABLE test";
        int i = statement.executeUpdate(SQL);
        System.out.println(i);
        statement.close();
    }
}
