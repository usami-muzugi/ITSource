package cn.ximcloud.itsource.day1_day47.day42_learning_servlet._04dicheng.question4;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wizard
 * @date: 2018-08-08
 * Time: 18:47
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
 * <p>
 * 问题1 ：我们一般只执行service方法，但是现在我们直接实现Servlet接口
 * ，所有的方法都需要实现，每个实现类都这样做感觉...
 * 所以我们写了一个抽象类来实现Servlet接口的所有方法，并且只保留了service()方法的抽象
 * <p>
 * 问题2 ：按照1写了代码之后,我们在子类中如果想使用ServletConfig怎么办
 * 如果子类想使用ServletConfig对象，就可以在父类把这个对象抽取出来搞成一个字段
 * <p>
 * 问题3 ：想直接从子类中调用到ServletConfig中的方法而不需要先得到Config对象
 * 我们可以实现ServletConfig方法
 * <p>
 * 4. 问题四：
 * 子类在自己覆写init的时候不小心把调用父类的init方法删掉了怎么办？
 * 解决办法：
 * 在父类中写一个钩子方法init();  然后在父类的原init方法中调用钩子方法，而在子类中覆写钩子方法即可
 **/

public abstract class BaseMyGenericServlet implements Servlet, ServletConfig {
    private ServletConfig config;

    /**
     * 初始化方法，当被第一次访问的时候，被执行且被执行一次，这里传入的是一个ServletConfig的对象
     *
     * @param config ServletConfig是一个接口，所以这里实际上传入的是一个ServletConfig接口的实现类
     * @throws ServletException 抛出一个异常
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
//        当init()被执行到的时候，会接受到一个ServletConfig的实现类的对象
//        这里咱们把它传入出搞成一个字段
        this.config = config;
        init();
    }

    /**
     * 父类无参初始化钩子方法
     */
    public void init() {

    }


    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

    @Override
    public String getServletName() {
        return config.getServletName();
    }

    @Override
    public ServletContext getServletContext() {
        return config.getServletContext();
    }

    @Override
    public String getInitParameter(String name) {
        return config.getInitParameter(name);
    }

    @Override
    public Enumeration<String> getInitParameterNames() {
        return config.getInitParameterNames();
    }
}
