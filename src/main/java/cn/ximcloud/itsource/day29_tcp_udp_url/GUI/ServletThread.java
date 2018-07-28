package cn.ximcloud.itsource.day29_tcp_udp_url.GUI;

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
 * ProjectName: ITSource.cn.ximcloud.itsource.day29_tcp_udp_url.GUI
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

public class ServletThread extends Thread {
    ChatAppServlet chatAppServlet;

    public ServletThread(ChatAppServlet chatAppServlet) {
        this.chatAppServlet = chatAppServlet;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String s = chatAppServlet.dataInputStream.readUTF();
                if (s.endsWith("EOF_ourinsama")) {
                    FileDialog fileDialog = new FileDialog(chatAppServlet);
                    fileDialog.setVisible(true);
                    fileDialog.setTitle("收到了一个文件！");
                    if (fileDialog.getDirectory() == null || fileDialog.getName() == null) return;
                    File file = new File(fileDialog.getDirectory() + fileDialog.getFile());//缓存文件
                    try {
                        String string = chatAppServlet.name + "    " + new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()) + "\r\n    " + file.getName() + "  接受完成！" + "\r\n";
                        chatAppServlet.textArea.append(string);
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
                    chatAppServlet.textArea.append(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
