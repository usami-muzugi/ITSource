package cn.ximcloud.itsource.day25._01;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-12
 * Time: 14:10
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 1.	有如下一个工具类（），其中有这样的一些工具方法:
 * a)	判断一个字符串是否为空字符串；
 * b)	String和Date之间的相互转换；
 * c)	判断一个字符串是否以指定的后缀结尾；
 *
 *
 * 请完成其功能代码；
 * 并对每一个功能写上测试代码；
 * 给这个类 以及类中的每个方法加上文档注释，参考系统类
 **/

public class Tools {
    private static final String STRING = "";
    private Tools() {
    }

    /**
     *  判断一个字符串是否为空字符串；
     * @param string stirng
     * @return true false
     */
    public boolean isString(String string) {
        return string == null || string.equals(STRING);
    }


    /**
     *  String和Date之间的相互转换；
     * @param date 被转换类型Date
     * @return  返回值类型String
     */
    public static String getDate(Date date) {
        return new SimpleDateFormat().format(date);
    }

    /**
     *  String和Date之间的相互转换；
     * @param string 被转换的类型String
     * @return  返回值类型Date
     */
    public static Date getDate(String string) throws ParseException {
        return new SimpleDateFormat().parse(string);
    }


    /**
     * 判断一个字符串是否以指定的后缀结尾
     * @param string    被判断的字符串
     * @param str       比较的字符串
     * @return          返回比较结果
     */
    public static boolean isComp(String string, String str) {
        String[] temp = string.split(".");
        return temp[temp.length - 1].equals(str);
    }

    public static void main(String[] args) {
        System.out.println(Tools.getDate(new Date()));
    }

}
