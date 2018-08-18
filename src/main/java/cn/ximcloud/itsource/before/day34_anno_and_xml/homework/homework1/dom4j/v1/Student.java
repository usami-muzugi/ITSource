package cn.ximcloud.itsource.before.day34_anno_and_xml.homework.homework1.dom4j.v1;

/**
 * Created by IntelliJ IDEA.
 * User: wizard
 * Date: 2018-07-28
 * Time: 15:29
 * ProjectName: itsource.cn.ximcloud.itsource.before.day34_anno_and_xml.homework
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Student {
    private String name;
    private Integer age;


    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
