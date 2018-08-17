package cn.ximcloud.itsource.day1_day47.day27_io_stream_in_and_output_stream._00menu;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-28
 * Time: 16:39
 * ProjectName: ITSource
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
 * //         佛祖保佑        永无BUG      永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class _08MenuDemo {
    private static TextArea textArea;
    private static File file;

    public static void main(String[] args) {
        /*
        菜单
            文件      编辑       格式      查看      帮助

        菜单明细
            新建      时间                          关于宇宙最叼草鸡厉害牛皮地飙水水地记事本作者
            打开
            保存
            另存为
            退出

         */
        //创建顶层窗体
        JFrame jFrame = new JFrame();

        //默认边框不管他

        //创建菜单栏
        MenuBar menuBar = new MenuBar();

        //创建菜单
        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Edit");
        Menu menu3 = new Menu("Format");
        Menu menu4 = new Menu("Look");
        Menu menu5 = new Menu("Help");

        //创建菜单明细
        MenuItem menuItem1 = new MenuItem("New");
        MenuItem menuItem2 = new MenuItem("Open");
        MenuItem menuItem3 = new MenuItem("Save as");
        MenuItem menuItem4 = new MenuItem("Save");
        MenuItem menuItem5 = new MenuItem("Exit");
        MenuItem menuItem6 = new MenuItem("get Time");
        MenuItem menuItem7 = new MenuItem("About me");

        //把菜单明细添加到菜单里面
        menu1.add(menuItem1);
        menu1.add(menuItem2);
        menu1.add(menuItem3);
        menu1.add(menuItem4);
        menu1.add(menuItem5);
        menu2.add(menuItem6);
        menu5.add(menuItem7);

        //把菜单添加到菜单栏里
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);
        menuBar.add(menu5);


        /**
         *   "New" 添加FileInputStream
         */
        //给菜单明细添加监听
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //点击new的操作
                FileDialog fileDialog = new FileDialog(jFrame);
                fileDialog.setTitle("新建一个文档 - 草鸡无敌牛皮李时珍的皮的飙水水至尊宝记事本");
                fileDialog.setVisible(true);
                try {
                    //判定文件目录是否为空，或者文件名是否为空。若为空则直接结束方法
                    if (fileDialog.getDirectory() == null || fileDialog.getFile() == null) return;
                    FileInputStream fileInputStream = new FileInputStream(fileDialog.getDirectory() + fileDialog.getFile());
                    byte[] bytes = new byte[1024];
                    while ((fileInputStream.read(bytes)) != -1) {
                        //采用追加的方式，将文件字节流追加到textArea
                        textArea.append(new String(bytes));
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        /**
         * "Open" 添加FileInputStream
         */
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //点击new的操作
                FileDialog fileDialog = new FileDialog(jFrame);
                fileDialog.setTitle("打开一个文档 - 草鸡无敌牛皮李时珍的皮的飙水水至尊宝记事本");
                fileDialog.setVisible(true);
                try {
                    if (fileDialog.getDirectory() == null || fileDialog.getName() == null) return;
                    textArea.setText("");
                    file = new File(fileDialog.getDirectory() + fileDialog.getFile());//缓存文件
                    FileInputStream fileInputStream = new FileInputStream(file);    //创建流，关联文件
                    byte[] bytes = new byte[1024];
                    while ((fileInputStream.read(bytes)) != -1) {
                        textArea.append(new String(bytes));
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        /**
         *  save as 添加FileInputStream
         */
        menuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //点击new的操作
                FileDialog fileDialog = new FileDialog(jFrame);
                fileDialog.setVisible(true);
                fileDialog.setTitle("另存为一个文档 - 草鸡无敌牛皮李时珍的皮的飙水水至尊宝记事本");
                try {
                    if (fileDialog.getDirectory() == null || fileDialog.getName() == null) return;
                    file = new File(fileDialog.getDirectory() + fileDialog.getName());
                    FileInputStream fileInputStream = new FileInputStream(file);
                    //存储操作
                    byte[] bytes = new byte[1024];
                    while ((fileInputStream.read(bytes)) != -1) {
                        textArea.append(new String(bytes));
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });


        /**
         *  Save  添加FileWriter
         *  如果file为null，表示没有文件在内存，save操作跳转到m3
         */
        menuItem4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileWriter fileWriter = null;
                try {
                    char[] chars = textArea.getText().toCharArray();
                    fileWriter = new FileWriter(file);
                    fileWriter.write(chars);
                    fileWriter.flush();
                } catch (IOException e1) {
                    e1.printStackTrace();
                    try {
                        fileWriter.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });

        /**
         * 添加FileInputStream
         */
        menuItem6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
            }
        });


        /**
         *  添加FileInputStream
         */
        menuItem7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(jFrame);
                dialog.setName("关于作者 - 草鸡无敌牛皮李时珍的皮的飙水水至尊宝记事本");
                dialog.setSize(new Dimension(400, 225));
                dialog.setLocationRelativeTo(null);
                TextArea textArea = new TextArea();
                textArea.setText("草鸡牛逼记事本作者:宇佐美ミズギ");

                textArea.setFont(new Font("黑体", 100, 20));
                dialog.add(textArea);
                jFrame.setVisible(false);
                dialog.setVisible(true);
                dialog.addWindowListener(new WindowListener() {
                    @Override
                    public void windowOpened(WindowEvent e) {

                    }

                    @Override
                    public void windowClosing(WindowEvent e) {
                        jFrame.setVisible(true);
                    }

                    @Override
                    public void windowClosed(WindowEvent e) {

                    }

                    @Override
                    public void windowIconified(WindowEvent e) {

                    }

                    @Override
                    public void windowDeiconified(WindowEvent e) {

                    }

                    @Override
                    public void windowActivated(WindowEvent e) {

                    }

                    @Override
                    public void windowDeactivated(WindowEvent e) {

                    }
                });

            }
        });


        //创建一个TextArea
        textArea = new TextArea();
        textArea.setFont(new Font("黑体", 100, 20));
        //这里写匿名内部类不太好
        MyKeyListener myKeyListener = new MyKeyListener(textArea);
        textArea.addKeyListener(myKeyListener);


        //把菜单栏添加到顶层窗体里
        jFrame.setMenuBar(menuBar);

        //把文本框添加到顶层窗体
        jFrame.add(textArea);

//        WindowFocusListener
//        jFrame.addWindowFocusListener(new W);


        jFrame.setSize(900, 550);
        jFrame.setTitle("草鸡无敌牛皮李时珍的皮的飙水水至尊宝记事本");
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
