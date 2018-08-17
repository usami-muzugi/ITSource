package cn.ximcloud.itsource.day1_day47.day25_collections_2._98review;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Student: Wizard
 * Date: 2018-07-13
 * Time: 00:01
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
 * <p>
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
 * * 1.	有如下一个工具类（），其中有这样的一些工具方法:
 * * a)	判断一个字符串是否为空字符串；
 * * b)	String和Date之间的相互转换；
 * * c)	判断一个字符串是否以指定的后缀结尾；
 * *
 * *
 * * 请完成其功能代码；
 * * 并对每一个功能写上测试代码；
 * * 给这个类 以及类中的每个方法加上文档注释，参考系统类
 **/
public class MyUtils {


    /**
     * 判断一个字符串是否为空字符串
     *
     * @param string 被检测的值
     * @return 返回被检测的值是否未null或者为空字符串
     */
    public static boolean isEnmty(String string) {
        return string == null || string.equals("");
    }

    /**
     * String和Date之间的相互转换，传入一个对象可以是String类型，也可以是Date类型。该两种类型可以通过SimpleDateFormat进行格式化。其他类型抛出一个错误
     *
     * @param object           传入一个对象可以是String类型，也可以是Date类型。
     * @param simpleDateFormat 需要格式化成什么样式的对象
     * @return 返回一个时间对象，或者是一个String对象
     * @throws ParseException 时间格式化错误抛出，或者是传入的Object对象非String 或 Date类型
     */
    public static Object exchange(Object object, SimpleDateFormat simpleDateFormat) throws ParseException {
        if (object instanceof String) return simpleDateFormat.parse((String) object);
        else if (object instanceof Date) return simpleDateFormat.format(object);
        throw new ParseException("Can not Format", 0);
    }

    /**
     * @param inputValue       可变类型
     * @param simpleDateFormat 需要格式化成什么样式的对象
     * @param <T>              任意的一个类型的变量，其实用Object就行了，但是泛型还是做一道
     * @return 返回一个Object类型的对象
     * @throws ParseException 格式化错误会抛出该异常，传入的泛型的对象的类型不属于String或者是Date抛出一个Can not Format的ParseException异常
     */
    public static <T> Object exchangeTest(T inputValue, SimpleDateFormat simpleDateFormat) throws ParseException {
        if (inputValue instanceof String) return simpleDateFormat.parse((String) inputValue);
        else if (inputValue instanceof Date) return simpleDateFormat.format(inputValue);
        throw new ParseException("Can not Format", 0);
    }

    /**
     * 判断一个字符串是否以指定的后缀结尾
     *
     * @param src  被比较的值
     * @param dest 后缀
     * @return 如果后缀是str结尾的，返回为真，否则返回为假
     */
    public static boolean isRight(String src, String dest) {
        return src.endsWith(dest);
    }

    /**
     * 自己写的方法 【我自己写方法有严重的偏差，比如传入的值是111.111.111.111得到的结果是[]的数组，但是能比较@】
     *
     * @param src  被比较的值
     * @param dest 后缀
     * @return 如果构造是src结尾的，返回为真，否者返回为假
     */
    public static boolean isRightMyDemo(String src, String dest) {
        String[] split = src.split("@");
        System.out.println(Arrays.toString(split));
//        return split[0].equals(dest);
        return true;
    }

    @Test
    public void StringTest() {
        System.out.println(isEnmty(null));
    }

    @Test
    public void exchangeTest() throws ParseException {
        System.out.println(exchange(new Date(), new SimpleDateFormat("YYY-MM-dd")));
        System.out.println(exchange("2018-12-21", new SimpleDateFormat("YYY-MM-dd")));
    }

    @Test
    public void isRightTest() {
        System.out.println(isRight("hacg@qq.com", "@qq.com"));
    }

    @Test
    public void isMyMethodRight() {
        System.out.println(isRightMyDemo("hacg.com", ".com"));
    }
}
