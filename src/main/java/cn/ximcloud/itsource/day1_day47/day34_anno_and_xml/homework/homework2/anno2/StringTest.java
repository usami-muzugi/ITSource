package cn.ximcloud.itsource.day1_day47.day34_anno_and_xml.homework.homework2.anno2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-28
 * Time: 23:18
 * ProjectName: ITSource
 * To change this template use File | Settings | File Templates.
 * ////////////////////////////////////////////////////////////////////
 **/
public class StringTest {
    @Test
    public void testStringFunc1() {
        String string = "1123131242 3";
        Assert.assertEquals(false, new StringUtil().isNull(string));
    }

    @Test
    public void testStringFunc2() {
        String string = "1123131242 3";
        Assert.assertEquals(false, new StringUtil().func(string));
    }
}
