package cn.ximcloud.itsource.day1_day47.day47_login_ordersale._03captcha.servlet;


import cn.ximcloud.itsource.day1_day47.day47_login_ordersale._03captcha.dao.impl.AdminImpl;
import cn.ximcloud.itsource.day1_day47.day47_login_ordersale._03captcha.dao.impl.StudentImpl;

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
 * Time: 12:11
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.servlet
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
 * 初始化Servlet
 **/
@WebServlet(name = "day47_InitServlet_captcha", urlPatterns = "/day47/captcha_init")
public class InitServlet extends HttpServlet {
    /**
     * 初始化方法
     *
     * @throws ServletException 抛出一个不知名的异常
     */
    @Override
    public void init() throws ServletException {
//        初始化操作
//        2.得到daoimpl对象并初始化表
        AdminImpl admin = new AdminImpl();
        StudentImpl student = new StudentImpl();
        System.out.println("admin:" + admin);
        System.out.println("Student:" + student);

        getServletContext().setAttribute("admin", admin);
        getServletContext().setAttribute("student", student);
        System.out.println("day47_InitServlet 初始化完成！");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/day47/errorPage.jsp");
    }
}
