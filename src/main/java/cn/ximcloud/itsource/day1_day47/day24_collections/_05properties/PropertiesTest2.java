package cn.ximcloud.itsource.day1_day47.day24_collections._05properties;

import org.junit.After;
import org.junit.Test;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-11
 * Time: 18:33
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * <p>
 * <p>
 * 测试Properties实现将数据写入硬盘
 * 和将硬盘上的数据读取
 **/

public class PropertiesTest2 {
    private Properties properties;

    /**
     * 创建文件到本地
     *
     * @throws FileNotFoundException 抛出可能文件未找到异常
     */
    @Test
    public void createFileToLocalTest() throws FileNotFoundException {
        properties = new Properties();//创建对象


        properties.setProperty("ourinsama", "usamimizugi");     //添加Entry
        properties.setProperty("10086", "yidong");
        properties.setProperty("10000", "dianxin");
        properties.setProperty("10001", "liantong");

        //绝对路径 C:\Users\wizard\IdeaProjects\itsource\src\main\java\cn\ximcloud\itsource\day24_collections\_05properties
        //相对路径 cn.ximcloud.itsource.day1_day47.day24_collections._05properties

        //各种流
        PrintStream printStream = new PrintStream(
                new FileOutputStream(new File(
                        "FileOutputStreamTest's File.txt")));
        properties.list(printStream);


//        --=listing properties --
//        10086=yidong
//        10000=dianxin
//        10001=liantong
//        ourinsama=usamimizugi

        //估计会自动关闭吧...
    }


    /**
     * 将本地的文件读取到properties上。
     *
     * @throws IOException 抛出文件未找到异常和IO流异常，但是文件未找到异常是IO流异常的子类，所以这里直接使用他的父类IO流异常就可以catch
     */
    @Test
    public void loadFileFromLocal() throws IOException {
        properties = new Properties();
        //load方法的参数列表是一个InputStream的接口，所以这里传入他的实现类
        //load方法的所用是将硬盘上的存储的property可读的数据传入到property里面去
        properties.load(new FileInputStream(new File("FileOutputStreamTest's File.txt")));
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry);
        }

        //不要有中文，非要有的话去转码
//        --=listing properties --
//        10086=ç§»å¨å®¢æ
//        10000=çµä¿¡å®¢æ
//        10001=èéå®¢æ
//        ourinsama=usamimizugi
    }


    //记得要关闭流，防止资源持续被占用
    @After
    public void gc() {
        System.gc();
    }


}
