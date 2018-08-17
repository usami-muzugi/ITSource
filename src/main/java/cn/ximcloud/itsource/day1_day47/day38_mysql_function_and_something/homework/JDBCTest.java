package cn.ximcloud.itsource.day1_day47.day38_mysql_function_and_something.homework;

import org.junit.*;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: wizard
 * Date: 2018-08-03
 * Time: 13:19
 * ProjectName: itsource.cn.ximcloud.itsource.day38_function_and_something.homework
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

public class JDBCTest {
    private static String HOST;
    private static String PORT;
    private static String DATABASE;
    private static String USERNAME;
    private static String PASSWORD;
    private static SingleInstanceForJDBC instance;
    private static Connection connection;


    @BeforeClass
    public static void doBeforeClass() throws ClassNotFoundException, SQLException {
        HOST = "127.0.0.1";
        PORT = "3306";
        DATABASE = "itsource";
        USERNAME = "root";
        PASSWORD = "**********";
        instance = SingleInstanceForJDBC.getInstance(HOST, PORT, DATABASE, USERNAME, PASSWORD);
        System.out.println(instance);
    }

    @AfterClass
    public static void doAfterClass() throws Throwable {
        instance.release();

    }

    /**
     * get connection
     *
     * @throws ClassNotFoundException
     */
    @Test
    public void testConnection() throws Throwable {
        System.out.println("connection" + connection);
        System.out.println("getCatalog()" + connection.getCatalog());
    }

    @Test
    public void testCreateTable() throws SQLException {
        final String SQL = "CREATE TABLE test (test_id INT,test_name VARCHAR (30))";
        instance.createTable(SQL);
    }

    @Test
    public void testCreateTable2() throws SQLException {
        //final String SQL = "CREATE TABLE test (test_id INT,test_name VARCHAR (30))";
        instance.createTable("testTable", "test_id", "INT", "test_name", "VARCHAR (30)");
    }

    @Test
    public void testDropTable() throws SQLException {
        boolean testTable = instance.dropTable("testTable");
        Assert.assertEquals(false, testTable);
    }

    @Test
    public void testInsert() throws SQLException {
        instance.insert("INSERT INTO testTable (test_id,test_name ) VALUES (1,\"彭睿\")");
    }

    @Test
    public void testInsert2() throws SQLException {
        instance.insert("testTable", "test_id", 2, "test_name", "彭睿");
    }

    /**
     * DO NOT RUN THIS FUNCTION !
     *
     * @throws SQLException
     */
    @Test
    public void testDropDatabase() throws SQLException {
        instance.dropDatabase();
    }

    @Test
    public void testShowTable() throws SQLException {
        instance.showTable("product");
    }

    @Test
    public void testShowColmn() throws SQLException {
        instance.showColumn("product", "id", "salePrice", "productName");
    }

    @Before
    public void doBefore() {
        connection = instance.getConnection();
    }
}
