package cn.ximcloud.itsource.day1_day47.day42_learning_servlet._02servlet_alive_and_die;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.Enumeration;


/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-08
 * Time: 10:24
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day42_learning_servlet
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
 * <p>
 * 当Tomcat启动的时候，并不会直接去创建自己写的Servlet实例，而是在url被访问到的时候才会加载，并且会把这个
 * 对象存储到缓存池，每一访问url时，是在缓存池中使用这个对象。
 **/
@WebServlet(name = "day40-helloServlet2", urlPatterns = "/day40/hello2.php",
        description = "这个Servlet是测试Servlet第一次被执行到的时候，访问init方法并且会得到一个ServletConfig对象")
public class MyServlet2 implements Servlet {

    /**
     * 启动的时候，执行一次
     *
     * @param servletConfig 初始化配置对象，由Tomcat容器传递过来
     * @throws ServletException 一个异常
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
//        获取这个Servlet的名字
        System.out.println(servletConfig.getServletName());
//        获取这个Servlet的自有的参数（在XML里面）
        System.out.println(servletConfig.getInitParameter("namespace"));
//        通过getInitParameterNames获取所有的名字
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
//        在通过迭代的方式遍历下
        while (initParameterNames.hasMoreElements()) {
            String s = initParameterNames.nextElement();
            System.out.println(s + " -- " + servletConfig.getInitParameter(s));
        }
    }

    /**
     * 每次访问，执行一次
     *
     * @param servletRequest  Servlet请求对象
     * @param servletResponse Servlet相应对象
     * @throws ServletException 一个异常
     * @throws IOException      另一个异常
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("你好 Servlet！再次见面，请多多指教！");
    }

    /**
     * 销毁Servlet的时候，执行一次。是在关闭Tomcat正常关闭的时候执行的，并不是强制关闭虚拟机什么的
     */
    @Override
    public void destroy() {
        System.out.println("再见Servlet!");
    }

    /**
     * 获取配置ServletConfig 配置信息
     *
     * @return 一个配置信息对象
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 该方法返回Servlet的信息
     *
     * @return 作者、版权等
     */
    @Override
    public String getServletInfo() {
        return null;
    }
}
