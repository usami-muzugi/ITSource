package cn.ximcloud.itsource.day25._98review.Gaming;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-13
 * Time: 12:31
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class DuZhuo {
    private Gamer[] gamers;
    private SexySister sexySister;
    private Pock pock;

    public Gamer start() {
        Random random = new Random();
        for (int i = 0; i < gamers.length; i++) {
        }
        Gamer gamer = gamers[random.nextInt(3)];
        System.out.println(gamer);
        return gamer;
    }

    public Gamer[] getGamers() {
        return gamers;
    }

    public void addGamers(Gamer... gamers) {
        if(gamers.length>3) throw new ArrayIndexOutOfBoundsException("只能添加三个");
        else this.gamers = gamers;
    }

    public SexySister getSexySister() {
        return sexySister;
    }

    public void addSexySister(SexySister sexySister) {
        this.sexySister = sexySister;
    }

    public Pock getPock() {
        return pock;
    }

    public void setPock(Pock pock) {
        this.pock = pock;
    }

    @Override
    public String toString() {
        return "DuZhuo{" +
                "gamers=" + (gamers == null ? null : Arrays.asList(gamers)) +
                ", sexySister=" + sexySister +
                ", pock=" + pock +
                '}';
    }
}
