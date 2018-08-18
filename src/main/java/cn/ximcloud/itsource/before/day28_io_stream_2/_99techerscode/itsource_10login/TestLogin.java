package cn.ximcloud.itsource.before.day28_io_stream_2._99techerscode.itsource_10login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestLogin {

    public static void main(String[] args) {
        Frame jFrame = new Frame("������");
        jFrame.setLayout(null);

        TextField tf = new TextField();
        Button jb = new Button("ע��");

        tf.setBounds(100, 100, 150, 50);
        jb.setBounds(300, 380, 80, 50);

        Label lable = new Label();

        jFrame.add(tf);
        jFrame.add(jb);
        jFrame.add(lable);

        jb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String text = tf.getText();
                String re = "1[3578][0-9]{9}";
                if (text.matches(re)) {
                    lable.setBounds(260, 100, 150, 50);
                    lable.setText("��ϲ��ע��ɹ�");
                    lable.setVisible(true);
                } else {
                    lable.setBounds(260, 200, 150, 50);
                    lable.setText("�������ù�������");
                    lable.setVisible(true);
                    tf.setText("");
                }

            }
        });

        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }

}
