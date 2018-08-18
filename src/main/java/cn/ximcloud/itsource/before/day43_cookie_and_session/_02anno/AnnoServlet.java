package cn.ximcloud.itsource.before.day43_cookie_and_session._02anno;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wizard
 * @date: 2018-08-10
 * Time: 10:37
 * ProjectName: itsource.cn.ximcloud.itsource.before.day43_cookie_and_session._01mapping._02anno
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
 * 从开发角度上:注解,简单:
 * 从维护角度上:注解,维护困难.
 * 使用注解又把硬编码再次拉回到代码中:
 * 开发中:通用配置一般使用xml完成.(维护性好,清晰)
 * 特殊/个体自身配置,使用注解.
 * <p>
 * WebServlet
 * name :   String  Servlet name
 * url  :   String[]  Servlet url-patterns
 * loadOnStartup   :   是否在tomcat启动的时候生成实例对象并执行init()方法
 * <p>
 * WebInitParam
 * name    :   初始化参数的名字
 * value   :   初始化参数的值
 **/
@WebServlet(name = "anno", urlPatterns = {"/day43/anno.php", "/day43/test/*"})
@WebInitParam(name = "usamimizugi", value = "ourinsama")
public class AnnoServlet extends HttpServlet {
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

    /**
     * 钩子方法，每次访问都被执行到
     *
     * @throws ServletException ServletException
     */
    @Override
    public void init() throws ServletException {
        System.out.println("anno init()");
    }
}
