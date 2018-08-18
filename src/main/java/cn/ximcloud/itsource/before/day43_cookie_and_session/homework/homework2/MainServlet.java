package cn.ximcloud.itsource.before.day43_cookie_and_session.homework.homework2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-10
 * Time: 11:46
 * ProjectName: itsource.cn.ximcloud.itsource.before.day43_cookie_and_session._03http_session._by_self
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
@WebServlet(name = "day42_mainServlet_cookie_homework2", urlPatterns = "/day42/homework2/cookie/home.php")
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
        System.out.println(username);
//        String password = req.getParameter("password");

//登录认证操作
        if (true) {
//            创建Cookie
//            在tomcat7当中，是不支持中文的cookie的，所以这里需要URL自己编码一下
            CookieUtil.addCookie(resp, "username", URLEncoder.encode(username, "UTF-8"));
//            主页
            PrintWriter writer = resp.getWriter();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("<html>")
                    .append("欢迎你，")
                    .append(username).append("<hr />")
                    .append("你有")
                    .append("<a href='").append("/day42/homework2/cookie/list.php").append("'>")
                    .append("10")
                    .append("</a>")
                    .append("封未读邮件");
            writer.print(stringBuffer);
        } else {
//            错误页
        }
    }
}
