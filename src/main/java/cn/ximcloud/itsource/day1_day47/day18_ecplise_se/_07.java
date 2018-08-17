package cn.ximcloud.itsource.day1_day47.day18_ecplise_se;

interface Swimmable {
    void swin();
}

interface Walkable {
    void walk();
}

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-03
 * Time: 14:06
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
public class _07 {      //垃圾代码
    /*
    7，定义两个接口  Swimmable (会游泳)和 Walkable(会跑),里面分别有swim和 walk的行为，
    鱼会游泳，猫会跑，老虎既会游泳也会跑，他们都有名字也都要睡觉。除此之外猫还会上树，老虎能吃人。
    请写出相关的接口和类并做简单的测试。
     */

    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.setName("江湖");
        Fish fish2 = new Fish("李冲");
        System.out.println(fish1);
        System.out.println(fish2);
        Cat cat = new Cat("张桃");
        cat.walk();
        Tiger tiger = new Tiger("usamimizugi");
        tiger.eatPerson();

    }
}

abstract class Animal {  //abstract为啥要加上？这里应该是体现了抽象继承的概念，Animal描述了动物这一抽象的事物，然后他的子类来具体实现，生活中也是，动物是一个很大的范畴，不能具体来描述一类。
    private String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Fish extends Animal implements Swimmable {
    public Fish() {

    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swin() {
        System.out.println(this.toString() + "，我在游泳");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "我是:" + getName();
    }
}

class Cat extends Animal implements Walkable {
    public Cat() {

    }

    public Cat(String name) {
        super(name);

    }


    @Override
    public void walk() {
        System.out.println(this.toString() + "，我在跑步");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "我是:" + getName();
    }
}

class Tiger extends Animal implements Walkable, Swimmable {
    public Tiger() {

    }

    public Tiger(String name) {
        super(name);

    }

    public void eatPerson() {
        System.out.println(this.toString() + "老虎能吃人!!!");
    }

    @Override
    public void swin() {

    }

    @Override
    public void walk() {

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "我是:" + getName();
    }
}