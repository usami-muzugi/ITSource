package cn.ximcloud.itsource.day38_mysql_function_and_something.homework;

import java.sql.*;

/**
 * Created by IntelliJ IDEA.
 * User: wizard
 * Date: 2018-08-03
 * Time: 13:03
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

public class SingleInstanceForJDBC {
    private static SingleInstanceForJDBC singleInstanceForJDBC;
    private static Connection connection;
    private static StringBuffer stringBuffer;


    /* no man can create instance with constructor */
    private SingleInstanceForJDBC() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    /**
     * Load Driver,and get a connection Instance
     *
     * @param url url to connection mysql
     * @throws SQLException           Can not connection with mysql server for this url
     * @throws ClassNotFoundException com.mysql.jdbc.Driver not Found Exception
     */
    private SingleInstanceForJDBC(String url) throws SQLException, ClassNotFoundException {
        this();
        connection = DriverManager.getConnection(url);
    }

    /**
     * Load Driver,Get a connection Instance,with username,password
     *
     * @param url       url to connection mysql
     * @param username  mysql username
     * @param password mysql password
     * @throws SQLException           username or password not match
     * @throws ClassNotFoundException com.mysql.jdbc.Driver not Found Exception
     */
    private SingleInstanceForJDBC(String url, String username, String password) throws SQLException, ClassNotFoundException {
        this();
        connection = DriverManager.getConnection(url, username, password);
    }

    /**
     * Load Driver,Get a connection Instance,without username,password.not a good function.deprecated now.
     *
     * @return a SingleInstanceForJDBC instance
     * @throws ClassNotFoundException com.mysql.jdbc.Driver not Found Exception
     */
    @Deprecated
    public static SingleInstanceForJDBC getInstance() throws ClassNotFoundException {
        if (singleInstanceForJDBC == null) {
            synchronized (SingleInstanceForJDBC.class) {
                if (singleInstanceForJDBC == null) {
                    singleInstanceForJDBC = new SingleInstanceForJDBC();
                }
            }
        }
        return singleInstanceForJDBC;
    }


    /**
     * @param url url to connection mysql
     * @return single Instance
     * @throws SQLException           can not connection mysql server
     * @throws ClassNotFoundException com.mysql.jdbc.Driver not Found Exception
     */
    public static SingleInstanceForJDBC getInstance(String url) throws SQLException, ClassNotFoundException {
        if (singleInstanceForJDBC == null) {
            synchronized (SingleInstanceForJDBC.class) {
                if (singleInstanceForJDBC == null) {
                    singleInstanceForJDBC = new SingleInstanceForJDBC(url);
                }
            }
        }
        return singleInstanceForJDBC;
    }

    /**
     * @param host     mysql server's host name or IP address
     * @param port     mysql server's port
     * @param database choice mysql database
     * @param username mysql user's username
     * @param password mysql user's password
     * @return single Instance
     * @throws SQLException           can not connection mysql server
     * @throws ClassNotFoundException com.mysql.jdbc.Driver not Found Exception
     */
    public static SingleInstanceForJDBC getInstance(String host, String port, String database, String username, String password) throws SQLException, ClassNotFoundException {
        stringBuffer = new StringBuffer();
        if (singleInstanceForJDBC == null) {
            synchronized (SingleInstanceForJDBC.class) {
                if (singleInstanceForJDBC == null) {
                    stringBuffer.append("jdbc:mysql://").append(host).append(":").append(port).append("/").append(database);
                    singleInstanceForJDBC = new SingleInstanceForJDBC(stringBuffer.toString(), username, password);
                }
            }
        }
        return singleInstanceForJDBC;
    }

    /**
     * @param s
     * @return
     */
    @Deprecated
    public SingleInstanceForJDBC registerUrl(String s) {
        return this;
    }

    /**
     * @param s
     * @return
     */
    @Deprecated
    public SingleInstanceForJDBC registerUsername(String s) {
        return this;
    }

    /**
     * @param s
     * @return
     */
    @Deprecated
    public SingleInstanceForJDBC registerPassword(String s) {
        return this;
    }

    /**
     * get Connection from DriverManager
     *
     * @return DriverManager's connection
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * @return URL and Connection
     */
    @Override
    public String toString() {
        try {
            return "URL : " + stringBuffer.toString() + "\n" +
                    "Connection : " + connection.getCatalog();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "URL : " + stringBuffer.toString();
    }

    /**
     * @param SQL just a SQL
     * @throws SQLException can not create table
     */
    @Deprecated
    public void createTable(String SQL) throws SQLException {
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(SQL);
        System.out.println(i);
        statement.close();
    }

    /**
     * @param tableName a table name what are you creating for
     * @param arr       column and type etc.
     * @throws SQLException can create table Exception
     */
    public void createTable(String tableName, String... arr) throws SQLException {

        Statement statement = connection.createStatement();
        StringBuffer stringBuffer = new StringBuffer();
        //CREATE TABLE test (test_id INT,test_name VARCHAR (30))
        stringBuffer.append("CREATE TABLE ").append(tableName).append("(");
        for (int i = 0; i < arr.length; i++) {
            stringBuffer.append(arr[i]).append(" ");
            stringBuffer.append(arr[++i]);
            if (i != arr.length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(")");
        System.out.println(stringBuffer);
        int i = statement.executeUpdate(stringBuffer.toString());
        System.out.println(i);
        statement.close();
    }


    /**
     * @param tableName tableName
     * @throws SQLException can not drop table
     */
    public boolean dropTable(String tableName) throws SQLException {
        Statement statement = connection.createStatement();
        //"DROP TABLE test";
        try {
            statement.executeUpdate("DROP TABLE " + tableName);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            statement.close();
        }
        return false;
    }

    /**
     * insert a SQL to mysql
     *
     * @param SQL just input a SQL
     * @throws SQLException can not insert Exception
     */
    @Deprecated
    public void insert(String SQL) throws SQLException {
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(SQL);
        statement.close();
    }

    /**
     * insert to mysql table
     *
     * @param tableName tableName
     * @param arr       arr like this : type,value,type,value....
     * @throws SQLException can not insert Exception
     */
    public void insert(String tableName, Object... arr) throws SQLException {
        Statement statement = connection.createStatement();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            stringBuffer.append(arr[i]);
            stringBuffer1.append("\"" + arr[++i] + "\"");
            if (i != arr.length - 1) {
                stringBuffer.append(",");
                stringBuffer1.append(",");
            }
        }
        String SQL = "INSERT INTO " + tableName + " (" + stringBuffer + " ) VALUES (" + stringBuffer1 + ")";
        System.out.println(SQL);
        statement.executeUpdate(SQL);
        statement.close();
    }


    /**
     * with tableName we can select all from this table
     *
     * @param tableName what table we wanna to select
     * @throws SQLException can not select Exception
     */
    public void showTable(String tableName) throws SQLException {
        Statement statement = connection.createStatement();
        final String SQL = "SELECT * FROM " + tableName;
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
     * @param tableName table name
     * @param colmn
     * @throws SQLException can not select Exception
     */
    public void showColumn(String tableName, String... colmn) throws SQLException {
        Statement statement = connection.createStatement();
        final String SQL = "SELECT * FROM " + tableName;
        ResultSet resultSet = statement.executeQuery(SQL);
        System.out.println(resultSet);
        while (resultSet.next()) {
            for (int i = 1; i <= colmn.length; i++) {
                System.out.print(resultSet.getObject(i) + "\t\t");
            }
            System.out.println();
        }
        resultSet.close();
        statement.close();
    }


    /**
     * @param tableName table name what are you updating for
     * @param objects   object like this : type,value,type,value....
     * @throws SQLException can not update from tableName
     */
    public void update(String tableName, Object... objects) throws SQLException {
        Statement statement = connection.createStatement();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();
        for (int i = 0; i < objects.length; i++) {
            stringBuffer.append(objects[i]);
            stringBuffer1.append("\"" + objects[++i] + "\"");
            if (i != objects.length - 1) {
                stringBuffer.append(",");
                stringBuffer1.append(",");
            }
        }
        String SQL = "UPDATE" + tableName + " (" + stringBuffer + " ) WHERE (" + stringBuffer1 + ")";


        statement.executeUpdate("UPDATE product SET product.supplier=\"辣鸡\" WHERE product.brand=\"彭睿\"");
        statement.close();

    }

    /**
     * @param SQL
     * @throws SQLException
     */
    public void update(String SQL) throws SQLException {
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(SQL);
        System.out.println(i);
        statement.close();

    }

    /**
     * DN NOT DO THIS SHIT FUNCTION
     *
     * @throws SQLException SAVE YOUR ASS Exception
     */
    public void dropDatabase() throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("Drop DATABASE " + connection.toString());
        statement.close();
    }

    /**
     * shoot down
     *
     * @throws Throwable exception
     */
    public void release() throws Throwable {
        connection.close();
        singleInstanceForJDBC = null;
        finalize();
    }
}
