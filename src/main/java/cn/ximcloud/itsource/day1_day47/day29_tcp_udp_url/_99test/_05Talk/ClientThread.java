package cn.ximcloud.itsource.day1_day47.day29_tcp_udp_url._99test._05Talk;

import java.io.IOException;

public class ClientThread extends Thread {
    MyClient myClient;

    public ClientThread(MyClient myClient) {
        this.myClient = myClient;
    }

    @Override
    public void run() {
        while (true) {

            try {
                String msg = this.myClient.dis.readUTF();
                this.myClient.ta.append(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
