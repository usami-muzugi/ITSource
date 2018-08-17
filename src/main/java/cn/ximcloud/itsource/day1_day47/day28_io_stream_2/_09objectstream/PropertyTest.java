package cn.ximcloud.itsource.day1_day47.day28_io_stream_2._09objectstream;

import org.junit.Test;

import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-17
 * Time: 15:07
 * ProjectName: ITSource.cn.ximcloud.itsource.day1_day47.day28_io_stream_2._09objectstream
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

public class PropertyTest {

    /**
     * 测试是否能通过properties来进行对象的读写操作
     *
     * @throws IOException
     */
    @Test
    public void propertyTest() throws IOException {
        Properties properties = new Properties();
        properties.put(new Student("usami", 10), "usamimizugi");
        properties.put(new Student("usami", 10), "usamimizugi");
        properties.put(new Student("usami", 10), "usamimizugi");
        System.out.println(properties);
        //测试不通过，对象的传输要使用ObjectI/0putStream
        //properties.StudentList(new PrintStream(new FileOutputStream(new File("D:/abc.txt"))));
//        properties.load(new FileInputStream(new File("D:/abc.txt")));
//        System.out.println(properties);
    }
}

class Student implements Serializable {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
