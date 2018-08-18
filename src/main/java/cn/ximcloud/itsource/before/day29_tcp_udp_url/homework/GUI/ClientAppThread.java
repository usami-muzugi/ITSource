package cn.ximcloud.itsource.before.day29_tcp_udp_url.homework.GUI;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-18
 * Time: 16:23
 * ProjectName: ITSource.cn.ximcloud.itsource.before.day29_tcp_udp_url.GUI
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
 **/

public class ClientAppThread extends Thread {
    ChatAppClient chatAppClient;

    public ClientAppThread(ChatAppClient chatAppClient) {
        this.chatAppClient = chatAppClient;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String s = chatAppClient.dataInputStream.readUTF();
                if (s.endsWith("EOF_ourinsama")) {
                    FileDialog fileDialog = new FileDialog(chatAppClient);
                    fileDialog.setVisible(true);
                    fileDialog.setTitle("收到了一个文件！");
                    if (fileDialog.getDirectory() == null || fileDialog.getName() == null) return;
                    File file = new File(fileDialog.getDirectory() + fileDialog.getFile());//缓存文件
                    try {
                        String string = chatAppClient.name + "    " + new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()) + "\r\n    " + file.getName() + "  接受完成！" + "\r\n";
                        chatAppClient.textArea.append(string);
                        s = s.substring(0, s.length() - 13);
                        System.out.println();
                        FileWriter fileWriter = new FileWriter(file);
                        fileWriter.write(s);
                        fileWriter.flush();
                        fileWriter.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                } else {
                    chatAppClient.textArea.append(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
