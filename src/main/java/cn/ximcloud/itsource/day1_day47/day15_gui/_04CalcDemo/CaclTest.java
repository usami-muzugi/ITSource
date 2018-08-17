package cn.ximcloud.itsource.day1_day47.day15_gui._04CalcDemo;

import javax.swing.*;
import java.awt.*;

public class CaclTest {
    public static void main(String[] args) {

        //窗体
        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);

        //文本框
        TextField textField = new TextField();
        textField.setBounds(0, 0, 380, 100);
        textField.setFont(new Font("黑体", 12, 60));


        //按钮
        JButton[] jButtons = new JButton[20];   //①一共有20个按钮
        String[] strings = new String[]{"±", "0", ".", "=", "1", "2", "3", "+", "4", "5", "6", "-",
                "7", "8", "9", "×", "CE", "C", "DEL", "÷"};    //①每个按钮对应的text
        int x = 30; //②初始化位置X
        int y = 350;    //②初始化位置Y
        for (int i = 0; i < jButtons.length; i++) {  //③要给每一个按钮都设置位置，所以需要循环20次
            if (i % 4 == 0) {   //每行4个元素，判断为false就需要换行了
                x = 10;
                y -= 45;
                (jButtons[i] = new JButton(strings[i])).setBounds(x, y, 80, 40);
            } else {    //换行
                x += 85;
                (jButtons[i] = new JButton(strings[i])).setBounds(x, y, 80, 40);
            }
            jButtons[i].addActionListener(new MyActionListener(textField, jButtons[i]));
            jFrame.add(jButtons[i]);
            jButtons[i].setBackground(Color.LIGHT_GRAY);
        }

        //添加
        jFrame.add(textField);
        jFrame.setSize(370, 390);
        jFrame.setTitle("计算器");
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
