//package cn.ximcloud.itsource.day15_gui._06keyevent;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//
///**
// * Created by IntelliJ IDEA.
// * User: wzard
// * Date: 2018-06-28
// * Time: 15:34
// * ProjectName: ITSource
// * To change this template use File | Settings | Editor | File and Code Templates.
// * ////////////////////////////////////////////////////////////////////
// * //                          _ooOoo_                               //
// * //                         o8888888o                              //
// * //                         88" . "88                              //
// * //                         (| ^_^ |)                              //
// * //                         O\  =  /O                              //
// * //                      ____/`---'\____                           //
// * //                    .'  \\|     |//  `.                         //
// * //                   /  \\|||  :  |||//  \                        //
// * //                  /  _||||| -:- |||||-  \                       //
// * //                  |   | \\\  -  /// |   |                       //
// * //                  | \_|  ''\---/''  |   |                       //
// * //                  \  .-\__  `-`  ___/-. /                       //
// * //                ___`. .'  /--.--\  `. . ___                     //
// * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
// * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
// * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
// * //      ========`-.____`-.___\_____/___.-`____.-'========         //
// * //                           `=---='                              //
// * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
// * //         佛祖保佑        永无BUG      永不修改                  //
// * ////////////////////////////////////////////////////////////////////
// **/
//
//public class _06KeyEvent {
//    public static void main(String[] args) {
//
//        //声明并初始化窗体对象
//        JFrame jFrame = new JFrame();
//        //设置窗体对象布局为null，取消窗体默认的边框布局
//        jFrame.setLayout(null);
//
//        //添加一个JButton对象
//        JButton jButton = new JButton();
//        //设置该对象的文本为刘耀文
//        jButton.setText("刘耀文");
//        //添加一个JButton对象
//        JButton jButton1 = new JButton();
//        jButton1.setText("文东川");
//
//        //设置按钮颜色方法
//        jButton1.setBackground(Color.RED);
//        jButton.setBackground(Color.CYAN);
//
//        //设置按钮位置和大小方法
//        jButton1.setBounds(350, 350, 150, 150);
//        jButton.setBounds(150, 150, 150, 150);
//
//        /*
//            内部类之 匿内部类
//            1.一定要传入KeyListener实体类的对象
//            2.new KeyListener() {  }  //其实本处存在对于KeyListener接口的实现类的对象
//            3.写在方法里面的类，使用方法 new关键字，实际是new的时候得到的对象
//            4.类看不见，但是存在，该类没有名字【又存在一个类的内部，叫做匿名内部类】
//         */
//        jButton.addKeyListener(new KeyListener() {  //方法内部类
//            @Override
//            public void keyTyped(KeyEvent e) {
//
//            }
//            @Override
//            public void keyPressed(KeyEvent e) {
//                System.out.print(e.getKeyChar()+" ");
//                if (String.valueOf(e.getKeyChar()).toUpperCase().equals("W")) {
//                    jButton.setBounds(jButton.getX(),jButton.getY()-5,150,150);
//                } else if (String.valueOf(e.getKeyChar()).toUpperCase().equals("S")) {
//                    jButton.setBounds(jButton.getX(),jButton.getY()+5,150,150);
//                } else if (String.valueOf(e.getKeyChar()).toUpperCase().equals("A")) {
//                    jButton.setBounds(jButton.getX()-5,jButton.getY(),150,150);
//                } else if (String.valueOf(e.getKeyChar()).toUpperCase().equals("D")) {
//                    jButton.setBounds(jButton.getX()+5,jButton.getY(),150,150);
//                }
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//
//            }
//        });
//
//        //匿名内部类2可以同时加入不同的事件监听
//        jButton.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                jButton.setBackground(Color.GREEN);
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                jButton.setBackground(Color.RED);
//            }
//        });
//
//        //向窗体添加按钮
//        jFrame.add(jButton1);
//        jFrame.add(jButton);
//
//        //设置窗体大小
//        jFrame.setSize(500, 500);
//
//        //设置窗体名字
//        jFrame.setTitle("刘耀文");
//
//        //设置窗体初始化位置为null，居中
//        jFrame.setLocationRelativeTo(null);
//
//        //设置窗体标准关闭操作为退出就关闭
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //设置窗体可显示为true
//        jFrame.setVisible(true);
//    }
//}
