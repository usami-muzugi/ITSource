package cn.ximcloud.itsource.day29_tcp_udp_url._01InetAdress;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-18
 * Time: 11:31
 * ProjectName: ITSource.cn.ximcloud.itsource.day29_tcp_udp_url._01InetAdress
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
 * * 1.InetAddress类要来表示IP地址，有两个子类
 * |---- Inet4Address(IPv4)
 * |---- Inet6Address(IPv6)
 * <p>
 * 2.常用方法（主要了解获得IP地址对象的方法）
 * static InetAddress getLocalHost()   返回本地主机
 * static InetAddress getByName(String host)   在给定主机名的情况下确定主机的 IP 地址  查找局部网内部存在的一个IP地址，如果没有知道到跑出异常
 * static InetAddress getByAddress(byte[] addr)  根据一个ip地址获得一个IP地址对象，没有进行查找的
 * boolean isReachable(int timeout)测试是否可以达到该地址 （类似ping）
 **/

public class InetAddressTest {
    public static void main(String[] args) throws IOException {
        //获取本机IPv4地址
        InetAddress localHost = Inet4Address.getLocalHost();
        //打印IPv4地址
        System.out.println(localHost);

        //通过方法getByName()获取本机主机名
        InetAddress byName = Inet4Address.getByName("wizard");
        System.out.println(byName);

        //获取IP地址
        InetAddress byAddress = Inet4Address.getByAddress(new byte[]{(byte) 172, 16, 15, (byte) 152});
        //获取IP地址2
        InetAddress by = Inet4Address.getByAddress(new byte[]{119, 75, (byte) 217, 109});

        System.out.println(byAddress);
        System.out.println("------>" + by.getHostName());
        System.out.println(by.isReachable(100));
    }
}
