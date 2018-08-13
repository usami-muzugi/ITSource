package cn.ximcloud.itsource.day43_cookie_and_session.homework.homework2;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wizard
 * @date: 2018-08-10
 * Time: 19:20
 * ProjectName: itsource.cn.ximcloud.itsource.day43_cookie_and_session.homework
 * To change this template use File | Settings | Editor | File and Code Templates.
 * you are not expected to understand this.
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
public class CookieUtil {
    /**
     * 私有化构造方法，不能创建实例，工具类
     */
    private CookieUtil() {
    }

    /**
     * 工具方法，传入两个String就可以创建一个对象了，爽！
     *
     * @param httpServletResponse 传入一个httpServletResponse 用于接受cookie对象
     * @param name                cookie对象的name
     * @param value               cookie对象的值
     */
    static void addCookie(HttpServletResponse httpServletResponse, String name, String value) {
        Cookie cookie = new Cookie(name, value);
        httpServletResponse.addCookie(cookie);
    }

    /**
     * 获取Cookie的方法，传入HttpServletRequest和Cookie的名字就可以获取指定的Cookie了
     *
     * @param httpServletRequest http请求
     * @param name               cookie的名字
     * @return 返回的是一个Cookie，如果没有返回null
     */
    static Cookie getCookie(HttpServletRequest httpServletRequest, String name) {
        if (name == null) {
            return null;
        }
        Cookie[] cookies = httpServletRequest.getCookies();
        for (Cookie cookie : cookies) {
            if (name.equals(cookie.getName())) {
                return cookie;
            }
        }
        return null;
    }
}
