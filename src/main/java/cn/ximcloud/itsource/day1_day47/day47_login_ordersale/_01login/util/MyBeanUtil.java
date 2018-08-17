package cn.ximcloud.itsource.day1_day47.day47_login_ordersale._01login.util;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-12
 * Time: 14:18
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day45_javabean._02servlet_reqmap_javabean.utils
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

public class MyBeanUtil {
    //    私有化构造器，不能直接通过new关键字创建实例对象
    private MyBeanUtil() {
    }

    /**
     * @param httpServletRequest 需要通过HttpServletRequest对象来调用getParameterMap()方法来获取到前台传入的Map集合
     * @param tClass             需要指定 指定类型的类，才能通过反射创建对象
     * @param <T>                泛型参数，指定其具体的类型
     * @return 传出一个已经将属性设置好了的对象
     */
    public static <T> T requestToObject(HttpServletRequest httpServletRequest, Class<T> tClass) {
        Map<String, String[]> parameterMap = httpServletRequest.getParameterMap();
        T t = null;
        try {
//            设置请求对象的字符编码
            httpServletRequest.setCharacterEncoding("UTF-8");
            t = tClass.newInstance();
//            传入的Map需要和对象的属性匹配上，不然会抛出一个异常
//            java.lang.NoClassDefFoundError: org/apache/commons/collections/FastHashMap
            BeanUtils.copyProperties(t, parameterMap);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.getMessage();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return t;
    }
}
