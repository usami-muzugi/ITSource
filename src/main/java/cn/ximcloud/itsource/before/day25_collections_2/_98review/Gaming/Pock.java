package cn.ximcloud.itsource.before.day25_collections_2._98review.Gaming;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-13
 * Time: 12:32
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Pock {
    private static final String[] huase;
    private static final String[] paimian;
    private static ArrayList<String> pock;

    static {
        pock = new ArrayList<>();
        huase = new String[]{"♥", "♠", "♣", "♦"};
        paimian = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (int i = 0; i < huase.length; i++) {
            for (int j = 0; j < paimian.length; j++) {
                pock.add(huase[i] + paimian[j]);
            }
        }
        pock.add("大王");
        pock.add("小王");
    }

    public ArrayList<String> getPock() {
        return pock;
    }
}
