package cn.ximcloud.itsource.day48_filter._04auth;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-17
 * Time: 22:59
 * ProjectName: itsource.cn.ximcloud.itsource.day48_filter._04auth
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

@WebFilter(filterName = "AuthFilter", urlPatterns = "/day48/*")
public class AuthFilter extends HttpFilter {
//    需求:
//      需要对除开登录的action和login.jsp之外的所有的动作，都做出一个拦截，并且
//      判断是否已经登录，如果登录，则正常放行，否则返回登录页面
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        Object admin_in_session = request.getSession().getAttribute("ADMIN_IN_SESSION");
        if ("/day48/login".equals(request.getRequestURI())|| "/day48/login.jsp".equals(request.getRequestURI())) {
            chain.doFilter(request, response);
        } else {
            if (admin_in_session == null) {
//            没有session
//            转发到login.jsp
                request.setAttribute("msg", "没有登录！");
                request.getRequestDispatcher("/day48/login.jsp").forward(request, response);
            } else {
                chain.doFilter(request, response);
            }
        }
    }
}
