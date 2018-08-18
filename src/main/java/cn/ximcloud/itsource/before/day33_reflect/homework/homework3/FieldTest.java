package cn.ximcloud.itsource.before.day33_reflect.homework.homework3;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-26
 * Time: 17:39
 * ProjectName: ITSource.cn.ximcloud.itsource.before.day33_reflect.homework3
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * // 第一组: 得到当时公共的字段,包括从父类(接口)继承来的公共的字段
 * Field getField(String name)
 * Field[] getFields()
 * <p>
 * //第二组 : 本类(接口)中自己声明的所有字段,和权限无关
 * Field getDeclaredField(String name)
 * Field[] getDeclaredFields()
 **/

public class FieldTest {


    /**
     * 测试得到Student类的所有能够被访问的字段，和对字段进行操作
     *
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    @Test
    public void testGetField() throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student("彭睿", 20);
        System.out.println("打印所有能被访问的字段，包括从父类(或接口)继承而来的公共的字段");
        for (Field field : Student.class.getFields()) {
            System.out.println(field);
        }

        Field field = Student.class.getField("sex");
        Object obj = field.get(student);
        System.out.println((String) obj);
        field.set(student, "基佬");
        System.out.println(student.sex);

    }

    /**
     * 测试得到Student类的所有字段，并对其进行操作
     *
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    @Test
    public void testGetDeclaredField() throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student("彭睿", 20);
        System.out.println("打印所有Student的字段，包括从父类(或接口)继承而来的公共的字段");
        for (Field declaredField : student.getClass().getDeclaredFields()) {
            System.out.println(declaredField);
        }

        Field name = student.getClass().getDeclaredField("NAME");
        name.setAccessible(true);   //需要对字段进行取消检查操作
        Object o = name.get(student);
        System.out.println((String) o);
        //name.set(Student.class,"基佬");
        //Can not set static final java.lang.String field cn.ximcloud.itsource.before.day33_reflect.homework3.Student.NAME to java.lang.String
        //看来是不能对final修饰的字段进行修改的


        Package aPackage = student.getClass().getPackage();
        Annotation[] annotations = student.getClass().getAnnotations();
        String simpleName = student.getClass().getSimpleName();
        student.getClass().getInterfaces();
    }


    /**
     * 测试反射 字段
     * 混合测试
     */
    @Test
    public void feldTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //new Student(); 不能通过new关键字创建对象
        //那就反射
        Class<Student> studentClass = Student.class;    //得到字节码对象

        //字节码对象通过调用方法创建对象 throws NoSuchMethodException
        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor();   //获得构造器
        declaredConstructor.setAccessible(true);    //设置JVM不检查权限
        //调用newInstance()方法创建对象 throws IllegalAccessException, InvocationTargetException, InstantiationException
        Student student = declaredConstructor.newInstance();    //得到了一个Student对象

        //getDeclaredField要用这个getDeclaredField getDeclaredField getDeclaredField
        Field name = studentClass.getDeclaredField("NAME"); //这里这个NAME字段也是不可访问的,那就解除检查
        name.setAccessible(true);
        Object o = name.get(student);
        //测试能不能修改呢
        //name.set(student, "");
        //ava.lang.IllegalAccessException: Can not set static final java.lang.String field cn.ximcloud.itsource.before.day33_reflect.homework3.Student.NAME to java.lang.String
        System.out.println((String) o);
    }
}
