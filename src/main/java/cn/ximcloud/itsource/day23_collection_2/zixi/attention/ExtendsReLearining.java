package cn.ximcloud.itsource.day23_collection_2.zixi.attention;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-10
 * Time: 09:09
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 再次学习继承的关系
 **/

public class ExtendsReLearining extends Extends {
    private int age;
    private String string;

    public static void main(String[] args) {
        ExtendsReLearining extendsReLearining = new ExtendsReLearining();
        extendsReLearining.setAge(12);  //一个类继承另一个类，子类和父类有相同字段，
        // 调用getset方法，如果子类没有重写父类的方法，由于就近原则，会调用父类的方法并操作父类的字段
    }

    @Override
    public int getAge() {
        return age;
    }

//    @Override
//    public void setAge(int age) {
//        this.age = age;
//    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}

class Extends {
    String string;
    private int age;

    public int getAge() {
        System.out.println("调用了父类的设置年龄的方法");
        return age;
    }

    public void setAge(int age) {
        System.out.println("调用了父类的获得年龄的方法");
        this.age = age;
    }
}
