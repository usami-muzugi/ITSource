package cn.ximcloud.itsource.before.day39_mysql_with_jdbc.homework;

import com.mysql.jdbc.Driver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-08-04
 * Time: 22:10
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
public class HomeWork1 {
    private static final String HOST = "127.0.0.1";
    private static final String PORT = "3306";
    private static final String DATABASE = "jdbcwork";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "*********";
    //    优化
    private static StringBuffer stringBuffer = new StringBuffer();
    private static Connection connection;

    static {
        stringBuffer.append("jdbc:mysql://").append(HOST).append(":").append(PORT).append("/").append(DATABASE);
    }

    /**
     * 注册驱动方式
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
     * 创建一张表
     *
     * @throws SQLException Table 'test' already exists
     */
    @Test
    public void testCreateTable() throws SQLException {
        Statement statement = connection.createStatement();
        final String SQL = "CREATE TABLE test (id INT,username VARCHAR (30),password VARCHAR (30)" +
                "age INT ,sex BIT,intro VARCHAR (30))";
        int i = statement.executeUpdate(SQL);
        statement.close();
    }

}
