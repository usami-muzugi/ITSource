package cn.ximcloud.itsource.day29._98teachercode._03Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class TestEncoder {
    /*
     * URLEncoder与URLDecoder的使用场景
     *
     * 		static String encode(String s, String enc)
     * %E6%BA%90%E7%A0%81%E6%97%B6%E4%BB%A3
     * 		static String decode(String s, String enc)
                  使用指定的编码机制对 application/x-www-form-urlencoded 字符串解码。
     * */
    public static void main(String[] args) throws UnsupportedEncodingException {
        String encode = URLEncoder.encode("源码时代", "utf-8");
        System.out.println(encode);
        String decode = URLDecoder.decode("%E6%BA%90%E7%A0%81%E6%97%B6%E4%BB%A3", "utf-8");
        System.out.println(decode);
    }

}
