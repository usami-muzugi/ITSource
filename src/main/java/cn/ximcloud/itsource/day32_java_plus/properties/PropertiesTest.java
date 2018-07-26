package cn.ximcloud.itsource.day32_java_plus.properties;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-23
 * Time: 14:40
 * ProjectName: ITSource.cn.ximcloud.itsource.day32_java_plus.properties
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

public class PropertiesTest {

    @Test
    public void testProperties() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File(new String("C:\\Users\\wizard\\IdeaProjects\\itsource\\src\\main\\java\\cn\\ximcloud\\itsource\\day32_java_plus\\resource\\testConfig.properties"))));
        Object admin = properties.get("admin");
        System.out.println((String) admin);
        System.out.println((String) properties.get("password"));
    }

    @Test
    public void testRun() throws IOException {
        InputStream resourceAsStream = PropertiesTest.class.getResourceAsStream("/resource/testConfig.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        Object admin = properties.get("admin");
        System.out.println((String) admin);
        System.out.println((String) properties.get("password"));
    }

    @Test
    public void testRun3() throws IOException {
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("../resource/testConfig.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        Object admin = properties.get("admin");
        System.out.println((String) admin);
        System.out.println((String) properties.get("password"));

        new BufferedInputStream(new FileInputStream(new File("")));

    }
}
