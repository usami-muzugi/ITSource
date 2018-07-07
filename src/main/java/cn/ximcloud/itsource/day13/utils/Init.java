package cn.ximcloud.itsource.day13.utils;

import cn.ximcloud.itsource.day13.admin.Admin;
import cn.ximcloud.itsource.day13.admin.AdminList;
import cn.ximcloud.itsource.day13.controll.AdminController;
import cn.ximcloud.itsource.day13.system.CarSystem;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-24
 * Time: 13:27
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

public class Init {
    /*
     *  初始化工作
     *  需要检查\data目录下是否有Admin.txt,有的话，就删除
     */

    private Init() {

    }

    public static void start() {

        checkFile();    //检查文件
        initAdminListAndAdmins();   //初始化管理员列表和管理员

    }


    /**
     *  检查文件
     */
    private static void checkFile() {

        File file = new File("\\data\\Admin.txt");
        //检查\data目录下是否有Admin.txt,有的话，就删除
        if (file.exists()) {
            file.delete();
        }
    }

    /**
     *  初始化管理员列表和管理员
     */
    public static void initAdminListAndAdmins() {
        //初始化管理员列表
        AdminList.getInstance().setAdminlist(new ArrayList<Admin>());
        new AdminController().create(new Admin(CarSystem.SUPER_ADMIN_NAME, CarSystem.SUPER_ADMIN_PASSWORD));
    }


}
