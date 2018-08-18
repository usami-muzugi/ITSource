package cn.ximcloud.itsource.before.day44_servlet_and_jsp.homework.homework1.servlet;

import cn.ximcloud.itsource.before.day44_servlet_and_jsp.homework.homework1.dao.impl.UserImpl;
import cn.ximcloud.itsource.before.day44_servlet_and_jsp.homework.homework1.domain.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-08-11
 * Time: 00:04
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
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
 * //         佛祖保佑          永无BUG          永不修改             //
 * ////////////////////////////////////////////////////////////////////
 *
 * @author Wizard
 */
@WebServlet(name = "day44_homework1_MainServlet", urlPatterns = "/day44/homework/main")
public class MainServlet extends HttpServlet {

    /**
     * @param req  login页面的请求
     * @param resp resp
     * @throws ServletException ServletException
     * @throws IOException      IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        设置编码格式
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
//        获取请求的值
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        ServletContext servletContext = getServletConfig().getServletContext();
//        JDBCUtil instance = (JDBCUtil) servletContext.getAttribute("instance");
        UserImpl user = (UserImpl) servletContext.getAttribute("user");
        System.out.println("user:" + user);


//登录认证操作
        PrintWriter writer = resp.getWriter();
        StringBuffer stringBuffer = new StringBuffer();
        User u;
        if ((u = user.login(username, password)) != null) {
//            创建Cookie
//            在tomcat7当中，是不支持中文的cookie的，所以这里需要URL自己编码一下
//            CookieUtil.addCookie(resp, "username", URLEncoder.encode(username, "UTF-8"));
//            主页
            req.getSession().setAttribute("USERNAME_IN_SESSION", u.getUsername());
            stringBuffer.append("<html>")
                    .append("欢迎你，")
                    .append(u.getUsername()).append("<hr />")
                    .append("你有")
                    .append("<a href='").append("/day44/homework/list").append("'>")
                    .append("10")
                    .append("</a>")
                    .append("封未读邮件");
        } else {
            stringBuffer.append("<html>")
                    .append("傻逼东西你登录错了吧！")
                    .append("<hr />");
        }
        writer.print(stringBuffer);
    }
}
