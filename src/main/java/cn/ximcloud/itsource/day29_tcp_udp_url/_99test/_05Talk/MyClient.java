package cn.ximcloud.itsource.day29_tcp_udp_url._99test._05Talk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class MyClient extends JFrame {
    Panel p;
    TextArea ta;
    Button b;
    TextField tf;
    DataInputStream dis;
    DataOutputStream dos;
    Socket socket;

    MyClient() {
        init();
        connect();
        new ClientThread(this).start();
    }

    public static void main(String[] args) {

        new MyClient();

    }

    void connect() {

        try {//localhost
            socket = new Socket("localhost", 2333);
            System.out.println(InetAddress.getLocalHost());
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            //��ȡ������  ��ȡ
            dis = new DataInputStream(is);
            //��ȡ �����  д��
            dos = new DataOutputStream(os);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    void init() {

        this.setTitle("[�����]");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        p = new Panel();
        ta = new TextArea();
        b = new Button("����");
        tf = new TextField();
        this.add(ta, BorderLayout.CENTER);
        this.add(p, BorderLayout.SOUTH);
        p.setLayout(new BorderLayout());
        p.add(tf, BorderLayout.CENTER);
        p.add(b, BorderLayout.EAST);
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String text = tf.getText();
                String title2 = MyClient.this.getTitle();
                String time = new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis());
                String msg = title2 + " " + time + "\r\n\t" + text + "\r\n";
                ta.append(msg);
                try {
                    dos.writeUTF(msg);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }


            }

        });


    }
}

