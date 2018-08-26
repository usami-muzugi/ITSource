package cn.ximcloud.itsource.before.day52_mini_struts2.action;

import cn.ximcloud.itsource.before.day52_mini_struts2.context.ActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-24
 * Time: 19:20
 * ProjectName: itsource.cn.ximcloud.itsource.before.day52_mini_struts2.action
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

public class UserAction {

    public String execute() {
        ActionContext actionContext = ActionContext.getActionContext();
        HttpServletRequest httpServletRequest = actionContext.getHttpServletRequest();
        httpServletRequest.setAttribute("告白", "不能");
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        if ("卢思颖".equals(username) && "usamimizugi".equals(password)) {
            System.out.println("卢思颖");
            return "success";
        }
        return "error";
    }
}
