package cn.ximcloud.itsource.day22._07paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-08
 * Time: 15:40
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Paint extends JFrame {
    private int x1,y1,x2,y2;        //一条线段的两个端点的x轴和y轴的值
    private ArrayList arrayList;
    //private Graphics graphics;
    public static void main(String[] args) {
        new Paint();
    }

    public Paint() {
        arrayList = new ArrayList();
        //graphics = getGraphics();
        //System.out.println(graphics);
        this.setSize(370, 390);
        this.setTitle("notepad");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();
                Line line = new Line(x1, y1, x2, y2);
                arrayList.add(line);
                Iterator<Line> iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    Line temp = iterator.next();
                    //Paint.this.getGraphics().drawLine(temp.getX1(),temp.getY1(),temp.getX2(),temp.getY2());   //可以

                    getGraphics().drawLine(temp.getX1(),temp.getY1(),temp.getX2(),temp.getY2());      //可以

                    //graphics.drawLine(temp.getX1(),temp.getY1(),temp.getX2(),temp.getY2());       //不可以
                    /*Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException
                    at cn.ximcloud.itsource.day22._07paint.Paint$1.mouseReleased(Paint.java:59)*/
                }
//                for (Object o : arrayList) {
//                    Line temp = (Line) o;
//                    System.out.println(temp);
//                    Paint.this.getGraphics().drawLine(temp.getX1(),temp.getY1(),temp.getX2(),temp.getY2());
//                    //graphics.drawLine(temp.getX1(),temp.getY1(),temp.getX2(),temp.getY2());
//                    System.out.println(graphics);
//                }


//                Iterator<Line> iterator = arrayList.iterator();
//                while (iterator.hasNext()) {
//                    Line index = iterator.next();
//                    graphics.drawLine(index.getX1(),index.getY1(),index.getX2(),index.getY2());
//                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
    class Line{
        private int x1,y1,x2, y2;

        public Line(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public int getX1() {
            return x1;
        }

        public void setX1(int x1) {
            this.x1 = x1;
        }

        public int getY1() {
            return y1;
        }

        public void setY1(int y1) {
            this.y1 = y1;
        }

        public int getX2() {
            return x2;
        }

        public void setX2(int x2) {
            this.x2 = x2;
        }

        public int getY2() {
            return y2;
        }

        public void setY2(int y2) {
            this.y2 = y2;
        }
    }
}
