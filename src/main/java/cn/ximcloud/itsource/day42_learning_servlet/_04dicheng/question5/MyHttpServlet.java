package cn.ximcloud.itsource.day42_learning_servlet._04dicheng.question5;

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
 * ProjectName: itsource.cn.ximcloud.itsource.day42_learning_servlet._04dicheng.question5
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
 **/
public class MyHttpServlet extends BaseMyGenericServlet {
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

    }
}
