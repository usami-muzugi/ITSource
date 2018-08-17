package cn.ximcloud.itsource.day1_day47.day45_javabean._02servlet_reqmap_javabean;

import cn.ximcloud.itsource.day1_day47.day45_javabean._02servlet_reqmap_javabean.utils.MyBeanUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-12
 * Time: 11:45
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day45_javabean._02servlet_reqmap_javabean
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
@WebServlet(name = "da45_regServlet", urlPatterns = "/day45/regServlet")
public class RegServlet extends HttpServlet {

    /**
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
         * 原先的使用req.getParameter()方法一个一个来取数据代码臃肿
         * 可以使用req.getParameterMap()一下子把所有的参数都存放在一个map里面
         * 需要改一些编码方式，不然对中文的支持不太友好
         */
//        req.setCharacterEncoding("UTF-8");
//        Map<String, String[]> parameterMap = req.getParameterMap();
//        User u = new User();
//        try {
////            然后调用BeanUtils.copyProperties(Object dest,Object map) 方法，将map里面的数据复制给dest对象当中去
//            BeanUtils.copyProperties(u, parameterMap);
//        } catch (IllegalAccessException | InvocationTargetException e) {
//            e.printStackTrace();
//        }

        User user = MyBeanUtil.requestToObject(req, User.class);

        System.out.println(user);
    }
}
