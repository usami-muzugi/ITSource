package cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.web;

import cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.dao.impl.AdminImpl;
import cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.dao.impl.UserImpl;
import cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.domain.Admin;
import cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-16
 * Time: 14:06
 * ProjectName: itsource.cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.web
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
@WebServlet(name = "day47_homework_InitServlet", urlPatterns = "/day47/homework/init")
public class InitServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        AdminImpl admin = new AdminImpl();
        UserImpl user = new UserImpl();

        admin.dropTable();
        admin.createTable();
        user.dropTable();
        user.createTable();

        Admin adm = new Admin();
        adm.setUsername("wen");
        adm.setPassword("wen");
        admin.save(adm);

        User u1 = new User("usamimizugi", "ourinsama", "锦江区", 10000000D, true);
        User u2 = new User("wizard", "123", "锦江区", 100000D, false);
        User u3 = new User("ourinsama", "usamimizugi", "锦江区", 10000000D, true);
        User u4 = new User("ximcloud", "gg", "锦江区", 100D, true);

        user.save(u1);
        user.save(u2);
        user.save(u3);
        user.save(u4);

        System.out.println("admin : " + admin);
        System.out.println("user : " + user);

        getServletContext().setAttribute("admin", admin);
        getServletContext().setAttribute("user", user);

        System.out.println("day47_homework_InitServlet 初始化完成！");
    }
}
