package cn.ximcloud.itsource.day29._98teachercode._01TestInteAddress;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;

public class TestInteAddress {
    /*
     * 1.InetAddress类要来表示IP地址，有两个子类
            |---- Inet4Address(IPv4)
            |---- Inet6Address(IPv6)

            2.常用方法（主要了解获得IP地址对象的方法）

            static InetAddress getLocalHost()   返回本地主机
            static InetAddress getByName(String host)   在给定主机名的情况下确定主机的 IP 地址  查找局部网内部存在的一个IP地址，如果没有知道到跑出异常
            static InetAddress getByAddress(byte[] addr)  根据一个ip地址获得一个IP地址对象，没有进行查找的
            boolean isReachable(int timeout)测试是否可以达到该地址 （类似ping）
     * */
    public static void main(String[] args) throws IOException {
        InetAddress localHost = Inet4Address.getLocalHost();
        System.out.println(localHost);

        InetAddress byName = Inet4Address.getByName("PC-201610101424");
        System.out.println(byName);

        InetAddress byAddress = Inet4Address.getByAddress(new byte[]{(byte) 172, 16, 15, (byte) 152});
        InetAddress by = Inet4Address.getByAddress(new byte[]{119, 75, (byte) 217, 109});

        System.out.println(byAddress);
        System.out.println("------>" + by.getHostName());
        System.out.println(by.isReachable(100));


    }

}
