package cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.servlet;

import cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.dao.impl.ItemImpl;
import cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.dao.impl.ListImpl;
import cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.dao.impl.UserImpl;
import cn.ximcloud.itsource.day44_servlet_and_jsp.homework.homework1.utils.JDBCUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

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
@WebServlet(name = "day44_initServlet", loadOnStartup = 0,urlPatterns = "/day44/init")
public class InitServlet extends HttpServlet {

    /**
     * 初始化钩子方法
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
//        JDBCUtil instance = JDBCUtil.getInstance();
        UserImpl user = new UserImpl();
        ListImpl list = new ListImpl();
        ItemImpl item = new ItemImpl();
//
//        user.createTable();
//        list.createTable();
//        item.createTable();
//        System.out.println("instance: " + instance);
        System.out.println("user:" + user);
        System.out.println("list:" + list);
        System.out.println("list:" + item);
        ServletContext servletContext = getServletConfig().getServletContext();
//        servletContext.setAttribute("instance", instance);
        servletContext.setAttribute("user", user);
        servletContext.setAttribute("list", list);
        servletContext.setAttribute("item", item);
        System.out.println("初始化完成!");
    }
}
