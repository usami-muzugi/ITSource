package cn.ximcloud.itsource.day15_gui._04CalcDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyActionListener implements ActionListener {
    private static TextField textField;

    private JButton jButton;

    public MyActionListener(TextField textField, JButton jButton) {
        this.jButton = jButton;
        MyActionListener.textField = textField;
    }

    private static float opt(String s) throws Exception {
        if (s == null || "".equals(s.trim())) {
            return 0f;
        }
        int a1 = s.indexOf("+");
        int a2 = s.indexOf("-");
        int a3 = s.indexOf("*");
        int a4 = s.indexOf("/");
        int a5 = s.indexOf("(");
        if (a1 == -1 && a2 == -1 && a3 == -1 && a4 == -1) {
            if (s.trim() == null || "".equals(s.trim())) {
                throw new Exception("operate error");
            }
            return Float.parseFloat(s.trim());
        }

        if (a5 != -1) {
            int a6 = s.indexOf(")");
            if (a6 == -1) {
                throw new Exception("括号不匹配");
            } else {
                float f = opt(s.substring(a5 + 1, a6).trim());
                s = s.replace(s.substring(a5, a6 + 1), String.valueOf(f));
                return opt(s);
            }
        }

        if (a1 != -1) {
            return opt(s.substring(0, a1)) + opt(s.substring(a1 + 1, s.length()));
        }
        if (a2 != -1) {
            return opt(s.substring(0, a2)) - opt(s.substring(a2 + 1, s.length()));
        }
        if (a3 != -1) {
            return opt(s.substring(0, a3)) * opt(s.substring(a3 + 1, s.length()));
        }
        if (a4 != -1) {
            return opt(s.substring(0, a4)) / opt(s.substring(a4 + 1, s.length()));
        }
        return Integer.parseInt(s.trim());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (jButton.getText().equals("=")) {
            textField.setText(getSum());
        } else if (jButton.getText().equals("CE")) {
            ce();
        } else if (jButton.getText().equals("C")) {
            c();
        } else if (jButton.getText().equals("DEL")) {
            del();
        } else if (jButton.getText().equals("±")) {
            if (textField.getText().substring(0, 1).equals("-")) {    //有-号
                textField.setText(textField.getText().substring(1, textField.getText().length()));
            } else {
                textField.setText("-" + textField.getText());
            }
        } else {
            textField.setText(textField.getText() + jButton.getText());
        }
    }

//    private String getSum() {
//        int sum = 0;
//        char[] chars = textField.getText().substring(0,textField.getText().length()-1).toCharArray();
//        /*
//            1+1*1+4/2*2-1+2-1*1/1
//            思路，加减乘除优先级
//
//            1，遍历乘号个数，然后把左边的值进行乘法运算  （BUG1：4/2*2 = 4，但是我的思路就是1了！！）
//               1+1*1+4/2*2-1+2-1*1/1
//                  ^     ^       ^
//             结果: 2+2+4/4-1+2-1/1  有错误
//
//            Re1: 遍历乘除号位置
//               1+1*1+4/2*2-1+2-1*1/1
//                  ^   ^ ^       ^ ^
//               1-1+2 +(1*1)+(4/2*2)+(1*1/1)
//
//
//               1+1*1+4/2 *  2  -  1+2-1*1/1
//               123456789 10 11 12 13
//         */
//        outsidt : for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == '*' || chars[i] == '%') {  //这个符号为高级运算
//                do{
//                    i += 2;
//                }while(chars[i] == '*' || chars[i] == '%');
//
//            }
//        }
//
//        return "";
//    }

    private String getSum() {
        //获取这个string
        String string = textField.getText();
        try {
            string = opt(string) + "";
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (string.substring(string.length() - 1, string.length()).equals("0")) {
            string = string.substring(0, string.length() - 2);
        }
        return string;

    }

    private void ce() {
        textField.setText("");
    }

    private void c() {
        textField.setText("");
    }

    private void del() {
        if (!textField.getText().equals(""))
            textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
    }

}
