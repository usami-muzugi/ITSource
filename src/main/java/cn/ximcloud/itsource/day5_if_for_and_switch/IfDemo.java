package cn.ximcloud.itsource.day5_if_for_and_switch;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-13
 * Time: 14:15
 * ProjectName: ITSource
 * To change this template use FileDemo | Settings | Editor | FileDemo and Code Templates.
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

public class IfDemo {
    /*
        if 选择结构
            1.语法机构
            if(boolean类型的值、表达式、变量都可以){
                //功能执行语句
            }


            if(){

            }else if(){

            }else if(){

            }else if(){

            }
     */
    public static void main(String[] args) {
        int sex = 0; //性别表示
        if (sex == 0) { //(括号内是boolean类型的值、表达式、变量)
            //功能执行语句
            System.out.println("男厕所");
        }
        //独立的选择结构，不互斥！
        if (sex == 1) {
            System.out.println("女厕所");
        }
        if (sex == 2) {
            System.out.println("草丛厕所");
        }
        if (sex == 4) {
            System.out.println("没厕所");
        } else {
        }


        //结构相互不是独立的，互斥
        if (sex == 0) {
            System.out.println("男厕所");
        } else if (sex == 1) {
            System.out.println("女厕所");
        } else if (sex == 2) {
            System.out.println("草丛厕所");
        } else {
            //sex ==4
            System.out.println("没厕所");
        }

        if (sex == 0) {
            System.out.println("男厕所");
        } else {
            System.out.println("其他厕所");
        }

        if (sex == 1) {
            System.out.println(sex);
        } else {
            System.out.println(2);
        } /*else if ()   //else if with out if，  else if 的if需要放在else语句结构体之前
        }*/


        //求出两个便来给你或者弄个的最大值
        int a = 10;
        int b = 14;
        if (a > b) {
            System.out.println(a + ">" + b);
        } else if (a < b) {
            System.out.println(a + "<" + b);
        } else {
            System.out.println(a + "=" + b);
        }

        //判断一个数是否是3的倍数
        int var = 4399;
        if (var % 3 == 0) {
            System.out.println("这个数" + var + "是3的倍数");
        } else {
            System.out.println("这个数" + var + "不是3的倍数");
        }


        //小明JAVA考试成绩，按等级分为A B C D，判断变量在不同的范围的，打印输出不同的等级
        int score = 66;
        if (score < 60) {
            System.out.println("成绩不及格 E");
        } else if (score >= 60 & score < 70) {
            System.out.println("成绩良好 D");
        } else if (score >= 70 & score < 80) {
            System.out.println("成绩优良 C");
        } else if (score >= 80 & score < 90) {
            System.out.println("成绩优秀 B");
        } else {
            System.out.println("成绩独秀 A");
        }
    }
}

