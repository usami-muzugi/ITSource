package cn.ximcloud.itsource.day42_learning_servlet.homework.homework3.controller;

import cn.ximcloud.itsource.day42_learning_servlet.homework.homework3.dao.IUserDao;
import cn.ximcloud.itsource.day42_learning_servlet.homework.homework3.dao.impl.UserImpl;
import cn.ximcloud.itsource.day42_learning_servlet.homework.homework3.domain.User;

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
 * @author: wizard
 * @date: 2018-08-09
 * Time: 14:57
 * ProjectName: itsource.cn.ximcloud.itsource.day42_learning_servlet.homework.homework1
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
 * 3. 做一个注册和登录（前台，后台，数据库连同）
 * 提示：完成作业后自己分析一下servlet的生命周期与执行流程，这个是以后面试很可能会问到的题
 **/
@WebServlet(name = "homeWork3", urlPatterns = "/day42/homework3.php")
public class LoginServlet extends HttpServlet {
    private static IUserDao user;

    static {
        user = new UserImpl();
    }

    /**
     * @param req  请求
     * @param resp 响应
     * @throws ServletException 一个异常
     * @throws IOException      另一个异常
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        getParameter()方法,是用来获得参数的
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();

        User u;
        if ((u = user.find(username, password)) != null) {
            System.out.println("登录成功!");
            writer.println("id: " + u.getId());
            writer.println("</br>");
            writer.println("name: " + u.getUsername());
            writer.println("</br>");
            writer.println("爱好: ");
            writer.println("</br>");
            String[] split = u.getHobby().split(",");
            for (int i = 0; i < split.length; i++) {
                writer.println(split[i]);
                writer.println("</br>");
            }
        } else {
            System.out.println("登录失败!");
            writer.print("登录失败!");
        }
        writer.flush();
        writer.close();
    }
}
