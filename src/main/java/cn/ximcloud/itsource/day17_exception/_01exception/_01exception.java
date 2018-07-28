package cn.ximcloud.itsource.day17_exception._01exception;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-01
 * Time: 16:17
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 **/

public class _01exception {
    public static void main(String[] args) {
        //ArithmeticException 除数不能为零，运行时异常，当除数为0的时候，会发生这个异常
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at cn.ximcloud.itsource.day17_exception._01exception._01exception.main(_01exception.java:36)
         */
        //System.out.println(1 / 0);

        //System.out.println("Hello   ");

        //数组下标越界异常，运行时异常，当获取的元素是，索引小于0或者大于等于了数组的长度。就会导致问题
        /*
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
	at cn.ximcloud.itsource.day17_exception._01exception._01exception.main(_01exception.java:45)
         */
//        var arr = new int[]{12};
//        arr[arr.length] = 100;

        //空指针异常，运行时异常，当执行一个空的对象的方法或者调用其字段的时候，会导致该异常
        /*
        Exception in thread "main" java.lang.NullPointerException
	at cn.ximcloud.itsource.day17_exception._01exception._01exception.main(_01exception.java:53)
         */
//        int[] array = null;
//        System.out.println(array.length);

        //数字格式化异常，运行时异常，当一个字符串的不能表示成int类型的时候，就会导致该异常
        /*
        Exception in thread "main" java.lang.NumberFormatException: For input string: "qq"
         */
//        var integer = Integer.valueOf("qq");

        Integer integer = Integer.valueOf("1");
        int i = integer;//自动拆箱
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss E");
        simpleDateFormat.format(date);
        System.out.println(date);

    }

}
