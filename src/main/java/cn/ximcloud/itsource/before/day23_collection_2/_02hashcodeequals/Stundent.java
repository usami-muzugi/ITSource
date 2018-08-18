package cn.ximcloud.itsource.before.day23_collection_2._02hashcodeequals;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-09
 * Time: 10:49
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Stundent {

    /*
        HashSet传入自己写定的类的对象，需要重写Objetc类的hashCode() *和* equals()方法



        测试:
            只有正确重写了hashCode() 和 equals()方法，hashset才能正确识别这个元素的唯一性
     */
    private String name;
    private int age;

    public Stundent() {

    }

    public Stundent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        HashSet<Stundent> stundentHashSet = new HashSet<>();
        Stundent stundent1 = new Stundent("usamimizugi", 18);
        Stundent stundent2 = new Stundent("ourinsma", 22);
        Stundent stundent3 = new Stundent("jestom", 28);
        Stundent stundent4 = new Stundent("Time", 11);

        stundentHashSet.add(stundent1);
        stundentHashSet.add(stundent2);
        stundentHashSet.add(stundent3);
        stundentHashSet.add(stundent4);

        System.out.println(stundentHashSet);
        /*stundentHashSet.add();*/
    }

    @Override
    public boolean equals(Object object) {
        //return true;
        if (this == object) return true;   //判断两个对象饿引用是否相同
        if (object == null) return false;   //判断这个object对象是否为null
        if (!(object instanceof Stundent)) return false;    //判断obj是不是Student这个的实例
        Stundent stundent = (Stundent) object;  //是实例就可以强转
        return stundent.getName().equals(this.name) && stundent.getAge() == this.age;   //判断两个对象的字段石是否相同
    }

    @Override
    public int hashCode() {
//        return 1;
        int result = name != null ? name.hashCode() : 0;
        return result = 31 * result + age;

//        final int PRIME = 31;   //31是一个素数，只能被1和31整除，目的是减少hashCode的碰撞
//        return name == null ? PRIME  + age : PRIME * name.hashCode() + age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
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
