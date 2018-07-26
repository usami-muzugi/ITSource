package cn.ximcloud.itsource.day29_tcp_udp_url.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-18
 * Time: 11:56
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

public class ChatAppServlet extends JFrame {
    TextArea textArea;
    TextField textField;
    DataInputStream dataInputStream;
    DataOutputStream dataOutputStream;
    int prot;
    String name;

    private ChatAppServlet() {

        init();
        connect();
        new ServletThread(this).start();
    }

    public static void main(String[] args) {
        new ChatAppServlet();
    }

    void init() {
        MenuBar menuBar = new MenuBar();
        Menu menu1 = new Menu("File");
        MenuItem menuItem1 = new MenuItem("Upload");
        menu1.add(menuItem1);
        menuBar.add(menu1);
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Send");
        textArea = new TextArea();
        textField = new TextField();
//        textField.setBounds(0,0,100,100);
        jPanel.setLayout(new BorderLayout());
        jPanel.add(textField, BorderLayout.CENTER);
        jPanel.add(jButton, BorderLayout.EAST);

        //把菜单栏添加到顶层窗体里
        setMenuBar(menuBar);


        add(textArea, BorderLayout.CENTER);
        add(jPanel, BorderLayout.SOUTH);

        name = JOptionPane.showInputDialog("输入服务端用户名");
        prot = Integer.parseInt(JOptionPane.showInputDialog("输入端口号"));


        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //点击new的操作
                FileDialog fileDialog = new FileDialog(ChatAppServlet.this);
                fileDialog.setVisible(true);
                fileDialog.setTitle("发送文件给人家");
                if (fileDialog.getDirectory() == null || fileDialog.getName() == null) return;
                File file = new File(fileDialog.getDirectory() + fileDialog.getFile());//缓存文件
                try {
                    String string = name + "    " + new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()) + "\r\n    " + file.getName() + "发送完成！" + "\r\n";
                    textArea.append(string);
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedInputStream = new BufferedReader(fileReader);
                    String str;
                    StringBuffer stringBuffer = new StringBuffer();
                    while ((str = bufferedInputStream.readLine()) != null) {
                        stringBuffer.append(str);
                    }
                    dataOutputStream.writeUTF(stringBuffer.toString() + "EOF_ourinsama");
                    dataOutputStream.flush();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });


        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String string = name + "    " + new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()) + "\r\n    " + textField.getText() + "\r\n";
                textArea.append(string);
                try {
                    dataOutputStream.writeUTF(string);
                    dataOutputStream.flush();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                textField.setText("");
            }
        });

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 10) {
                    String string = name + "    " + new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()) + "\r\n    " + textField.getText() + "\r\n";
                    textArea.append(string);
                    try {
                        dataOutputStream.writeUTF(string);
                        dataOutputStream.flush();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    textField.setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        setTitle("Server  [服务端]");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void connect() {
        try {
            ServerSocket serverSocket = new ServerSocket(prot);
            Socket accept = serverSocket.accept();

            InputStream inputStream = accept.getInputStream();
            dataInputStream = new DataInputStream(inputStream);

            OutputStream outputStream = accept.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
