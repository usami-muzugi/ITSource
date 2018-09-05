package cn.ximcloud.itsource.算法学习._01选择排序法;

import org.junit.Test;

import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-09-04
 * Time: 20:56
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
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
 * //         佛祖保佑          永无BUG          永不修改             //
 * ////////////////////////////////////////////////////////////////////
 **/
public class SelectionSort_自定义类 {
    /**
     * 选择排序
     * 思路:
     * 1.确定这个数组的长度。
     * 2.使用for循环进行循环遍历，找出最小的值，然后将其和i进行交换
     */
    <T extends Comparable<T>> void selectionSort(T[] arr) {
        //获取数组的长度
        int length = arr.length;

        //外层for循环控制将要循环的次数
        for (int i = 0; i < length; i++) {
//            拿索引，拿索引！！！！
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
//            for循环结束，将会拿到这次遍历得到的最小值的索引！！
//            进行交换
            if (i != minIndex) {
                T temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    class Student implements Comparable<Student>{
        private String name;
        private int score;

        public Student() {
        }

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            return score > o.score ? score : name.compareTo(o.name);
//            if (score > o.score) {
//                return 1;
//            } else if (score < o.score) {
//                return -1;
//            } else {
//                return 0;
//            }
        }
    }


    @Test
    public void testSelectSort() {
        Student[] students = new Student[]{new Student("time",78),
                new Student("ourinsama",78),new Student("jestom",23),new Student("lu",95)};
        selectionSort(students);
        Stream.of(students).forEach(System.out::println);
    }
}
