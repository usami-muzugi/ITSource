package cn.ximcloud.itsource.day48_filter.homework.homework2;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
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
 * Time: 21:55
 * ProjectName: itsource.cn.ximcloud.itsource.day48_filter.homework.homework2
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

public class GetConfigFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {

    }

    //    拿取Filter的配置信息
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        可以调用filterConfig对象来拿去，这里的filterConfig对象，也是Tomcat容器在启动的时候，
//        为Filter对象自动创建的，所以这里可以拿来字节用
//        这里的几个方法，和Servlet的方法都相同，只是有个是getFilterName()方法

//        通过项目的web.xml中该过滤器的键值对来拿去对应的属性
        String encoding = filterConfig.getInitParameter("encoding");
        System.out.println(encoding);

//        通过项目的web.xml中该过滤器的键值对来拿去对应的属性
        filterConfig.getInitParameterNames();
//        获取配置上下文
        filterConfig.getServletContext();
//        获取过滤器的名字，xml或者是注解设置的
        String filterName = filterConfig.getFilterName();
    }
}
