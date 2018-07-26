package cn.ximcloud.itsource.day30_test.leveltest.test_9;

import java.util.Scanner;

public class Main {
    static Stu[] Stu = new Stu[100];//定义学生数组，容量为100     //类被加载，静态成员被初始化
    static int number = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {        //JVM执行主方法
        int choice; //申明局部变量

        System.out.println("这是一个学生信息管理系统，最大容量为100，欢迎您对本系统的使用");
        while (true) {      //死循环
            choice = scanner.nextInt();     //流阻塞，得到下一个流的int值
            print();                        //简单的打印
            if (choice == 7) break;     //每次都是死循环，直到等于7直接跳出循环。结束方法体
            switch (choice) {       //开始执行switch循环判断语句
                case 1:
                    add();
                    break;//添加学生信息
                case 2:
                    show();
                    break;//查询学生信息
                case 3:
                    change();
                    break;//修改学生信息
                case 4:
                    delete();
                    break;//删除学生信息
                case 5:
                    paixu();
                    break;//对学生信息排序
                case 6:
                    query();
                    break;//查询学生信息
            }
        }
        System.out.println("感谢您对本系统的使用，欢迎下次继续使用");//打印感谢使用
    }

    static void print() {
        System.out.println("1.信息添加");
        System.out.println("2.信息查看");
        System.out.println("3.信息修改");
        System.out.println("4.信息删除");
        System.out.println("5.信息按成绩从低到高排序");
        System.out.println("6.信息查询");
        System.out.println("7.退出");
        System.out.println("请输入你要进行的操作");
    }

    static void add() {//添加学生信息
        while (true) {
            System.out.println("点击任意键继续添加学生信息，停止添加输入0");
            if (scanner.nextInt() == 0) break;
            System.out.println("请输入该学生的学号，姓名，性别，年龄，成绩");
            Stu[number] = new Stu();
            Stu[number].setStuNum(scanner.next());
            Stu[number].setName(scanner.next());
            Stu[number].setGender(scanner.next());
            Stu[number].setAge(scanner.nextInt());
            Stu[number].setScore(scanner.nextInt());
            number++;
            System.out.println("添加成功");
        }
    }


    static void show() {//展示学生信息
        System.out.println("*******************************************");
        System.out.println(" 学号             姓名                          性别              年龄                成绩");
        for (int i = 0; i < number; i++)
            System.out.println(Stu[i].getStuNum() + "\t" + Stu[i].getName() + "\t" + "\t" + Stu[i].getGender() + "\t" + Stu[i].getAge() + "\t" + Stu[i].getScore());
        System.out.println("*******************************************");
        System.out.println();
    }

    static void paixu() {//对学生信息进行排序
        int j;
        Stu temp = new Stu();
        for (int i = 0; i < number; i++) {
            for (j = i + 1; j < number; j++)
                if (Stu[i].getScore() > Stu[j].getScore()) {
                    temp = Stu[i];
                    Stu[i] = Stu[j];
                    Stu[j] = temp;
                }
        }
        System.out.println("排序完成，选择”学生信息查看“进行查看");
    }


    static void change() {//改变学生信息
        System.out.println("请输入要修改信息的学生学号");
        String Stunumber = scanner.next();
        for (int i = 0; i < number; i++) {
            if (Stunumber.equals(Stu[i].getStuNum())) {
                System.out.println("请输入要修改的学生的信息,学号，姓名，性别，年龄，分数");
                System.out.println("学号:");
                Stu[i].setStuNum(scanner.next());
                System.out.println("姓名:");
                Stu[i].setName(scanner.next());
                System.out.println("性别:");
                Stu[i].setGender(scanner.next());
                System.out.println("年龄:");
                Stu[i].setAge(scanner.nextInt());
                System.out.println("分数:");
                Stu[i].setScore(scanner.nextInt());
                break;
            }
            if (number == i) System.out.println("对不起查无此人");
        }
    }

    static void query() {//查询
        System.out.println("请输入要查询的学生学号");
        String Stunumber = scanner.next();
        int i;
        for (i = 0; i < number; i++) {
            if (Stunumber.equals(Stu[i].getStuNum())) {
                System.out.println("*******************************************");
                System.out.println(" 学号             姓名                          性别              年龄                成绩");
                System.out.println(Stu[i].getStuNum() + "\t" + Stu[i].getName() + "\t" + "\t" + Stu[i].getGender() + "\t" + Stu[i].getAge() + "\t" + Stu[i].getScore());
                System.out.println("*******************************************");
            }
        }
        if (number == i) System.out.println("对不起查无此人");
    }


    static void delete() {//删除学生信息
        System.out.println("请输入要删除信息的学生学号");
        String Stunumber = scanner.next();
        int i;
        for (i = 0; i < number; i++)
            if (Stunumber.equals(Stu[i].getStuNum())) break;
        if (number == i) System.out.println("对不起查无此人");
        for (; i < number - 1; i++)
            Stu[i] = Stu[i + 1];
        number--;
        System.out.println("删除完成");
    }
}