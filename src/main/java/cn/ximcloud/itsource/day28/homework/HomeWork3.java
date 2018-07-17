package cn.ximcloud.itsource.day28.homework;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-17
 * Time: 16:13
 * ProjectName: ITSource.cn.ximcloud.itsource.day28.homework
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
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 * 通过控制台进行交互的猜数字游戏,游戏效果如下：
 *      1.	游戏开始，控制台打印提示竞猜范围
 *      2.	用户可以从控制台输入猜的数据，然后回车提交
 *      3.	程序根据用户输入的数据做出判断，并在控制台打印提示大了 ，小了，对了
 *      4.	可以限定次数 ，例如10次
 *      5.	后台的真实数据最好我们自己都不提前知道，这样比较有趣味性，但是最好不要用户猜一次你后台变一次哈
 **/

public class HomeWork3 {
    public static void main(String[] args) {
        new HomeWork3();
    }
    HomeWork3() {
        System.out.println("交互的猜数字游戏开始辣！");
        int[] initVar = new int[3];
        boolean flag = true;
        while (flag) {
            try {
                System.out.print("值的范围:");
                initVar[0] = new Scanner(System.in).nextInt();
                System.out.print("\n次数:");
                initVar[1] = new Scanner(System.in).nextInt();
                flag = false;
            } catch (InputMismatchException e) {
                System.err.println("输入一个数字！");
            }
        }
        System.out.println("ゲームをはじまりますよ！");
        int temp = 0;
        initVar[2] = new Random().nextInt(initVar[0] + 1);
        for (int i = 1; i < initVar[1] + 1; i++) {
            System.out.print("\n你猜的第" +i + "个值:");
            try {
                temp = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.err.println("输入一个数字！");
                i--;
            }
            if (temp == initVar[2]) {
                System.out.println("恭喜你，你花了 " + i + "次就找到了 " + temp);
                break;
            } else {
                flag = true;
                if (temp > initVar[2]) {
                    System.out.println("抱歉，你第" + i + "次，猜数字找错了！你猜的数字字大了");
                } else {
                    System.out.println("抱歉，你第" + i + "次，猜数字找错了！你猜的数字字小了");
                }
            }
        }
        if (flag) System.out.println("程序结束，你没找到。建议使用二分查找感谢游玩!");
    }
}
