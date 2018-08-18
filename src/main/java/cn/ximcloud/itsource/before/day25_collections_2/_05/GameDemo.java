package cn.ximcloud.itsource.before.day25_collections_2._05;

/**
 * Created by IntelliJ IDEA.
 * Student: wizard
 * Date: 2018-07-12
 * Time: 14:57
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 定义一副扑克牌游戏的基础搭建，应该具有以下内容：
 * 扑克牌类
 * 玩家类
 * 游戏主类，游戏类中应该具有洗牌，发牌等功能，
 * 其它更多功能实现自己拓展
 **/

public class GameDemo {
    public static void main(String[] args) throws InterruptedException {
        //赌场创建成功
        Game game = new Game();

        //三个梭哈创建成功
        Gamer gamer1 = new Gamer("李冲", 24, 1000000);
        Gamer gamer2 = new Gamer("张桃", 24, 1000000);
        Gamer gamer3 = new Gamer("彭睿", 20, 1000000);


        game.add(gamer1).add(gamer2).add(gamer3);
        game.start();
    }
}


