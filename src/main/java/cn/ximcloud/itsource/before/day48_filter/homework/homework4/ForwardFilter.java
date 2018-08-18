package cn.ximcloud.itsource.before.day48_filter.homework.homework4;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-17
 * Time: 22:25
 * ProjectName: itsource.cn.ximcloud.itsource.before.day48_filter.homework.homework4
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
public class ForwardFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
//        <dispatcher>REQUEST</dispatcher> 默认就是REQUEST 就是说访问的请求会被过滤器拦截
//        <dispatcher>FORWARD</dispatcher> 意思就是仅是转发的请求才会被过滤器拦截
//        这里注意下转发和重定向的区别，转发是在服务器内部发生的，而重定向是服务器发送301重定向给浏览器
//        然后浏览器重新访问了另一个资源。所以这里301重定向不构成转发的过滤器的要数
        response.sendRedirect("baidu.com");
//        如果想同时处理重定向和转发，需要加上两个
//        <dispatcher>REQUEST</dispatcher>
//        <dispatcher>FORWARD</dispatcher>


//        放行
        System.out.println("过滤了一下");
        chain.doFilter(request, response);
    }
}
