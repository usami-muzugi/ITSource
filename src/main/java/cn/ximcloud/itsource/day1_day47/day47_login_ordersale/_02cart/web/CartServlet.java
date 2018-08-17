package cn.ximcloud.itsource.day1_day47.day47_login_ordersale._02cart.web;

import cn.ximcloud.itsource.day1_day47.day47_login_ordersale._02cart.cart.Cart;
import cn.ximcloud.itsource.day1_day47.day47_login_ordersale._02cart.cart.Item;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-15
 * Time: 14:14
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day47_login_ordersale._02cart.web
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
 **/
@WebServlet(name = "day47_CartServlet", urlPatterns = "/day47/cart")
public class CartServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String cmd = req.getParameter("cmd");
        if ("add".equals(cmd)) {
            add(req, resp);
        } else {
            remove(req, resp);
        }
    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> parameterMap = req.getParameterMap();
        Item item = new Item();
        try {
            BeanUtils.copyProperties(item, parameterMap);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        switch (item.getItemName()) {
            case "手机":
                item.setId(1L);
                item.setItemPrice(100D);
                break;
            case "平板":
                item.setId(12L);
                item.setItemPrice(500D);
                break;
            case "电脑":
                item.setId(123L);
                item.setItemPrice(1000D);
                break;
            case "手表":
                item.setId(1234L);
                item.setItemPrice(1000D);
                break;
            case "小姐姐":
                item.setId(10086L);
                item.setItemPrice(10000D);
                break;
        }
        System.out.println(item);
        Cart list_in_session = (Cart) req.getSession().getAttribute("LIST_IN_SESSION");
        if (list_in_session == null) {
            Cart cart = new Cart();
            cart.add(item);
            req.getSession().setAttribute("LIST_IN_SESSION", cart);
        } else {
            list_in_session.add(item);
        }
        resp.sendRedirect("/day47/list.jsp");

//        req.getRequestDispatcher("/day47/list.jsp").forward(req, resp);
    }

    protected void remove(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cart list_in_session = (Cart) req.getSession().getAttribute("LIST_IN_SESSION");
        list_in_session.remove(Long.valueOf(req.getParameter("id")));
        resp.sendRedirect("/day47/list.jsp");
    }
}
