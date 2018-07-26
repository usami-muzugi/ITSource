package cn.ximcloud.itsource.day18_ecplise_se.leveltest;

/**
 * /**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-03
 * Time: 14:06
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 */

public class _04 {  //没有审题，要求的是求字符串最后一个字符
    /*
    4，String类中有一个已经存在的方法叫toCharArray()；该方法在String对象上面调用，
    用于将一个字符串变成char的数组，方法签名为:char[] toCharArray()；
    请编写一个方法int lastIndexOf(String s,char c)，计算出一个字符在字符串中最后一次出现的位置，
    如果在字符串中没有这个字符，则返回-1；如：字符c在字符串"abcdcef"中最后一次出现的位置是4
     */

    public static void main(String[] args) {
        System.out.println("abcdefg".indexOf('g'));
        System.out.println(_04.lastIndexOf("abcdefg", 'g'));
    }

    /**
     * @param s 一串字符串
     * @param c 要找到的值
     * @return 如果找到了返回这个字符串的char数组的对应的值的索引
     */
    public static int lastIndexOf(String s, char c) {
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == c) return i;
        }
        return -1;
    }
}

