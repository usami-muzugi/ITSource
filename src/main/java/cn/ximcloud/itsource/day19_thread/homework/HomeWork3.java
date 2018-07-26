package cn.ximcloud.itsource.day19_thread.homework;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-04
 * Time: 18:45
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class HomeWork3 {
    /*
      2.	以下最终打印的结果是多少
     */
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {   //i: 0,1,2
            switch (i) {
                default:
                    System.out.println("D");
                case 0:
                    System.out.println("B");
                    break;
                case 1:
                    System.out.println("A");
                    break;
            }
        }
//result:B A D B
    }
}
