package cn.ximcloud.itsource.day1_day47.day47_login_ordersale.homework.homework1.test;

import cn.ximcloud.itsource.day1_day47.day47_login_ordersale.homework.homework1.dao.impl.AdminImpl;
import cn.ximcloud.itsource.day1_day47.day47_login_ordersale.homework.homework1.domain.Admin;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-16
 * Time: 11:19
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day47_login_ordersale.homework.homework1.test
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

public class AdminImplTest {

    /**
     * passed
     */
    @Test
    public void testNewAdminImpl() {
        AdminImpl admin = new AdminImpl();
    }

    /**
     *  passed
     */
    @Test
    public void testAdminImplFind() {
        Long id = 1L;
        AdminImpl admin = new AdminImpl();
        Admin admin1 = admin.find(id);
        System.out.println(admin1);
    }

    /**
     *  passed
     */
    @Test
    public void testAdminImplFindAll() {
        AdminImpl admin = new AdminImpl();
        ArrayList<Admin> all = admin.findAll();
        System.out.println(all);
    }

    /**
     *  passed
     */
    @Test
    public void testAdminImplUpdate() {
        AdminImpl admin = new AdminImpl();
        Admin adm = new Admin();
        adm.setId(1L);
        admin.update(adm);
        System.out.println(admin.findAll());
    }

    /**
     *  passed
     */
    @Test
    public void testAdminImplSave() {
        AdminImpl admin = new AdminImpl();
        Admin adm = new Admin();
        adm.setUsername("shenmegui");
        adm.setPassword("666");
        admin.save(adm);
        System.out.println(admin.findAll());
    }

    /**
     * passed
     */
    @Test
    public void testAdminImplLogin() {
        AdminImpl admin = new AdminImpl();
        String username = "ourin";
        String password = "666";
        Admin login = admin.login(username, password);
        System.out.println(login);
    }

    /**
     * passed
     */
    @Test
    public void testAdminImplLogin2() {
        AdminImpl admin = new AdminImpl();
        String username = "wen";
        String password = "wen";
        Admin login = admin.login(username, password);
        System.out.println(login);
    }
}
