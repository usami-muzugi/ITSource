package cn.ximcloud.itsource.day25._98review.Gaming;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-13
 * Time: 11:35
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class SexySister extends Hunman{
    private Character cup;
    private Pock pock;

    public void rush() {
        Pock pock;
        Collections.shuffle((pock = new Pock()).getPock());
        this.pock = pock;
    }

    public void pull(Gamer... gamers) {
        String[] strings = pock.getPock().toArray(new String[0]);
        String[][] temp = new String[3][17];
        for (int i = 0; i < 3; i++) {
            System.arraycopy(strings, i * 17, temp[i], 0, 17);
            gamers[i].setPock(temp[i]);
        }
    }

    public SexySister(Character cup) {
        this.cup = cup;
    }

    /**
     *
     * @return
     */
    public Character getCup() {
        return cup;
    }

    /**
     *  设置小姐姐的大小
     * @param cup   字符类型的大小
     */
    public void setCup(Character cup) {
        this.cup = Character.toUpperCase(cup);
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
        super.flag = true;
    }

    /**
     * 死掉了
     */
    @Override
    public void getOut() {
        super.flag = false;
    }

    @Override
    public String toString() {
        return "SexySister{" +
                "cup=" + cup +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", flag=" + flag +
                '}';
    }
}
