package cn.ximcloud.itsource.day32_java_plus.teachercode.javaplus.test;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {

    @Test
    public void test() throws Exception {
        /**
         * 功能:解析properties文件 步骤: 1 创建一个Properties对象p; 2 准备一个properties文件的输入流对象;
         * 3 调用p的load(InputStream)对象加载properties文件的输入流(到内存中); 4
         * 调用p的getProperty(String key)方法,拿到指定key的值;
         */

        // 方式一:使用传统的IO流来加载properties文件
        // 注意:相对路径:是相对当前项目所在的路径;
        // 1
        Properties properties = new Properties();
        // 2
        // InputStream in = new FileInputStream(new
        // File("F:/Java180606/workspace/Day02_JavaPlus/resource/db.properties"));
        InputStream in = new FileInputStream(new File("./resource/db.properties"));
        // 3
        properties.load(in);
        // 4
        String string = properties.getProperty("path");
        System.out.println(string);

    }

    @Test
    public void test1() throws Exception {
        /**
         * 功能:解析properties文件 步骤: 1 创建一个Properties对象p; 2 准备一个properties文件的输入流对象;
         * 3 调用p的load(InputStream)对象加载properties文件的输入流(到内存中); 4
         * 调用p的getProperty(String key)方法,拿到指定key的值;
         */

        // 方式二:使用字节码对象来加载properties文件
        //  字节码对象: class文件被加载到内存中生成的类的对象(注意跟new 类名()创建的对象不同)
        // Properties.class.getResourceAsStream(name)
        // 注意: class对象的getResourceAsStream(String path)方法中的文件路径参考的是class对象所在路径;
        // "/"表示输出目录的根目录
        Properties properties = new Properties();
        InputStream in = PropertiesTest.class.getResourceAsStream("/abc/db.properties");
        // 3
        properties.load(in);
        // 4
        String string = properties.getProperty("path");
        System.out.println(string);
    }

    @Test
    public void test2() throws Exception {
        /**
         * 功能:解析properties文件 步骤: 1 创建一个Properties对象p; 2 准备一个properties文件的输入流对象;
         * 3 调用p的load(InputStream)对象加载properties文件的输入流(到内存中); 4
         * 调用p的getProperty(String key)方法,拿到指定key的值;
         */

        /*
         * 方式三:使用类加载器来加载properties文件
         * 类加载器:就是读取类的字节码文件中的数据,并在内存中生成一个类的字节码对象
         * 此时,相对路径就是项目的输出路径
         */

        Properties properties = new Properties();
        InputStream in = PropertiesTest.class.getClassLoader().getResourceAsStream("./abc/db.properties");
        // 3
        properties.load(in);
        // 4
        String string = properties.getProperty("path");
        System.out.println(string);
    }

    @Test
    public void test3() throws Exception {
        /**
         * 功能:解析properties文件 步骤: 1 创建一个Properties对象p; 2 准备一个properties文件的输入流对象;
         * 3 调用p的load(InputStream)对象加载properties文件的输入流(到内存中); 4
         * 调用p的getProperty(String key)方法,拿到指定key的值;
         */

        /*
         * 方式四:使用线程对象的类加载器来加载properties文件
         * 类加载器:就是读取类的字节码文件中的数据,并在内存中生成一个类的字节码对象
         * 此时,相对路径就是项目的输出路径
         */

        Properties properties = new Properties();
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("./abc/db.properties");
        // 3
        properties.load(in);
        // 4
        String string = properties.getProperty("path");
        System.out.println(string);
    }

}
