package cn.ximcloud.itsource.day1_day47.day25_collections_2._05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-12
 * Time: 17:50
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Pock {
    private ArrayList<String> arrayList;

    {
        final String[] huase = new String[]{"红桃", "黑桃", "方片", "梅花"};
        final char[] paimian = new char[]{'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K'};
        String[] strings = new String[54];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                strings[index] = huase[i] + paimian[j];
                index++;
            }
        }
        strings[52] = "小王";
        strings[53] = "大王";
        arrayList = new ArrayList<>(Arrays.asList(strings));
        Collections.shuffle(arrayList);
    }


    public static ArrayList<String> getPocks() {
        return new Pock().arrayList;
    }

}
