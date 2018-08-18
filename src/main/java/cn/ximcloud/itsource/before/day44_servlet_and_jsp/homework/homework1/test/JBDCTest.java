package cn.ximcloud.itsource.before.day44_servlet_and_jsp.homework.homework1.test;

import cn.ximcloud.itsource.before.day44_servlet_and_jsp.homework.homework1.dao.impl.ItemImpl;
import cn.ximcloud.itsource.before.day44_servlet_and_jsp.homework.homework1.dao.impl.ListImpl;
import cn.ximcloud.itsource.before.day44_servlet_and_jsp.homework.homework1.dao.impl.UserImpl;
import cn.ximcloud.itsource.before.day44_servlet_and_jsp.homework.homework1.utils.JDBCUtil;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-12
 * Time: 08:41
 * ProjectName: itsource.cn.ximcloud.itsource.before.day44_servlet_and_jsp.homework.homework1.test
 * To change this template use File | Settings | Editor | File and Code Templates.
 * <p>
 * you are not expected to understand this.
 * <p>
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

public class JBDCTest {

    @Test
    public void testJDBC() {
        JDBCUtil instance = JDBCUtil.getInstance();
        UserImpl user = new UserImpl();
        ListImpl list = new ListImpl();
        ItemImpl item = new ItemImpl();
        user.find(1);
        user.find(2);
    }
}
