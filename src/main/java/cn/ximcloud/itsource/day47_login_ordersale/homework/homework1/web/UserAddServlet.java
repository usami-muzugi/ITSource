package cn.ximcloud.itsource.day47_login_ordersale.homework.homework1.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-16
 * Time: 16:50
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
@WebServlet(name = "day47_UserAddServlet", urlPatterns = "/day47/homework/admin/add")
public class UserAddServlet extends HttpServlet {
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
            student.save(stu);
            ArrayList<Student> all = student.findAll();
            req.getSession().setAttribute("ALL_STUDENT_IN_SESSION", all);
            resp.sendRedirect("/day46/list.jsp");
        } else {
            resp.sendRedirect("/day46/errorPage.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/day46/errorPage.jsp");
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
