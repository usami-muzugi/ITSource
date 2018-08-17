package cn.ximcloud.itsource.day1_day47.day29_tcp_udp_url._98teachercode._05Talk;

import java.io.IOException;

public class ClientThread extends Thread {
    Client client;

    public ClientThread(Client client) {
        this.client = client;
    }

    @Override
    public void run() {//读取流,并展示在ta中
        while (true) {//该线程,不断的读取dis流,有信息就读取出来,并且展示在客户端的文本域
            try {
                String msg = this.client.dis.readUTF();
                this.client.ta.append(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
