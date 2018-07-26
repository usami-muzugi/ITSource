package cn.ximcloud.itsource.day29_tcp_udp_url._98teachercode._02URL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class TestURL {
    /*
     * URL(String protocol, String host, int port, String file)
     * http://127.0.0.1:8080/docs/setup.html
     * https://zhidao.baidu.com/question/514272331.html
     * URL(String protocol, String host, String file)
          根据指定的 protocol 名称、host 名称和 file 名称创建 URL。
     * */
    public static void main(String[] args) throws IOException {
        URL url = new URL("http", "localhost", 8080, "/docs/setup.html");
        InputStream is = url.openStream();
        FileOutputStream fos = new FileOutputStream("H:/b/tttt.html");
        byte[] b = new byte[1024];
        int len;
        while ((len = is.read(b)) != -1) {
            fos.write(b, 0, len);
        }

        URL ur = new URL("https", "zhidao.baidu.com", "/question/514272331.html");
        InputStream openStream = ur.openStream();
        FileOutputStream foss = new FileOutputStream("H:/b/yyyyy.html");
        byte[] bb = new byte[1024];
        int lenn;
        while ((lenn = openStream.read(bb)) != -1) {
            foss.write(bb, 0, lenn);
        }
    }

}
