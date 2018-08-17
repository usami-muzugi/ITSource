package cn.ximcloud.itsource.day1_day47.day42_learning_servlet._04dicheng.question6;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wizard
 * @date: 2018-08-08
 * Time: 18:48
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day42_learning_servlet._04dicheng
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
 * 子类继承了这个实现接口的父类所以由父类所有的方法，并且自己可以重写父类的
 * 这些方法来达到实现功能，Tomcat启动的时候，在子类么有找到方法就会自己去父类
 * 查找这些方法
 **/
@WebServlet(name = "liucheng_question6", urlPatterns = "/day42/question6.php")
public class MyServlet extends MyHttpServlet {

    /**
     * 定义一个钩子方法,子类继承直接实现Http专精
     *
     * @param httpServletRequest  处理HttpServletRequest 的请求
     * @param httpServletResponse 处理HttpServletResponse 的请求
     */
    @Override
    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
//        这里实现了一个HttpServlet专精的Service()方法,可以瞎几把写httpServlet的操作
//        但是这样还是不够,还可以加强.于是就有了问题6
    }

    /**
     * 专门用来处理GET的请求的方法 抽象了,让子类实现吧
     *
     * @param httpServletRequest  处理HttpServletRequest 的请求
     * @param httpServletResponse 处理HttpServletResponse 的请求
     */
    @Override
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
//        如果请求时GET方法,就会默认执行这里面的代码
    }

    /**
     * 专门用来处理POST的请求的方法    也抽象了,让子类实现
     *
     * @param httpServletRequest  处理HttpServletRequest 的请求
     * @param httpServletResponse 处理HttpServletResponse 的请求
     */
    @Override
    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
//        如果请求时POST方法,就会默认执行这里面的代码
    }

    /**
     * 父类无参初始化钩子方法
     */
    @Override
    public void init() {
//        这里由于是无参钩子方法,所以Tocamt并不会在初始化的时候调用这个方法,
//        而是调用init(ServiceConfig config) 方法
//        但是子类当中并没有这个方法,于是子类没有找到这个方法而是去调用父类的方法
//        调用父类的方式并且会执行这个无参的钩子方法,反而会回来调用这个无参的init()方法
//        所以这里可以瞎几把写,都不会报错了
        System.out.println("Hello Servlet!!!");
    }

    //
//    /**
//     * 子类覆写了父类的init()方法，问题：这里的super.init(config)能否删除？
//     * @param config ServletConfig是一个接口，所以这里实际上传入的是一个ServletConfig接口的实现类
//     * @throws ServletException
//     */
//    @Override
//    public void init(ServletConfig config) throws ServletException {
////        调用父类的init()方法目的是初始化config字段
////        super.init(config);
////        删除这一行会报错的，由于inti方法没有初始化config字段，所以在service()方法中无法接收到config
////        congfig对象未null,导致NullPointException
////        所以这里需要用到一个钩子方法hock,
////        java.lang.NullPointerException
////        cn.ximcloud.itsource.day1_day47.day42_learning_servlet._04dicheng.question4.MyServlet.service(MyServlet.java:69)
////        org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53)
//    }

    /**
     * 子类如果只想重写这个Servlet接口的service方法，就可以采用这种方式，不必每次都去实现，然后重写，很烦
     *
     * @param req ServletRequest Servlet请求
     * @param res ServletResponse Servlet响应
     * @throws ServletException 一个异常
     * @throws IOException      又一个异常
     */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Hello World!");
//        方法1
//        由于子类没有重写这个getServletConfig()方法，所以这里会自己去调用它的父类的方法。
        ServletConfig servletConfig = getServletConfig();
        String servletName = servletConfig.getServletName();
        System.out.println(servletName);
//        方法2   前提是这个config没有被私有化
//        System.out.println(config)

//        通过父类实现ServletConfig接口，子类可以直接调用父类的方法
        ServletContext servletContext = getServletContext();
        System.out.println(servletContext);
        String servletName1 = getServletName();
        System.out.println(servletName1);
        Enumeration<String> initParameterNames = getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String s = initParameterNames.nextElement();
            System.out.println(s + " -- " + getInitParameter(s));
        }
    }
}
