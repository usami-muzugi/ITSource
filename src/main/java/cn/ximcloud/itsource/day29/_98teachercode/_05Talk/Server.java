package cn.ximcloud.itsource.day29._98teachercode._05Talk;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class Server extends Frame {
    //���´�����һ������Ķ���,�����ֶ�,�ڸö�����,�������Щ�ֶ�
    private static final long serialVersionUID = -5809782578272943999L;
    Panel p;
    TextArea ta;
    Button b;
    TextField tf;

    ServerSocket serverSocket;
    Socket socket;

    DataInputStream dis;//�õ���Ϣ����
    DataOutputStream dos;//������Ϣ����

    public Server() {
        init();
        connect();
        new ServerThread(this).start();
        ;
    }

    public static void main(String[] args) {
        new Server();
    }

    void init() {
        ta = new TextArea();
        p = new Panel();
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
                String til = Server.this.getTitle();
                String time = new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis());
                String text = tf.getText();
                String msg = til + " " + time + "\r\n\t" + text + "\r\n";
                tf.setText("");
                ta.append(msg);
                //������Ϣ
                try {
                    dos.writeUTF(msg);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        this.setTitle("ҫ��[�ṩ�����]");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    void connect() {//��������,�����Ϣ[���������],������Ϣ[��������]
        try {
            serverSocket = new ServerSocket(9999);
            socket = serverSocket.accept();
            //�����Ϣ[���������]
            InputStream is = socket.getInputStream();
            dis = new DataInputStream(is);
            //������Ϣ[��������]
            OutputStream os = socket.getOutputStream();
            dos = new DataOutputStream(os);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
