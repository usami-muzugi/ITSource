package cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.servlet;

import cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.dao.impl.ItemImpl;
import cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.dao.impl.ListImpl;
import cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.dao.impl.UserImpl;
import cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.utils.JDBCUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-08-11
 * Time: 00:03
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
@WebServlet(name = "day44_initServlet",loadOnStartup = 1,urlPatterns = "/day44/homework/init")
public class InitServlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        JDBCUtil instance = JDBCUtil.getInstance();
        UserImpl user = new UserImpl();
        ListImpl list = new ListImpl();
        ItemImpl item = new ItemImpl();

        user.createTable();
        list.createTable();
        item.createTable();
        System.out.println("instance: "+instance);
        System.out.println(user);
        System.out.println(list);
        System.out.println(item);
        ServletContext servletContext = getServletConfig().getServletContext();
        servletContext.setAttribute("instance",instance);
        servletContext.setAttribute("user",user);
        servletContext.setAttribute("list",list);
        servletContext.setAttribute("item",item);
        System.out.println("初始化完成!");
    }
    /**
     * 仅第一次访问才会被执行到，或者是使用了loadOnStartup,就可以再Tomcat启动的时候被创建对象并初始化执行了
     *
     * @param req  req
     * @param resp resp
     * @throws ServletException ServletException
     * @throws IOException      IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("你好！");
    }

}
