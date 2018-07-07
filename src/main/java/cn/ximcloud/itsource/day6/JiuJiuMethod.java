package cn.ximcloud.itsource.day6;


/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-15
 * Time: 09:01
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

public class JiuJiuMethod {
    public static void method(int a ) {
        int length = a;    //初始化length用于控制九九乘法表行数
        for (int i = 1; i <= length; i++) {   //length用来控制九九乘法表的层数
            for (int j = 1; j <= i; j++) {    //内层循环j控制列第一个数的值
                System.out.print(j + "×" + i + " = " + j * i + "\t");   //j配合i打印输出每单独一个九九乘法表
            }
            System.out.println();   //每执行一次外层循环就换行一次
            String string = String.valueOf("");
        }
    }

    public static void main(String[] args) {
        method(9);

//           int length = 20;	//初始化length用于控制九九乘法表行数
//                for (int i = 1; i <= length; i++) {   //length用来控制九九乘法表的层数
//                    for (int j = 1; j <= i; j++) {    //内层循环j控制列第一个数的值
//                        System.out.print(j + "×" + i + " = " + j * i + "\t");   //j配合i打印输出每单独一个九九乘法表
//                    }
//                    System.out.println();   //每执行一次外层循环就换行一次
//                }
//            }

        /*
         * 1×1 = 1
         * 1×2 = 2	2×2 = 4
         * 1×3 = 3	2×3 = 6	3×3 = 9
         * 1×4 = 4	2×4 = 8	3×4 = 12	4×4 = 16
         * 1×5 = 5	2×5 = 10	3×5 = 15	4×5 = 20	5×5 = 25
         * 1×6 = 6	2×6 = 12	3×6 = 18	4×6 = 24	5×6 = 30	6×6 = 36
         * 1×7 = 7	2×7 = 14	3×7 = 21	4×7 = 28	5×7 = 35	6×7 = 42	7×7 = 49
         * 1×8 = 8	2×8 = 16	3×8 = 24	4×8 = 32	5×8 = 40	6×8 = 48	7×8 = 56	8×8 = 64
         * 1×9 = 9	2×9 = 18	3×9 = 27	4×9 = 36	5×9 = 45	6×9 = 54	7×9 = 63	8×9 = 72	9×9 = 81
         */
//
//        int length = 9;	//初始化length用于控制九九乘法表行数
//        for (int i = 1; i <= 9; i++) {   //length用来控制九九乘法表的层数
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "×" + i + "=" + j * i + "\t");
//            }
//            System.out.println();
//        }
//
//
//        //每个regine（a * b）的 a
//        for (int i = 1; i <= 9; i++) {   //length用来控制九九乘法表的层数
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+"\t");
//            }
//            System.out.println();
//        }

        /*
1
1	2
1	2	3
1	2	3	4
1	2	3	4	5
1	2	3	4	5	6
1	2	3	4	5	6	7
1	2	3	4	5	6	7	8
1	2	3	4	5	6	7	8	9
         */

//        //每个regine（a * b）的 b
//        for (int i = 1; i <= 9; i++) {   //length用来控制九九乘法表的层数
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" "+i+"\t");
//            }
//            System.out.println();
//        }
        /*
 1
 2	 2
 3	 3	 3
 4	 4	 4	 4
 5	 5	 5	 5	 5
 6	 6	 6	 6	 6	 6
 7	 7	 7	 7	 7	 7	 7
 8	 8	 8	 8	 8	 8	 8	 8
 9	 9	 9	 9	 9	 9	 9	 9	 9
         */

//        //每个regine（a * b）的 ab
//        for (int i = 1; i <= 9; i++) {   //length用来控制九九乘法表的层数
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+"\t");
//                System.out.print(" "+i+"\t");
//            }
//            System.out.println();
//        }

        /*
1	 1
1	 2	2	 2
1	 3	2	 3	3	 3
1	 4	2	 4	3	 4	4	 4
1	 5	2	 5	3	 5	4	 5	5	 5
1	 6	2	 6	3	 6	4	 6	5	 6	6	 6
1	 7	2	 7	3	 7	4	 7	5	 7	6	 7	7	 7
1	 8	2	 8	3	 8	4	 8	5	 8	6	 8	7	 8	8	 8
1	 9	2	 9	3	 9	4	 9	5	 9	6	 9	7	 9	8	 9	9	 9
         */

//        //最后再完成
//        for (int i = 1; i <= 9; i++) {   //length用来控制九九乘法表的层数
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "×" + i + "=" + j * i + "\t");
//            }
//            System.out.println();
//        }
    }

}

