package cn.ximcloud.itsource.day1_day47.day28_io_stream_2.homework;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Student: wizard
 * Date: 2018-07-17
 * Time: 16:13
 * ProjectName: ITSource.cn.ximcloud.itsource.day1_day47.day28_io_stream_2.homework
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
 * 1.	游戏开始，控制台打印提示竞猜范围
 * 2.	用户可以从控制台输入猜的数据，然后回车提交
 * 3.	程序根据用户输入的数据做出判断，并在控制台打印提示大了 ，小了，对了
 * 4.	可以限定次数 ，例如10次
 * 5.	后台的真实数据最好我们自己都不提前知道，这样比较有趣味性，但是最好不要用户猜一次你后台变一次哈
 **/

public class HomeWork3 {
    HomeWork3() {
        System.out.println("交互的猜数字游戏开始辣！");     //1.打印一句游戏开始辣
        int[] initVar = new int[3];     //2.创建一个初始化的数组。分别表示 取值的范围， 竞猜的次数，和在取值范围内的随机数
        boolean flag = true;//3.这里立一个flag，用于做条件循环
        while (flag) {      // flag初始为true，进行循环
            try {           //4.try代码块里存放可能报错的语句
                System.out.print("值的范围:");
                initVar[0] = new Scanner(System.in).nextInt();      //5.报错的语句为nextInt(),可能传入的不是一个int类型
                System.out.print("\n次数:");
                initVar[1] = new Scanner(System.in).nextInt();      //7.直到两个int类型的值都输入正确之后，才会执行下面的设置flag为false语句。跳出循环
                if (initVar[0] < 0 || initVar[1] < 0) throw new IllegalArgumentException("值需要大于0");
                flag = false;
            } catch (InputMismatchException e) {        //6.报错之后打印下面的语句，但是flag并没有被修改，还是true，所以继续执行while内部得语句。
                System.err.println("输入一个数字！");
            } catch (IllegalArgumentException e) {
                e.getMessage();
            }
        } //9.while end.到此，initVar数组，有了取值范围，有了竞猜次数，有了下面的随机值
        initVar[2] = new Random().nextInt(initVar[0] + 1);  //8.获得随机值，并赋值给initVar[2]。由于random的nextInt方法是左闭又开，是取不到initVar[0]的，所以+1。
        System.out.println("ゲームをはじまりますよ！");     //10.开始游戏
        int temp = 0;   //11.设置临时int变量
        for (int i = 1; i < initVar[1] + 1; i++) {      //12.用for循环来循环竞彩的次数
            System.out.print("\n你猜的第" + i + "个值:");
            try {
                temp = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.err.println("输入一个数字！");
                i--;    //发生错误，如果不--，会执行下一次循环，也就是次数少了一次，所以这里使用--多加一次，抵消掉错误的输入的那一次的次数
                continue;   //BUG:忘记加这个抗体牛了
            }
            if (temp == initVar[2]) {
                System.out.println("恭喜你，你花了 " + i + "次就找到了 " + temp);
                break;  //猜中了，跳出循环
            } else {    //没猜中，提示大了还是小了
                flag = true;
                if (temp > initVar[2]) {
                    System.out.println("抱歉，你第" + i + "次，猜数字找错了！你猜的数字字大了");
                } else {
                    System.out.println("抱歉，你第" + i + "次，猜数字找错了！你猜的数字字小了");
                }
            }
        }
        if (flag) System.out.println("程序结束，你没找到。建议使用二分查找感谢游玩!");    //最后给一个友情提示，完成小程序漂亮收场。
    }

    public static void main(String[] args) {
        new HomeWork3();
    }
}
