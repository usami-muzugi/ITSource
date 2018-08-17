package cn.ximcloud.itsource.day1_day47.day46_rebuild._01rebuild.test;

import cn.ximcloud.itsource.day1_day47.day46_rebuild._01rebuild.dao.impl.AdminImpl;
import cn.ximcloud.itsource.day1_day47.day46_rebuild._01rebuild.dao.impl.StudentImpl;
import cn.ximcloud.itsource.day1_day47.day46_rebuild._01rebuild.domain.Admin;
import cn.ximcloud.itsource.day1_day47.day46_rebuild._01rebuild.domain.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-13
 * Time: 20:53
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day45_javabean.homework.homework5.test
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

public class DaoTest {
    @Test
    public void testSave() {
        StudentImpl student = new StudentImpl();
        student.save(new Student("彭睿", 20, "男", "JAVA0606"));
    }

    @Test
    public void testFind() {
        StudentImpl student = new StudentImpl();
        Student student1 = student.find(1);
        System.out.println(student1);
        ArrayList<Student> all = student.findAll();
        System.out.println(Collections.singletonList(all));
    }

    @Test
    public void testUpdate() {
        StudentImpl student = new StudentImpl();
        Student student1 = student.find(1);
        System.out.println(student1.getAge());
        student1.setAge(666);
        student.update(student1);
        System.out.println(student.find(1).getAge());
    }

    @Test
    public void testAdminLogin() {
        AdminImpl admin = new AdminImpl();
        Admin login = admin.login(1, "ourinsama");
    }
}
