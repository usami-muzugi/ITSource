package cn.ximcloud.itsource.day13_abstact_and_interface;

import cn.ximcloud.itsource.day13_abstact_and_interface.admin.Admin;
import cn.ximcloud.itsource.day13_abstact_and_interface.controll.AdminController;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-24
 * Time: 12:36
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

public class Menu {
    private Menu() {

    }

    public static void start() {
        for (; ; ) {
            try {
                mainMenu();
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException 输入不匹配！重新输入！");
            }
        }
    }

    private static void mainMenu() throws InputMismatchException {
        String string = "********汽车租聘系统********\n******* 1 - 登录    ********\n******* 0 - 退出    ********\n****************************\n请输入操作数:";
        System.out.println(string);
        String[] userInfo = new String[2];
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                System.out.print("请输入用户名:");
                userInfo[0] = scanner.next();
                System.out.print("请输入密码:");
                userInfo[1] = scanner.next();
                login(userInfo);
                break;
            case 0:
                logout();
                break;
            default:
                System.out.println("\n输入的数字有误！重新输入");
                break;
        }


    }

    private static void login(String[] strings) {
        if (new AdminController().select(new Admin(strings)) != null) {
            System.out.println(Arrays.toString(strings));
            System.out.println();
        } else {
            System.out.println("用户名或密码错误！重新输入\n");
        }
    }

    private static void logout() {
        System.out.println("感谢使用！");
    }

}
