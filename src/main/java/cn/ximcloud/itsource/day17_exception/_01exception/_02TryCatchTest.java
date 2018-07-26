package cn.ximcloud.itsource.day17_exception._01exception;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-01
 * Time: 16:17
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 **/


public class _02TryCatchTest {
    public static void main(String[] args) {
        System.out.println(test());

    }

    private static int test() {

        /*
            try...catch测试:
            try内的语句包含可能会出现异常的语句，
            当try内语句块有异常发生时，就会被catch方法捕获，执行相对应的cathch语句块，try结构体中，异常发生后
            的代码不会被执行到。


             更多看 _05finally
         */
        int i = 1;//声明并初始化一个变量i JAVA10新特性，弱类型变量
        try {
            i = 3;
            Integer.valueOf("");
            i = 5;
            return i;
        } catch (NumberFormatException e) {
            i = 3;
            return i;
        } finally {
            i = 4;
            //return i;
        }

        /*

try{
//可能会出现异常的代码段；
}catch(异常类型1 变量名){ //处理指定类型的异常
//对该类型异常的处理代码段；
e.printStackTrace();
}catch(){
}[finally{
//无论是否发生异常都要执行的代码段；
//经常用来清理资源

         */
    }
}
