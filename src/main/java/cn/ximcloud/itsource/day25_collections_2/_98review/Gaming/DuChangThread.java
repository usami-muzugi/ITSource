package cn.ximcloud.itsource.day25_collections_2._98review.Gaming;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-13
 * Time: 14:00
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class DuChangThread extends Thread {
    private DuChang[] duChang;


    public DuChangThread(DuChang... duChang) {
        this.duChang = duChang;
    }

    @Override
    public void run() {
        for (int i = 0; i < duChang.length; i++) {//每一个赌场
            for (int j = 0; j < duChang[i].getDuZhuos().length; j++) {  //每一个赌桌
                DuZhuo duZhuo = duChang[i].getDuZhuo(j);
                SexySister sexySister = duZhuo.getSexySister();
                sexySister.rush();
                sexySister.pull(duZhuo.getGamers());
                duZhuo.start();
            }
        }
    }
}
