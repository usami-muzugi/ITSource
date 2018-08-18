package cn.ximcloud.itsource.before.day42_learning_servlet.homework.homework3.controller;

import cn.ximcloud.itsource.before.day42_learning_servlet.homework.homework3.dao.IUserDao;
import cn.ximcloud.itsource.before.day42_learning_servlet.homework.homework3.dao.impl.UserImpl;
import cn.ximcloud.itsource.before.day42_learning_servlet.homework.homework3.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-09
 * Time: 21:51
 * ProjectName: itsource.cn.ximcloud.itsource.before.day42_learning_servlet.homework.homework3.controller
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
@WebServlet(name = "homeWor3_regist", urlPatterns = "/day42/regist.php")
public class RegiestServlet extends HttpServlet {
    private static IUserDao user;

    static {
        user = new UserImpl();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        getParameter()方法,是用来获得参数的
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobby");
        StringBuilder s = new StringBuilder();
        for (String hobby : hobbies) {
            s.append(hobby);
        }
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        User u = new User(username, password, s.toString());
        user.save(u);
        PrintWriter writer = resp.getWriter();
        System.out.println("注册成功!");
        writer.print("<html>");
        writer.println("注册成功！<a href=\"regist.html\">返回登录</a>");
    }
}
