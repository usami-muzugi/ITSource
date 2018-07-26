package cn.ximcloud.itsource.day18_ecplise_se.leveltest;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-03
 * Time: 14:06
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
public class _02 {  //第二题也没什么问题
    /*
    2，题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
       第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
       到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
     */
    public static void main(String[] args) {
        int day = 10, sum = 1;
        for (int i = 1; i < day; i++) {
            sum++;
            sum *= 2;
        }
        System.out.println("第一天共摘了" + sum + "个桃子");

//        int index = 3070;
//        for (int i = 0; i < 10; i++) {
//            index /= 2;
//            index--;
//        }
//        System.out.println(index);
    }

}
