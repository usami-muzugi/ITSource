package cn.ximcloud.itsource.day1_day47.day42_learning_servlet._04dicheng.question1;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
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
@WebServlet(name = "liucheng_question1", urlPatterns = "/day42/question1.php")
public class MyServlet extends BaseMyGenericServlet {
    /**
     * 子类如果只想重写这个Servlet接口的service方法，就可以采用这种方式，不必每次都去实现其他方法。
     * 然后重写，很烦。
     * 这里我们仅需要对象service进行业务操作，所以保持了BaseMyGenericServlet的抽象并且继续保持service()方法的抽象
     * 所以这里子类需要重写这个方法。
     *
     * @param req ServletRequest Servlet请求
     * @param res ServletResponse Servlet响应
     * @throws ServletException 一个异常
     * @throws IOException      又一个异常
     */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("hello Servlet!");
    }

}
