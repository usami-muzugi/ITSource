package cn.ximcloud.itsource.before.day30_test.leveltest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-19
 * Time: 14:57
 * ProjectName: ITSource.cn.ximcloud.itsource.before.day30_test.leveltest
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 8.	写一个有图形界面的时钟，效果如下：
 * 要求：
 * ①、一启动程序显示上面的一种格式（默认格式）；
 * ②、在上面的输入框中填写了格式后，点击确定，下面的显示格式自动变化
 * ③、界面上显示的时间是会自动动的；
 * ④、显示时间的字体比界面上其它字体都要大，并且使用红色显示
 * ⑤、如果用户输入的格式不符合要求，弹出一个提示框提示格式错误并显示一个正确的格式（可以使用正则表达式），弹出的提示框5秒后自动消失
 **/

public class Test_8 extends JFrame {
    JButton jButton;
    String operation;

    private Test_8() {
        init();
        new ClickThread(this).start();
    }

    public static void main(String[] args) {
        new Test_8();

    }

    void init() {
        jButton = new JButton();
        jButton.setFont(new Font("黑体", Font.BOLD, 50));

        setTitle("电子时钟");

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        TextField textField = new TextField();
        textField.setText("YY:mm:dd HH:mm:ss");
        operation = textField.getText();

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 10) {

                    return;
                }
                operation = textField.getText();
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        jPanel.add(textField, BorderLayout.CENTER);
        JButton jButton1 = new JButton("确定");

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().matches("")) {
                    try {
                        func();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    return;
                }
                operation = textField.getText();
            }
        });
        JButton jButton2 = new JButton("显示格式:");

        jPanel.add(jButton2, BorderLayout.WEST);
        jPanel.add(jButton1, BorderLayout.EAST);
        add(jPanel, BorderLayout.NORTH);
        add(jButton, BorderLayout.CENTER);
        setSize(800, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void func() throws InterruptedException {
        JDialog dialog = new JDialog(this);
        JOptionPane.showMessageDialog(this, " Warring - 格式错误 报错报错");
        Thread.sleep(5000);
    }
}

class ClickThread extends Thread {
    Test_8 test_8;

    public ClickThread(Test_8 test_8) {
        this.test_8 = test_8;
    }

    @Override
    public void run() {
        while (true) {
            test_8.jButton.setText(new SimpleDateFormat(test_8.operation).format(System.currentTimeMillis()));
        }
    }
}

