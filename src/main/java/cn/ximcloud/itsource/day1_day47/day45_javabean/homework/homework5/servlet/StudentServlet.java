package cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.servlet;

import cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.dao.impl.ListImpl;
import cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.dao.impl.StudentImpl;
import cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.domain.Admin;
import cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.domain.Student;
import cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.domain.StudentList;

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
 * Time: 12:10
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
 **/
@WebServlet(name = "day45_homework5_StudentServlet", urlPatterns = "/day45/homework5/stu")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/day45/homework/errorPage.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Admin admin_in_session = (Admin) req.getSession().getAttribute("ADMIN_IN_SESSION");
        if (admin_in_session != null) {
//            有Session,获取一下
            ListImpl list = (ListImpl) getServletContext().getAttribute("list");
            StudentImpl student = (StudentImpl) getServletContext().getAttribute("student");
            Integer id = Integer.valueOf(req.getParameter("id"));
            StudentList studentList = list.find(id);
            Student stu = student.find(id);
            req.getSession().setAttribute("studentList", studentList);
            req.getSession().setAttribute("stu_info", stu);
            resp.sendRedirect("/day45/homework/student.jsp");
        } else {
            resp.sendRedirect("/day45/homework/errorPage.jsp");
        }
    }
}
