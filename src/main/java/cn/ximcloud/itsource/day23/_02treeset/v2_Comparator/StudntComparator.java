package cn.ximcloud.itsource.day23._02treeset.v2_Comparator;

import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-09
 * Time: 15:20
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class StudntComparator implements Comparator/*<StudntComparator>泛型先放一边*/ {

    /**
     * 比较两个对象的大小【顺序】，如果第一个比第二个大，返回1，第一个等于第二个，返回0，第一个小于第二个，返回-1
     *
     * @param o1 第一个对象
     * @param o2 第二个对象
     * @return 返回一个int类型的结果，1、0、-1
     */
    @Override
    public int compare(Object o1, Object o2) {
        Student stundent1 = (Student) o1, stundent2 = (Student) o2;
        if (stundent1.age > stundent2.age) {
            return 1;
        } else if (stundent1.age < stundent2.age) {
            return -1;
        } else {    //执行到这一步，student1.age == student2.age
            return stundent1.name.compareTo(stundent2.name);    //加权字段相等，判断第二字段
        }
    }
}
