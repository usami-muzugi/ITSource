package cn.ximcloud.itsource.day25_collections_2._05;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-12
 * Time: 17:54
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

class Game {
    private static Random random = new Random();
    private Gamer[] gamers;//斗地主
    private ArrayList<String> arrayList;  //一幅扑克
    private int size;
    private ArrayList<String>[] arrayLists = new ArrayList[3];

    public Game() throws InterruptedException {
        gamers = new Gamer[3];
        System.out.println("澳门首家线上赌场上线辣！");
        Thread.sleep(random.nextInt(2000));
    }

    public Game(Gamer gamer) throws InterruptedException {
        this();
        add(gamer);
    }

    public void start() throws InterruptedException {
        System.out.println("游戏启动");
        Thread.sleep(random.nextInt(1000));
        rush();
        pull();

    }

    public void rush() throws InterruptedException {
        System.out.println("开始洗牌！");
        Thread.sleep(random.nextInt(1000));
        arrayList = Pock.getPocks();
        Object[] objects = arrayList.toArray();
        int temp = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 17; j++) {
                arrayLists[i].set(j, arrayList.get(temp++));
            }
        }
        arrayLists[2].add("大王");
        arrayLists[2].add("小王");
        System.out.println("洗牌完毕！");
        Thread.sleep(random.nextInt(1000));
    }

    public void pull() throws InterruptedException {
        System.out.println("性感荷官在线发牌辣！");
        Thread.sleep(random.nextInt(1000));
        for (int i = 0; i < gamers.length; i++) {
            gamers[i].setPock(arrayLists[0]);
        }
        System.out.println("性感荷官发牌完毕！");
    }

    public Game add(Gamer gamer) throws InterruptedException {
        System.out.println("欢迎欢迎!");
        Thread.sleep(random.nextInt(1000));
        if (gamer.getMoney() > 100000 & gamer.getAge() > 18) {
            if (size > gamers.length) {
                Gamer[] temp = new Gamer[gamers.length + 20];
                System.arraycopy(gamers, 0, temp, 0, gamers.length);
                gamers = temp;
            }
            gamers[size] = gamer;
            System.out.println("梭哈" + gamers[size].getName() + "来到赌场！" + gamers[size]);
        }
        return this;
    }
}
