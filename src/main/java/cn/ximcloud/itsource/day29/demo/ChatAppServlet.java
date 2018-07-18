package cn.ximcloud.itsource.day29.demo;

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

public class ChatAppServlet extends JFrame {
    TextArea textArea;
    TextField textField;
    DataInputStream dataInputStream;
    DataOutputStream dataOutputStream;
    int prot;
    String name;
    Socket accept;
    OutputStream outputStream = null;

    public static void main(String[] args) {
        new ChatAppServlet();
    }

    private ChatAppServlet() {

        init();
        connect();
        new ServletThread(this).start();
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
                String string = name + "    " + new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()) + "\r\n    " + fileDialog.getFile() + " 将传出给对方" + "\r\n";
                File file = new File(fileDialog.getDirectory() + fileDialog.getFile());//缓存文件
                textArea.append(string);
                try {
                    ServerSocket serverSocket = new ServerSocket(6666);
                    Socket accept = serverSocket.accept();
                    outputStream = accept.getOutputStream();
                    outputStream.write(new FileInputStream(file).readAllBytes());
                    outputStream.flush();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } finally {
                    try {
                        assert outputStream != null;
                        outputStream.flush();
                        outputStream.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                try {
                    dataOutputStream.writeUTF(string);
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
//                        dataOutputStream.flush();
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
            accept = serverSocket.accept();

            InputStream inputStream = accept.getInputStream();
            dataInputStream = new DataInputStream(inputStream);

            OutputStream outputStream = accept.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
