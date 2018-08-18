package cn.ximcloud.itsource.before.day25_collections_2._05;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-12
 * Time: 17:53
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

class Gamer {
    private String name;
    private int age;
    private int money;
    private ArrayList<String> pock;


    public Gamer(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", pock=" + pock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gamer gamer = (Gamer) o;

        if (age != gamer.age) return false;
        if (money != gamer.money) return false;
        if (name != null ? !name.equals(gamer.name) : gamer.name != null) return false;
        return pock != null ? pock.equals(gamer.pock) : gamer.pock == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + money;
        result = 31 * result + (pock != null ? pock.hashCode() : 0);
        return result;
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<String> getPock() {
        return pock;
    }

    public void setPock(ArrayList<String> pock) {
        this.pock = pock;
    }
}
