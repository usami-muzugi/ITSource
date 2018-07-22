package cn.ximcloud.itsource.day29._99test._05Talk;

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
