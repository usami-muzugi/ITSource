package cn.ximcloud.itsource.before.day39_mysql_with_jdbc._02_learning_DAO.cn.ximcloud.itsource.dao.impl;

import cn.ximcloud.itsource.before.day39_mysql_with_jdbc._02_learning_DAO.cn.ximcloud.itsource.domain.Student;
import org.junit.Test;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-08-04
 * Time: 23:07
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
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
 * //         佛祖保佑          永无BUG          永不修改             //
 * ////////////////////////////////////////////////////////////////////
 **/
public class StudentDAOImplTest {
    private static StudentDAOImpl studentDAO = new StudentDAOImpl();

    @Test
    public void save() {
        Student student = new Student("彭瑞", 20);
        studentDAO.save(student);
    }

    @Test
    public void delete() {
        studentDAO.delete(1);
    }

    @Test
    public void update() {
        studentDAO.update(new Student(1, "彭瑞", 22));
    }

    @Test
    public void find() {
        Student student = studentDAO.find(1);
        System.out.println(student);
    }

    @Test
    public void findAll() {
        List<Student> all = studentDAO.findAll();
        for (Student student : all) {
            System.out.println(student);
        }
    }
}