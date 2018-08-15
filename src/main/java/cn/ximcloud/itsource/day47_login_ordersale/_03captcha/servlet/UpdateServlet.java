package cn.ximcloud.itsource.day47_login_ordersale._03captcha.servlet;

import cn.ximcloud.itsource.day47_login_ordersale._03captcha.dao.impl.StudentImpl;
import cn.ximcloud.itsource.day47_login_ordersale._03captcha.domain.Admin;
import cn.ximcloud.itsource.day47_login_ordersale._03captcha.domain.Student;
import cn.ximcloud.itsource.day47_login_ordersale._03captcha.util.MyBeanUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-14
 * Time: 11:39
 * ProjectName: itsource.cn.ximcloud.itsource.day46_rebuild._01rebuild.servlet
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
@WebServlet(name = "update_servlet_captcha_captcha",urlPatterns = "/day47/update_captcha")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Admin admin_in_session = (Admin) req.getSession().getAttribute("ADMIN_IN_SESSION");
        if (admin_in_session != null) {
//            有Session,获取一下
            req.setCharacterEncoding("UTF-8");
            resp.setCharacterEncoding("UTF-8");
            Student stu = MyBeanUtil.requestToObject(req, Student.class);
            System.out.println("stu :" + stu);
            StudentImpl student = (StudentImpl) getServletContext().getAttribute("student");
            student.update(stu);
            ArrayList<Student> all = student.findAll();
            req.getSession().setAttribute("ALL_STUDENT_IN_SESSION", all);
            resp.sendRedirect("/day47/list.jsp");
        } else {
            resp.sendRedirect("/day47/errorPage.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/day47/errorPage.jsp");
    }
}
