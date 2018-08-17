package cn.ximcloud.itsource.day1_day47.day18_ecplise_se.leveltest;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-03
 * Time: 14:06
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
public class _03 {  //第三题没问题
    public static void main(String[] args) {
        Score scoreArray = new Score(1000);
        scoreArray.found();
    }


}

class Score {
    private Integer[] arr;

    /**
     * Score对象实例化，并初始化arr数组
     *
     * @param num 学生人数
     */
    public Score(int num) {
        Random random = new Random();
        arr = new Integer[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }

    }

    //getSet()
    public Integer[] getArr() {
        return arr;
    }

    public void setArr(Integer[] arr) {
        this.arr = arr;
    }

    /**
     * 学生成绩人数汇总
     */
    public void found() {
        if (!(arr == null || arr.length == 0)) {
            int a = 0, b = 0, c = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 100) {
                    a++;
                } else if (90 <= arr[i] && arr[i] < 100) {
                    b++;
                } else if (80 <= arr[i] && arr[i] < 90) {
                    c++;
                }
            }
            System.out.println("100分学生人数:" + a + "，90-99学生人数:" + b + "，80-89的学生人数:" + c);
        }
    }
}

