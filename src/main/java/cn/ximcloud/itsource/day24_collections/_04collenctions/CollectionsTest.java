package cn.ximcloud.itsource.day24_collections._04collenctions;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-11
 * Time: 18:04
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * <p>
 * Collentions 和Collention 这两个牛头不对马嘴
 * <p>
 * 1.使用Collentions工具类对集合进行批量添加
 * 2.将所有元素从一个列表复制到另一个列表
 * 3.使用默认随机源对指定列表进行置换
 **/

public class CollectionsTest {
    private List<Integer> list1;
    private List<Integer> list2;

    @Before
    public void doBefore() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
    }

    //使用Collections工具类对集合进行批量添加
    @Test
    public void addMethod() {
        //1.传统的添加方法操作过程麻烦
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        //2.使用工具类进行添加 目标集合，源集合
        Collections.copy(list2, list1);
        System.out.println(list2);

//       Collections.copy(new ArrayList<>(), list1);  //报错的标准是源list的size是否大于目标list的size
//        如果直接向一个空的数组空间移动，报错java.lang.IndexOutOfBoundsException: Source does not fit in dest
//        if (srcSize > dest.size())
//            throw new IndexOutOfBoundsException("Source does not fit in dest");
//        因为调用的默认的构造方法是创建了一个空间为0的数组，copy()方法不会考虑目标List的数组的长度，所以会报错
//        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
//        private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    }

    @Test
    //使用默认随机源对指定列表进行置换
    public void exchangeTest() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("中原一点红");
        arrayList.add("饼饼");
        arrayList.add("幺鸡");
        arrayList.add("二荆条");
        arrayList.add("钢丝床");
        arrayList.add("馍馍");
        arrayList.add("眼镜");
        arrayList.add("八万");
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        //Result:[钢丝床, 饼饼, 二荆条, 八万, 中原一点红, 眼镜, 幺鸡, 馍馍]
        //得到的顺序每次都不相同

        //随机数的获取，可以是通过这个nanoTime，nanoTime每次都是不相同的，所以可以通过一定的算法来实现随机数
    }
}
