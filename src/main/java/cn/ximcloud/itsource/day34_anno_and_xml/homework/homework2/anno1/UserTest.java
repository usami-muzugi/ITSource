package cn.ximcloud.itsource.day34_anno_and_xml.homework.homework2.anno1;

import org.junit.AfterClass;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-28
 * Time: 22:52
 * ProjectName: ITSource
 * To change this template use File | Settings | File Templates.
 * ////////////////////////////////////////////////////////////////////
 **/
public class UserTest {
    @CheckVIP(admin = true)
    private User admim;

    @Test
    public void userLoginTest() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.updateUser(new User("admin", "22222"));
        admim = userService.login("admin", "111");
        userService.findAll();

    }

    @AfterClass
    public static void doAfterClass() throws NoSuchFieldException {
        Field admim = UserTest.class.getDeclaredField("admim");
        CheckVIP annotation = admim.getAnnotation(CheckVIP.class);
        boolean admin = annotation.admin();
        System.out.println(admin);

    }
}
