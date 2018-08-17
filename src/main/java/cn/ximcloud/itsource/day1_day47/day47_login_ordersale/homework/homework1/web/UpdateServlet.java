package cn.ximcloud.itsource.day1_day47.day47_login_ordersale.homework.homework1.web;

import cn.ximcloud.itsource.day1_day47.day47_login_ordersale.homework.homework1.dao.impl.UserImpl;
import cn.ximcloud.itsource.day1_day47.day47_login_ordersale.homework.homework1.domain.Admin;
import cn.ximcloud.itsource.day1_day47.day47_login_ordersale.homework.homework1.domain.User;
import cn.ximcloud.itsource.day1_day47.day47_login_ordersale.homework.homework1.utils.MyBeanUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-16
 * Time: 20:44
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day47_login_ordersale.homework.homework1.web
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
@WebServlet(name = "day47_homework_UpdateServlet",urlPatterns = "/day47/homework/admin/update")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, IOException {
        Admin admin_in_session = (Admin) req.getSession().getAttribute("ADMIN_IN_SESSION");
        if (admin_in_session != null) {
//            有Session,获取一下
            req.setCharacterEncoding("UTF-8");
            resp.setCharacterEncoding("UTF-8");
            UserImpl user = (UserImpl) getServletContext().getAttribute("user");
            User tempUser = MyBeanUtil.requestToObject(req, User.class);
            user.update(tempUser);
            ArrayList<User> all = user.findAll();
            req.getSession().setAttribute("USERLIST_IN_SESSION", all);
            resp.sendRedirect("list.jsp");
        } else {
            resp.sendRedirect("errorPage.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("errorPage.jsp");
    }
}
