package cn.ximcloud.itsource.before.day47_login_ordersale._01login.servlet;


import cn.ximcloud.itsource.before.day47_login_ordersale._01login.dao.impl.AdminImpl;
import cn.ximcloud.itsource.before.day47_login_ordersale._01login.domain.Admin;
import cn.ximcloud.itsource.before.day47_login_ordersale._01login.util.MyBeanUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-13
 * Time: 12:30
 * ProjectName: itsource.cn.ximcloud.itsource.before.day45_javabean.homework.homework5.servlet
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
 * 登录Servlet
 **/
@WebServlet(name = "day47_loginServlet", urlPatterns = "/day47/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Admin admin_in_session = (Admin) req.getSession().getAttribute("ADMIN_IN_SESSION");
        if (admin_in_session != null) {
//            有Session,转发一下
            req.getRequestDispatcher("/day46/main").forward(req, resp);
        } else {
            Admin tempAdmin = MyBeanUtil.requestToObject(req, Admin.class);
            System.out.println(tempAdmin);
            AdminImpl admin = (AdminImpl) getServletContext().getAttribute("admin");
            System.out.println("Login_admin:" + tempAdmin);
            if ((tempAdmin = admin.login(tempAdmin.getAdmin(), tempAdmin.getPassword())) != null) {
//            密码正确，进行下一步设置
                req.getSession().setAttribute("ADMIN_IN_SESSION", tempAdmin);
                req.getRequestDispatcher("/day46/main").forward(req, resp);
            } else {
//            密码错误，进行错误返回页面
                System.out.println("error");
                req.setAttribute("msg", "登录错误，请输出上面的账号和密码！");
//            转发
                resp.sendRedirect("/day46/index.jsp");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/day46/errorPage.jsp");
    }
}
