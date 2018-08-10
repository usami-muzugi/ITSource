package cn.ximcloud.itsource.day43_cookie_and_session.homework.homework1.session.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-10
 * Time: 11:46
 * ProjectName: itsource.cn.ximcloud.itsource.day43_cookie_and_session._03http_session._by_self
 * To change this template use File | Settings | Editor | File and Code Templates.
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
@WebServlet(name = "day42_mainServlet_session", urlPatterns = "/day42/session/home.php")
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
//        String password = req.getParameter("password");

//登录认证操作
        if (true) {
//            这里不创建Cookie了，而是得到Session对象并且设置
//            怎么获得Session，在request请求对象里面有一个getSession()方法， 能够获取Session对象
            HttpSession session = req.getSession();
//            setAttribute(String,Object)
            session.setAttribute("username", username);
//          设置完Session就完了，并不是想Cookie需要将这个对象传递出去
//            主页
            PrintWriter writer = resp.getWriter();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("<html>")
                    .append("欢迎你，")
                    .append(username).append("<hr />")
                    .append("你有")
                    .append("<a href='").append("/day42/session/list.php").append("'>")
                    .append("10")
                    .append("</a>")
                    .append("封未读邮件");
            writer.print(stringBuffer);
        } else {
//            错误页
        }
    }
}
