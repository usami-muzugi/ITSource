package cn.ximcloud.itsource.day24._05properties;

import org.junit.After;
import org.junit.Test;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-11
 * Time: 18:33
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class PropertiesTest2 {
    private Properties properties;

    @Test
    public void createFileToLocalTest() throws FileNotFoundException {
        properties = new Properties();//创建对象


        properties.setProperty("ourinsama", "usamimizugi");     //添加Entry
        properties.setProperty("10086", "yidong");
        properties.setProperty("10000", "dianxin");
        properties.setProperty("10001", "liantong");

        //绝对路径 C:\Users\wizard\IdeaProjects\itsource\src\main\java\cn\ximcloud\itsource\day24\_05properties
        //相对路径 cn.ximcloud.itsource.day24._05properties

        //各种流
        PrintStream printStream = new PrintStream(
                new FileOutputStream(new File(
                        "FileOutputStream's File.txt")));
        properties.list(printStream);


//        --=listing properties --
//        10086=yidong
//        10000=dianxin
//        10001=liantong
//        ourinsama=usamimizugi

        //估计会自动关闭吧...
    }

    @Test
    public void loadFileFromLocal() throws IOException {
        properties = new Properties();

        properties.load(new FileInputStream(new File("FileOutputStream's File.txt")));
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry);
        }

        //不要有中文，非要有的话取转码
//        --=listing properties --
//        10086=ç§»å¨å®¢æ
//        10000=çµä¿¡å®¢æ
//        10001=èéå®¢æ
//        ourinsama=usamimizugi
    }

    @After
    public void gc(){
        System.gc();
    }


}
