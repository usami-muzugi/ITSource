package cn.ximcloud.itsource.day6;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-15
 * Time: 10:38
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

public class JiChengHeTest {
    public static void main(String[] args) {
    /*
		1.求1-5的 的阶乘和(1!+2!+3!+4!+5!)
		1*1          + 1
		1*1*2        + 2
		1*1*2*3      + 6
		1*1*2*3*4    + 24
		1*1*2*3*4*5  + 120

	思路:
		1.思考求出某个数的阶乘[for 判断值决定就哪个阶乘]
		2.只要判断值变化,依次求出指定判断值阶乘
		3.外层for循环决定要求那些值的阶乘
		4.内层决定求具体哪个值的阶乘
		5.外层,循环,将每一个值的阶乘累计求和
	*/
        long currentTime = System.currentTimeMillis();
        int sum = 0;//累积每一个阶乘的和
        for (int j = 1; j <= 5; j++) {
            int ji = 1;//累计每一个数的阶乘[ 思考可以不可以把ji放到外面,自己看执行流程 ]
            for (int i = 1; i <= j; i++) {//判断的值,决定了求的是哪个数的阶乘
                ji *= i;
            }
            //System.out.println("ji="+ji);//拿到了指定了值的阶乘
            sum += ji;
        }
        System.out.println(sum);

        System.out.println(System.currentTimeMillis() - currentTime);

        currentTime = System.currentTimeMillis();
        sum = 0;
        //1*1 + 1*2 + 1*2*3 + 1*2*3*4 + 1*2*3*4*5
        for (int i = 1, index = 1; i <= 5; i++) {
            index *= i;        //i!
            sum += index;    //sum += i!
        }
        System.out.println(sum);

        System.out.println(System.currentTimeMillis() - currentTime);


        /*
        累计每一个阶乘
         */

        sum = 1;
        for (int i = 1; i <= 5; i++) {
            sum *= i; //这样就获取到了5的阶乘
        }

        sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum++; //这里就执行了5次加法
        }

        /*
        合并一下就是
         */
        sum = 0;    //用于累积
        int index = 1;  //用于计算每个数的阶乘
        for (int i = 1; i <= 5; i++) {  //执行5次，每次计算一个阶乘，并累积
            index *= i; //计算i的阶乘
            sum += index;   //累计index的值
        }
        System.out.println(sum);    //我的算法只循环了5次，谭老师的循环了5^2次，当求得数大于5之后。我的代码运行1ms，老师的21ms


    }
}
