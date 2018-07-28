package cn.ximcloud.itsource.day34_anno_and_xml._98teacher_code._02cn.itsource.anno.diy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface VIP {
    String[] value();

    int level();
}
