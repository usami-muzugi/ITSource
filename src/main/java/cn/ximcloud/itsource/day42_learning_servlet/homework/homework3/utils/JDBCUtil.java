package cn.ximcloud.itsource.day42_learning_servlet.homework.homework3.utils;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-09
 * Time: 15:52
 * ProjectName: itsource.cn.ximcloud.itsource.day42_learning_servlet.homework.homework3.utils
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
    private static JDBCUtil instance = new JDBCUtil();
    private static Connection connection;

    static {
        try {
//            ???/java.lang.ClassNotFoundException: com.mysql.jdbc.Driver
//            Class.forName("com.mysql.jdbc.Driver");

//            当使用tomcat连接数据库，并且已经导入mysql的jar包的时候，如果启动服务器，但是还是无法正常运行，一直都是报错：
//            java.lang.ClassNotFoundException: com.mysql.jdbc.Driver。（我明明已经导入了，为什么还是提示我找不到mysql的jar包）
//            如果绕过tomcat单元测试连接数据库的时候，这种问题就不存在，可以正常访问数据库。
//
//            百思不得其解，一会查看是否是导包版本不符，一会检查我的各个类是否有问题，还一会检查xml配置是否有问题。。。
//              查找了一上午，最后，终于找到原因，原来要把这个jar包导入到工程的lib文件夹下就ok了（很坑爹有木有）。个人真实经历，望各位同行勿走我的老路！
//            友情提示：
//
//            在java项目中，只需要引入mysql-connector-java-5.1.7-bin.jar就可以运行java项目。
//            在web项目中，当Class.forName("om.mysql.jdbc.Driver");时myeclipse是不会去查找字符串，不会去查找驱动的。
//              所以只需要把mysql-connector-java-5.1.7-bin.jar拷贝到tomcat下lib目录就可以了
            new Driver();
//            jdbc:mysql://localhost:3306/itsource
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/20180809", "root", "WGY199667");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private JDBCUtil() {
    }

    public static JDBCUtil getInstance() {
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

}
