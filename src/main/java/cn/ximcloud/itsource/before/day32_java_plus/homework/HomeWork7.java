package cn.ximcloud.itsource.before.day32_java_plus.homework;

interface ITwo {
    void say();
}

interface IThree {
    void say();
}

/**
 * Created by IntelliJ IDEA.
 * Student: Wizard
 * Date: 2018-07-24
 * Time: 19:10
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
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
 * //         佛祖保佑          永无BUG          永不修改             //
 * ////////////////////////////////////////////////////////////////////
 **/
public class HomeWork7 {
    private Two two;

    public static void main(String[] args) {
        Three three = new Three();
        Two two = new Two();
        ThreeToTwo threeToTwo = new ThreeToTwo();
        threeToTwo.setThree(three);
        Hotel hotel = new Hotel();
        hotel.setTwo(two);
    }

}

class Hotel {
    private Two two;

    public void setTwo(Two two) {
        this.two = two;
    }

    public void chage() {
        two.say();
    }
}

class Three implements IThree {

    @Override
    public void say() {

    }
}

class Two implements ITwo {


    @Override
    public void say() {

    }
}

class ThreeToTwo {
    private Three three;

    public void setThree(Three three) {
        this.three = three;
    }

    public void adapter() {
        three.say();
    }
}

