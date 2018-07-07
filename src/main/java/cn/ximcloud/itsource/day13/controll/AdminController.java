package cn.ximcloud.itsource.day13.controll;

import cn.ximcloud.itsource.day13.admin.Admin;
import cn.ximcloud.itsource.day13.admin.AdminList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-24
 * Time: 14:49
 * ProjectName: ITSource
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
 * //         佛祖保佑        永无BUG      永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class AdminController extends AdminControllerImpl {


    @Override
    public Admin create(Admin admin) {
        if (select(admin) == null) {
            ArrayList<Admin> adminList = AdminList.getInstance().getAdminlist();
            adminList.add(admin);
            return admin;
        } else
            return null;
    }

    @Override
    public boolean delete(Admin admin) {
        if (select(admin) == null) {
            return false;
        } else {
            ArrayList<Admin> adminList = AdminList.getInstance().getAdminlist();
            adminList.remove(admin);
            return true;
        }
    }

    @Override
    public boolean alert(Admin a, Admin b) {
        if (select(a) != null) {
            delete(a);
            create(b);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Admin select(Admin admin) {
        Iterator<Admin> iterator = AdminList.getInstance().getAdminlist().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(admin))
                return admin;
        }
        return null;
    }
}
