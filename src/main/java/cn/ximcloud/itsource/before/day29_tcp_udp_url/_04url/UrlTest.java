package cn.ximcloud.itsource.before.day29_tcp_udp_url._04url;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-19
 * Time: 09:03
 * ProjectName: ITSource.cn.ximcloud.itsource.before.day29_tcp_udp_url._04url
 * To change this template use File | Settings | Editor | File and Code Templates.
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
 * URL测试
 **/

public class UrlTest {
    public static void main(String[] args) throws UnsupportedEncodingException {

        //String的编码和解码可以使用 URLEncoder.encode() URLDecoder.decode() 对字符串可以按某一种编码格式进行编码和解码
        //编码方法
        String encode = URLEncoder.encode("源码时代", "utf-8");
        System.out.println(encode);

        //解码方法
        String decode = URLDecoder.decode("%E6%BA%90%E7%A0%81%E6%97%B6%E4%BB%A3", "utf-8");
        System.out.println(decode);
    }
}
