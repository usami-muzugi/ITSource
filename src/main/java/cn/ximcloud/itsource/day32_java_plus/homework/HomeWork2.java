package cn.ximcloud.itsource.day32_java_plus.homework;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * Student: Wizard
 * Date: 2018-07-24
 * Time: 16:57
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
 * 单元测试(junit4)+properties加载的4种方式;
 **/
public class HomeWork2 {

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
        InputStream resourceAsStream = HomeWork2.class.getResourceAsStream("/resource/testConfig.properties");
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

        new BufferedInputStream(new FileInputStream(new File("/resource/testConfig.properties")));

    }
}
