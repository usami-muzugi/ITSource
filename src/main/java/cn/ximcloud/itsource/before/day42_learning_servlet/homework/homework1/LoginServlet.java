package cn.ximcloud.itsource.before.day42_learning_servlet.homework.homework1;

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
 * Time: 14:57
 * ProjectName: itsource.cn.ximcloud.itsource.before.day42_learning_servlet.homework.homework1
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
 * 1.第一题：模拟完成一个登录（使用get提交），解决中文乱码问题
 * 表单中有用户名与密码
 **/
@WebServlet(name = "homeWork1", urlPatterns = "/day42/homework1.php")
public class LoginServlet extends HttpServlet {
    private static final String NAME = "usamimizugi";
    private static final String PASSWORD = "ourinsama";

    /**
     * @param req  请求
     * @param resp 响应
     * @throws ServletException 一个异常
     * @throws IOException      另一个异常
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        getParameter()方法,是用来获得参数的
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username + " -- " + password);

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();

        if ((NAME.equals(username) && PASSWORD.equals(password))) {
            System.out.println("登录成功!");
            writer.print("登录成功!");
        } else {
            System.out.println("登录失败!");
            writer.print("登录失败!");
        }
        writer.flush();
        writer.close();
    }
}
