package cn.ximcloud.itsource.day34_anno_and_xml._02meta_anno;

/**
 * Created by IntelliJ IDEA.
 * User: wizard
 * Date: 2018-07-27
 * Time: 11:18
 * ProjectName: ITSource.cn.ximcloud.itsource.day34_anno_and_xml._01learning_anno
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 认识元注解，并在下一个类种自定义一个注解
 **/

public class MetaAnno {
    /**
     *    元注解是写在注解的头上的一种注解
     * @Target(ElementType.METHOD)      //@Target元注解是声明这个注解的作用范围，是类，接口，还是包名，字段，亦或是方法
     * @Retention(RetentionPolicy.SOURCE)   //@Retention元注解是声明这个注解的声明周期，是在源文件周期还是源文件到字节码文件周期或是源文件到字节码再到运行时的周期(RunTime)
     * public @interface Override {
     *
     * }
     */

    /**
     * 覆写Object toString()方法
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * 查看API可知道 ElementType是一个枚举类，其内部字段。
     *(其他的不做了解)
     *
     * Class, interface (including annotation type), or enum declaration
     *TYPE,         （表示注解的适用范围可以是类，接口[包括注解类型]，亦或是枚举类型）
     *
     *     /** Field declaration (includes enum constants)
     *FIELD,    （表示注解的适用范围可以是字段，包括枚举的字段）
     *
     *     /** Method declaration
     *METHOD,   （表示注解的适用范围可以是方法）
     *
     *     /** Formal parameter declaration
     *PARAMETER,
     *
     *     /** Constructor declaration
     *CONSTRUCTOR,  （表示注解的适用范围可以是构造器）
     *
     *     /** Local variable declaration
     *LOCAL_VARIABLE,   （表示注解的适用范围可以是局部变量）
     *
     *     /** Annotation type declaration
     *ANNOTATION_TYPE,      （表示注解的适用范围可以是注解类型）
     *
     *     /** Package declaration
     *PACKAGE,  （表示注解的适用范围可以是包名）
     */


    /**
     *  查看RetentionPolicy，也是一个枚举类
     *
     *
     *
     *      * Annotations are to be discarded by the compiler.
     *
     *SOURCE,       （表示注解的生命周期仅在源文件的时候）
     *
     *
     *      * Annotations are to be recorded in the class file by the compiler
     *      * but need not be retained by the VM at run time.  This is the default
     *      * behavior.
     *
     *CLASS,        （表示注解的生命周期在源文件和字节码文件的时候）
     *
     *
     *      * Annotations are to be recorded in the class file by the compiler and
     *      * retained by the VM at run time, so they may be read reflectively.
     *      *
     *      * @see java.lang.reflect.AnnotatedElement
     *
     *RUNTIME       （表示注解的生命周期在源文件和字节码文件及运行的时候）
     *
     */


}
