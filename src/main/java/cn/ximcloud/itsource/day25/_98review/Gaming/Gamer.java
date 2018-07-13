package cn.ximcloud.itsource.day25._98review.Gaming;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-13
 * Time: 11:24
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Gamer extends Hunman {
    //玩家自有属性，钱钱
    private Integer money;
    private String[] pock;

    public Gamer(Integer money) {
        this.money = money;
    }


    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", flag=" + flag +
                '}';
    }

    public String[] getPock() {
        return pock;
    }

    public void setPock(String[] pock) {
        this.pock = pock;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public boolean isFlag() {
        return super.flag;
    }

    @Override
    public void setFlag(boolean flag) {
        super.flag = false;
    }

    /**
     * 获取这个人的名字
     *
     * @return 返回这个人类的名字
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * 设置这个人的名字
     *
     * @param name 传入一个人的名字
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    /**
     * 获得一个人的年龄
     *
     * @return 返回一个Integer类型的年龄
     */
    @Override
    public Integer getAge() {
        return super.age;
    }

    /**
     * 设置一个人的年龄
     *
     * @param age 传入一个人的年龄
     */
    @Override
    public void setAge(Integer age) {
        super.age = age;
    }

    /**
     * 获得这个人的数字信息
     *
     * @return 返回这个人的数字信息
     */
    @Override
    public Integer getId() {
        return super.id;
    }

    /**
     * 设置设个人的数字信息
     *
     * @param id 传入一个人的数字信息
     */
    @Override
    public void setId(Integer id) {
        super.id = id;
    }

    /**
     * 开始赌博生涯不得好死
     */
    @Override
    public void getIn() {
        flag = true;
    }

    /**
     * 死掉了
     */
    @Override
    public void getOut() {
        flag = false;
    }
}
