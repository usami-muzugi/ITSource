package cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.servlet;

import cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.dao.impl.ListImpl;
import cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.dao.impl.StudentImpl;
import cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.domain.Admin;
import cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.domain.Student;
import cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.domain.StudentList;
import cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.util.CharUtil;

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
 * @author: wizard
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
 **/
@WebServlet(name = "day45_homework5_UpdateServlet", urlPatterns = "/day45/homework5/update")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Admin admin_in_session = (Admin) req.getSession().getAttribute("ADMIN_IN_SESSION");
        if (admin_in_session != null) {
//            有Session,获取一下
            String name = CharUtil.charset(req.getParameter("name"));
            String age = CharUtil.charset(req.getParameter("age"));
            String sex = CharUtil.charset(req.getParameter("age"));
            req.setCharacterEncoding("UTF-8");
            resp.setCharacterEncoding("UTF-8");
            ListImpl list = (ListImpl) getServletContext().getAttribute("list");
            StudentImpl student = (StudentImpl) getServletContext().getAttribute("student");
            list.save(new StudentList(name));
            student.save(new Student(Integer.valueOf(age), Boolean.valueOf(sex)));
            ArrayList<StudentList> all = list.findAll();
            req.getSession().setAttribute("ALL_STUDENT_IN_SESSION", all);
            resp.sendRedirect("/day45/homework/list.jsp");
        } else {
            resp.sendRedirect("/day45/homework/errorPage.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/day45/homework/errorPage.jsp");
    }

    String charset(String string) {
        byte[] bytes;
        try {
            bytes = string.getBytes("ISO-8859-1");
            return new String(bytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
