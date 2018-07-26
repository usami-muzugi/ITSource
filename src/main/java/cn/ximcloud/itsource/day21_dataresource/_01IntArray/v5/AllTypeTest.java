package cn.ximcloud.itsource.day21_dataresource._01IntArray.v5;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-07
 * Time: 11:11
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class AllTypeTest {
    public static void main(String[] args) {
        AllTypeArray allTypeArray = new AllTypeArray();
        allTypeArray.add(13).add("test").add("你好")
                .add("傻");
        allTypeArray.add(13123);
        allTypeArray.add(123).add(1231).add(312311231).add(12313).add('傻');
        System.out.println(allTypeArray);
        System.out.println(allTypeArray.getElementByIndex(8));
        //System.out.println(allTypeArray.getElementByIndex(13));
        System.out.println(allTypeArray.getIndexByElement('傻'));
    }
}

class Student {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return name + " : " + age;
    }
}
