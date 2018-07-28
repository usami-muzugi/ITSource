package cn.ximcloud.itsource.day34_anno_and_xml._01learning_anno;

/**
 * Created by IntelliJ IDEA.
 * Student: wizard
 * Date: 2018-07-27
 * Time: 11:02
 * ProjectName: ITSource.cn.ximcloud.itsource.day34_anno_and_xml._01learning_anno
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 认识注解
 **/
//也能在类上添加注解，表示这个类已经过时了，不在维护了，在之后的版本更新的时候，可能会对其进行删除。
@Deprecated
public class LearningAnno {
    //Eclipse会提示这个方法过时了
    private static String msg = learn();



    //已经使用过的几个注解

    //覆写toString方法的时候，可以加上@Override判断是否正确覆写
    @Override
    public String toString() {
        return super.toString();
    }

    //抑制错误注解，比如抑制变量未使用等等
    @SuppressWarnings("unused")
    int age;


    //注解可以添加在字段上
    @SuppressWarnings("unused")
    String name;


    //注解也可以添加在方法上
    @SuppressWarnings("unused")
    //在同一个地方也可以添加多个注解
    @Deprecated //这个注解是表示该方法已经过时
    private static String learn() {
        //这个方法已经过时了
        return "这个方法已经过时了";
    }
}
