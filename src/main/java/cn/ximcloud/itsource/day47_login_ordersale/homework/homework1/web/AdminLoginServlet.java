package cn.ximcloud.itsource.day47_login_ordersale.homework.homework1.web;

import cn.ximcloud.itsource.day47_login_ordersale.homework.homework1.dao.impl.AdminImpl;
import cn.ximcloud.itsource.day47_login_ordersale.homework.homework1.dao.impl.UserImpl;
import cn.ximcloud.itsource.day47_login_ordersale.homework.homework1.domain.Admin;
import cn.ximcloud.itsource.day47_login_ordersale.homework.homework1.utils.CodeUtil;
import cn.ximcloud.itsource.day47_login_ordersale.homework.homework1.utils.MyBeanUtil;

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
 * @date: 2018-08-16
 * Time: 14:27
 * ProjectName: itsource.cn.ximcloud.itsource.day47_login_ordersale.homework.homework1.web
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
@WebServlet(name = "day47_homework_AdminLoginServlet", urlPatterns = "/day47/homework/admin/login")
public class AdminLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取AdminList对象
        AdminImpl adminList = (AdminImpl) getServletContext().getAttribute("admin");
        Admin tempAdmin = MyBeanUtil.requestToObject(req, Admin.class);

        if (!CodeUtil.auth(req)) {
//            验证码不正确
            req.getSession().setAttribute("msg", "验证码不正确");
//            System.out.println("验证码不正确");
        } else {
//            System.out.println("attention->>" + adminList.login(tempAdmin.getUsername(), tempAdmin.getPassword()));
            if ((tempAdmin = adminList.login(tempAdmin.getUsername(), tempAdmin.getPassword())) != null) {
//            验证码正确，用户信息正确。登录成功
//                移除msg
                req.getSession().removeAttribute("msg");
//                System.out.println(" 验证码正确，用户信息正确。登录成功");
//                执行
//                添加当前admin的Session
                req.getSession().setAttribute("ADMIN_IN_SESSION", tempAdmin);
//                添加用户list到Session
                UserImpl user = (UserImpl) getServletContext().getAttribute("user");
                req.getSession().setAttribute("USERLIST_IN_SESSION", user.findAll());
                resp.sendRedirect("list.jsp");
                return;
            } else {
//           验证码正确，用户信息不正确
                req.getSession().setAttribute("msg", "验证码正确，用户信息不正确");
//                System.out.println("验证码正确，用户信息不正确");
            }
        }
        resp.sendRedirect("index.jsp");
    }
}
