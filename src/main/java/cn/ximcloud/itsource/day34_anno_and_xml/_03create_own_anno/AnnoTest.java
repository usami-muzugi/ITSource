package cn.ximcloud.itsource.day34_anno_and_xml._03create_own_anno;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: wizard
 * Date: 2018-07-27
 * Time: 11:32
 * ProjectName: ITSource.cn.ximcloud.itsource.day34_anno_and_xml
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 自定义一个注解
 * 1.需求
 * 实现通过添加一个注解就能判断用户是否是VIP
 **/

public class AnnoTest {
    /**
     * 参考真实场景，VIP10应该享受包括所有的大礼包。
     */
    @Test
    public void testUser() {
        VIP annotation = User.class.getAnnotation(VIP.class);
        System.out.print("送:");
        switch (annotation.level()) {
            case 10:
                System.out.print("显卡");

            case 9:
                System.out.print("\tCPU");

            case 8:
                System.out.print("\t内存");

            case 7:
                System.out.print("\t键盘");

            case 6:
                System.out.print("\t鼠标");

            case 5:
                System.out.print("\t机箱");
            default:
                System.out.print("\t10个Q币");
        }

    }
}
