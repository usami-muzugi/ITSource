package cn.ximcloud.itsource.day34_anno_and_xml.homework.homework2.anno2;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-28
 * Time: 23:13
 * ProjectName: ITSource
 * To change this template use File | Settings | File Templates.
 * ////////////////////////////////////////////////////////////////////
 **/
public interface IStringUtil {
    /**
     * 接收一个String参数，如果参数是null,则返回true,否则返回false
     *
     * @param string 参数
     * @return 如果参数是null, 则返回true, 否则返回false
     */
    boolean isNull(String string);

    /**
     * 接收一个String参数，(参数是null,参数去掉前后空格是空字符串）
     *
     * @param string 参数
     * @return 满足括号里任何一个条件则返回true, 否则返回false
     */
    boolean func(String string);

}
