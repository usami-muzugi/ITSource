package cn.ximcloud.itsource.before.day45_javabean.homework.homework5.test;

import cn.ximcloud.itsource.before.day45_javabean.homework.homework5.dao.impl.ListImpl;
import cn.ximcloud.itsource.before.day45_javabean.homework.homework5.dao.impl.StudentImpl;
import cn.ximcloud.itsource.before.day45_javabean.homework.homework5.domain.Student;
import cn.ximcloud.itsource.before.day45_javabean.homework.homework5.domain.StudentList;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-13
 * Time: 20:53
 * ProjectName: itsource.cn.ximcloud.itsource.before.day45_javabean.homework.homework5.test
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
        student.save(new Student());
        ListImpl list = new ListImpl();
        list.save(new StudentList());
    }
}
