package cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework2;

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
 * @date: 2018-08-11
 * Time: 14:40
 * ProjectName: itsource.cn.ximcloud.itsource.day44_servlet_and_jsp._04count
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
 *
 * 测试HttpServletRequest，Session，ServletContext 对象的生命周期
 * 结果是HttpServletRequest的生命周期是一个请求的结束
 * 也就是说每一次的请求都是不相同的一个请求对象
 * 但是session是浏览器的打开、操作和关闭
 * 所以Session的生命周期是比较长的。但是值得注意的是当一个人打开了两个浏览器（不相同耳朵浏览器）的时候，
 * 其实是开启了两个会话。是分别计数的
 * 而ServletContext的生命周期是最长的，是随着Tomcat的启动和关闭。
 *
 * 完成计数器(作用域经典案例)
 **/

@WebServlet(name = "day44_homework_count",urlPatterns = "/day44/homework_count")
public class CountServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        请求对象
        Integer sum_in_request = (Integer) req.getAttribute("SUM_IN_REQUEST");
        if (sum_in_request == null) {
            req.setAttribute("SUM_IN_REQUEST", 1);
        } else {
            req.setAttribute("SUM_IN_REQUEST", sum_in_request+1);
        }
//        Session对象
        Integer sum_in_session = (Integer) req.getSession().getAttribute("SUM_IN_SESSION");
        if (sum_in_session == null) {
            req.getSession().setAttribute("SUM_IN_SESSION", 1);
        } else {
            req.getSession().setAttribute("SUM_IN_SESSION", sum_in_session+1);
        }
//        Application(ServletContext)对象
        Integer sum_in_server_context = (Integer) getServletContext().getAttribute("SUM_IN_SERVER_CONTEXT");
        if (sum_in_server_context == null) {
            getServletContext().setAttribute("SUM_IN_SERVER_CONTEXT", 1);
        } else {
            getServletContext().setAttribute("SUM_IN_SERVER_CONTEXT", sum_in_server_context+1);
        }

//        转发下
        req.getRequestDispatcher("result").forward(req, resp);
    }
}
