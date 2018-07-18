package cn.ximcloud.itsource.day29.demo;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-18
 * Time: 16:23
 * ProjectName: ITSource.cn.ximcloud.itsource.day29.demo
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
                if (chatAppClient.dataInputStream.readUTF().endsWith("将传出给对方")) {
                    Socket socket = new Socket();
                    InputStream inputStream = socket.getInputStream();
                    byte[] bytes = inputStream.readAllBytes();
                    //点击new的操作
                    FileDialog fileDialog = new FileDialog(this.chatAppClient);
                    fileDialog.setVisible(true);
                    fileDialog.setTitle("发送文件给人家");
                    if (fileDialog.getDirectory() == null || fileDialog.getName() == null) return;
                    File file = new File(fileDialog.getDirectory() + fileDialog.getFile());//缓存文件
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(bytes);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } else {
                    String s = chatAppClient.dataInputStream.readUTF();
                    chatAppClient.textArea.append(s);
                }
            } catch (IOException e) {
                System.out.println(111);
            }
        }
    }
}
