package cn.ximcloud.itsource.before.day42_learning_servlet._04dicheng.question7;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-09
 * Time: 14:13
 * ProjectName: itsource.cn.ximcloud.itsource.before.day42_learning_servlet._04dicheng.question5
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
 * 专一的类做专一的事情,这里MyHttpServlet 就是专门用于处理Http请求的类
 * 问题6,抽象一下,让子类实现doGet() doPost()方法
 **/
public abstract class MyHttpServlet extends BaseMyGenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        try {
            service((HttpServletRequest) req, (HttpServletResponse) res);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    /**
     * 定义一个钩子方法,子类继承直接实现Http专精
     *
     * @param httpServletRequest  处理HttpServletRequest 的请求
     * @param httpServletResponse 处理HttpServletResponse 的请求
     */
    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
//        把doGet()和doPost()方法作为钩子方法,来被这个service()方法调用
//        就要做一个判断,判断这个傻逼请求是不是GET 还是POST
//        这里可以调用一个方法,那就是getMethod()就可以判断它到底是使用的GET还是POST
//        这里的方法传出的String对象统统都是大写的,不要再深究下去了,就是大写的
//        请求参数传递的方法有多种多样的,POST GET UPDATA DELETE .... 这里我们就设定这两种方法就可以了
//        毕竟是简单实现嘛,要求别太高!
        if (httpServletRequest.getMethod().equals("GET")) {
            doGet(httpServletRequest, httpServletResponse);
        } else {
            doPost(httpServletRequest, httpServletResponse);
        }
    }

    /**
     * 专门用来处理GET的请求的方法 抽象了,让子类实现吧
     *
     * @param httpServletRequest  处理HttpServletRequest 的请求
     * @param httpServletResponse 处理HttpServletResponse 的请求
     */
    public abstract void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse);

    /**
     * 专门用来处理POST的请求的方法    也抽象了,让子类实现,草!
     *
     * @param httpServletRequest  处理HttpServletRequest 的请求
     * @param httpServletResponse 处理HttpServletResponse 的请求
     */
    public abstract void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse);

}
