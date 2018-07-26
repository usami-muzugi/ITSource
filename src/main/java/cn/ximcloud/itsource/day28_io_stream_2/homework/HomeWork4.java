package cn.ximcloud.itsource.day28_io_stream_2.homework;

import org.junit.Test;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-17
 * Time: 23:36
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
 * 4、使用对象流完成对自定义对象的序列化和重构测试
 **/
public class HomeWork4 {
    @Test
    public void objectWriteTest() {
        try {
            File file = new File("D:/abc");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.write(1);    //write 1
//            objectOutputStream.writeChars("傻逼网友");
//            objectOutputStream.writeBoolean(false);
            objectOutputStream.writeObject(new Student());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void objectReadTest() {
        try {
            File file = new File("D:/abc");
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            //int i = objectInputStream.readInt();
//            String string = objectInputStream.readLine();
//            boolean b = objectInputStream.readBoolean();
            Object o = objectInputStream.readObject();
//            System.out.println(i);
//            System.out.println(string);
//            System.out.println(b);
            System.out.println((Student) o);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class Student implements Serializable {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

