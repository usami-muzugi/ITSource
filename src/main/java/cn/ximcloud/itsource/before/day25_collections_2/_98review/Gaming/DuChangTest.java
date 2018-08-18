package cn.ximcloud.itsource.before.day25_collections_2._98review.Gaming;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-13
 * Time: 12:25
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class DuChangTest {
    public static void main(String[] args) {
        DuChang duChang = new DuChang();
        duChang.setName("澳门首家线上赌场");
        duChang.setSize(3);

        Gamer gamer1 = new Gamer(10000);
        gamer1.setName("彭瑞");
        gamer1.setAge(20);
        gamer1.setId(10086);

        Gamer gamer2 = new Gamer(10000);
        gamer2.setName("邹智愚");
        gamer2.setAge(20);
        gamer2.setId(10086);

        Gamer gamer3 = new Gamer(10000);
        gamer3.setName("傻逼网友");
        gamer3.setAge(20);
        gamer3.setId(10086);

        SexySister sexySister = new SexySister('G');
        sexySister.setName("阿娇");
        sexySister.setAge(17);
        sexySister.setFlag(true);
        sexySister.setId(1000);
        duChang.getDuZhuo(0).addSexySister(sexySister);

        duChang.getDuZhuo(0).getSexySister().rush();

        duChang.getDuZhuo(0).addGamers(gamer1, gamer2, gamer3);

        System.out.println(duChang.getDuZhuo(0));


        DuChangThread duChangThread = new DuChangThread(duChang);
        duChangThread.start();
    }
}
