package cn.ximcloud.itsource.day30.zixi;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-21
 * Time: 14:42
 * ProjectName: ITSource.cn.ximcloud.itsource.day30.zixi
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

public class ImplentTest2 extends C {
    int x = 1;

    public static void main(String[] args) {
        System.out.println(new ImplentTest2().getX());  //子类没有重写父类getX()方法，这里调用得是父类得x
    }

    @Override
    public int getX() {     //子类重写了父类getX()方法，调用的是自己的x
        return super.x;       //如果非要调用父类的x只能是用super
    }
}

class C {
    int x;

    public int getX() {
        return x;
    }
}