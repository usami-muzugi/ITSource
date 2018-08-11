package cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.domain;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-08-10
 * Time: 23:00
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
public class Item {
    private Integer id;
    private Integer owner;
    private String sender;
    private String getter;
    private String body;

    /**
     * 必须有一个空的构造方法让反射访问
     */
    public Item() {
    }


    public Item(Integer id, Integer owner, String sender, String getter, String body) {
        this.id = id;
        this.owner = owner;
        this.sender = sender;
        this.getter = getter;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", owner=" + owner +
                ", sender='" + sender + '\'' +
                ", getter='" + getter + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
