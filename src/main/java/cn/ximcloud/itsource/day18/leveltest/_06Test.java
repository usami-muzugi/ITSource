package cn.ximcloud.itsource.day18.leveltest;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-21
 * Time: 12:00
 * ProjectName: ITSource.cn.ximcloud.itsource.day18.leveltest
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * //                          _ooOoo_                               //
 * //                         o8888888o                              //
 * //                         88" . "88                              //
 * //                         (| ^_^ |)                              //
 * //                         O\  =  /O                              //
 * //                      ____/`---'\____                           //
 * //                    .'  \\|     |//  `.                         //
 * //                   /  \\|||  :  |||//  \                        //
 * //                  /  _||||| -:- |||||-  \                       //
 * //                  |   | \\\  -  /// |   |                       //
 * //                  | \_|  ''\---/''  |   |                       //
 * //                  \  .-\__  `-`  ___/-. /                       //
 * //                ___`. .'  /--.--\  `. . ___                     //
 * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
 * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
 * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
 * //      ========`-.____`-.___\_____/___.-`____.-'========         //
 * //                           `=---='                              //
 * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class _06Test {
    public static void main(String[] args) {
        yuan yuan = new yuan(666);
        System.out.println(yuan.function());
        SanJiao sanJiao = new SanJiao(1, 2);
        System.out.println(sanJiao.mianji);

        JuXin juXin = new JuXin(2, 1);
        System.out.println(juXin.function());
    }
}

abstract class Father {
    double mianji;
}

interface Method {
    double function();
}

class yuan extends Father implements Method {
    private int banjin;

    public yuan(int banjin) {
        this.banjin = banjin;
        mianji = Math.PI * banjin * banjin;
    }

    @Override
    public double function() {
        return mianji;
    }
}

class SanJiao extends Father implements Method {
    private int di;
    private int gao;

    public SanJiao(int di, int gao) {
        this.di = di;
        this.gao = gao;
        mianji = di * gao / 2;
    }

    @Override
    public double function() {
        return mianji;
    }
}

class JuXin extends Father implements Method {
    private int chang;
    private int kuan;

    public JuXin(int chang, int kuan) {
        this.chang = chang;
        this.kuan = kuan;
        mianji = chang * kuan;
    }

    @Override
    public double function() {
        return mianji;
    }

}
