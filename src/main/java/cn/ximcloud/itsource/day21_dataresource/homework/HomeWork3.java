package cn.ximcloud.itsource.day21_dataresource.homework;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-07
 * Time: 23:56
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
 * <p>
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
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/
public class HomeWork3 {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.add(new StudentList().new Student());
        studentList.add("usamimizugi", 22);
        studentList.add("usamimizugi", 22);
        studentList.add("usamimizugi", 26);
        studentList.add("usamimizugi", 12);
        studentList.add("usamimizugi", 23);
        studentList.add("usamimizugi", 24);
        studentList.add("usamimizugi", 11);
        studentList.add("usamimizugi", 20);
        studentList.add("usamimizugi", 18);

        System.out.println(studentList.getAvengeAge());
        System.out.println(studentList);
    }

}

class StudentList {
    private Student[] students;
    private int sum;

    public StudentList() {
        this(20);
    }

    public StudentList(int length) {
        students = new Student[length];
    }

    public void add(Student student) {
        if (sum == students.length) {
            Student[] temp = new Student[sum + 20];
            System.arraycopy(students, 0, temp, 0, sum);
            students = temp;
        }
        students[sum] = student;
        sum++;
    }

    public void add(String name, int age) {
        if (sum == students.length) {
            Student[] temp = new Student[sum + 20];
            System.arraycopy(students, 0, temp, 0, sum);
            students = temp;
        }
        students[sum] = new Student(name, age);
        sum++;
    }

    public int getAvengeAge() {
        int index = 0, avengeAge = 0;
        for (int i = 0; i < sum; i++) {
            if (students[i].age != 0) {
                avengeAge += students[i].age;
                index++;
            }
        }
        return avengeAge / index;
    }

    @Override
    public String toString() {
        Student[] students = new Student[sum];
        System.arraycopy(this.students, 0, students, 0, sum);
        return Arrays.toString(students);
    }

    class Student {
        private String name;
        private int age;

        public Student() {

        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Student(String name) {
            this.name = name;
        }

        public Student(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
