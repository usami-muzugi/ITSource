package cn.ximcloud.itsource.day34_anno_and_xml._03create_own_anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by IntelliJ IDEA.
 * Student: wizard
 * Date: 2018-07-27
 * Time: 11:35
 * ProjectName: ITSource.cn.ximcloud.itsource.day34_anno_and_xml.AnnoTest
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

//元注解 设置注解的位置
@Target(ElementType.TYPE)

//元注解 设置注解的生命周期
@Retention(RetentionPolicy.RUNTIME)
public @interface VIP {
    int level();

}
