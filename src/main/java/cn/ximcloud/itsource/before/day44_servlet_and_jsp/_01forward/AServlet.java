package cn.ximcloud.itsource.before.day44_servlet_and_jsp._01forward;

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
 * Time: 10:48
 * ProjectName: itsource.cn.ximcloud.itsource.before.day44_servlet_and_jsp._01forward
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
 * 测试请求转发
 * 在请求对象调用getRequestDispatcher()方法，获得一个转发器
 * 然后转发器在调用forward()方法，转发请求和响应对象
 **/
@WebServlet(name = "day44_forward_AServlet", urlPatterns = "/day44/_01forward/a")
public class AServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        浏览器仅请求了一次
        System.out.println("我是A Servlet");
//        什么都不写默认是/day44/_01forward/，也就是这个Servlet所在的path
        req.getRequestDispatcher("b").forward(req, resp);
//        响应是转发的Servlet来响应，AServlet不会响应
        System.out.println("我是A Servlet，但是我是在转发后执行的！！！！！！");
    }
}
