package cn.ximcloud.itsource.before.day44_servlet_and_jsp.homework.homework3;

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
 * @date: 2018-08-12
 * Time: 01:07
 * ProjectName: itsource.cn.ximcloud.itsource.before.day44_servlet_and_jsp.homework.homework3
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
@WebServlet(name = "day44_homework_SumServlet", urlPatterns = "/day44/homework2/SumServlet")
public class SumServlet extends HttpServlet {
    /**
     * @param s
     * @return
     * @throws Exception
     */
    private static float opt(String s) throws Exception {
        if (s == null || "".equals(s.trim())) {
            return 0F;
        }
        int a1 = s.indexOf("+");
        int a2 = s.indexOf("-");
        int a3 = s.indexOf("*");
        int a4 = s.indexOf("/");
        int a5 = s.indexOf("(");
        if (a1 == -1 && a2 == -1 && a3 == -1 && a4 == -1) {
            if (s.trim() == null || "".equals(s.trim())) {
                throw new Exception("operate error");
            }
            return Float.parseFloat(s.trim());
        }

        if (a5 != -1) {
            int a6 = s.indexOf(")");
            if (a6 == -1) {
                throw new Exception("括号不匹配");
            } else {
                float f = opt(s.substring(a5 + 1, a6).trim());
                s = s.replace(s.substring(a5, a6 + 1), String.valueOf(f));
                return opt(s);
            }
        }

        if (a1 != -1) {
            return opt(s.substring(0, a1)) + opt(s.substring(a1 + 1, s.length()));
        }
        if (a2 != -1) {
            return opt(s.substring(0, a2)) - opt(s.substring(a2 + 1, s.length()));
        }
        if (a3 != -1) {
            return opt(s.substring(0, a3)) * opt(s.substring(a3 + 1, s.length()));
        }
        if (a4 != -1) {
            return opt(s.substring(0, a4)) / opt(s.substring(a4 + 1, s.length()));
        }
        return Integer.parseInt(s.trim());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String val_a = req.getParameter("val_a");
        String select = req.getParameter("select");
        String val_b = req.getParameter("val_b");
        float opt = 0F;
        try {
            opt = opt(val_a + select + val_b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("var2:" + opt);
        req.getSession().setAttribute("var", opt);
        req.getSession().setAttribute("1231", "31231");
        req.getRequestDispatcher("/day44/homework/Sum.jsp").forward(req, resp);
    }
}
