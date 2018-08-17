package cn.ximcloud.itsource.day1_day47.day33_reflect.homework.homework1;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by IntelliJ IDEA.
 * Student: wizard
 * Date: 2018-07-26
 * Time: 23:04
 * ProjectName: ITSource.cn.ximcloud.itsource.day1_day47.day33_reflect.homework.homework1
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * Class中获得类的构造方法的方法
 * //第一组只能够获得公共的构造方法
 * Constructor<T> getConstructor(Class<?>... parameterTypes) 	// 根据参数获得指定的一个构造方法
 * Constructor<?>[] getConstructors() 	// 获得所有的公共的构造方法
 * <p>
 * //第二组,和访问权限无关
 * Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
 * Constructor<?>[] getDeclaredConstructors()
 * <p>
 * <p>
 * 想干嘛呢?
 * 1 获得一个类中的构造方法(测试)  或者验证类中的默认构造方法
 * 2 通过获得的构造器对象来创建类的对象
 */

public class NewInstance {


    /**
     * Constructor<T> getConstructor(Class<?>... parameterTypes) 	// 根据参数获得指定的一个构造方法
     * Constructor<?>[] getConstructors() 	// 获得所有的公共的构造方法
     *
     * @throws NoSuchMethodException 可能是权限不够导致的
     */
    @Test
    public void newInstanceWithGetConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //Student student = new Student(); //无法使用无参构造方法对象实例化 访问权限private
        //Student stu = new Student("彭睿", 20);    //可使用有参构造方法对象实例化 访问权限 public

        //通过反射来使用无参构造方法对对象实例化
        Class<Student> studentClass = Student.class;    //获取字节码对象
        Constructor<Student> constructor = studentClass.getConstructor(String.class, Integer.TYPE);   //这里不传入任何字节码对象，调用无参构造方法
        constructor.setAccessible(true);    //由于是private所以外部不能访问，需要关闭检查
        Student student = constructor.newInstance("彭睿", 20);    //获取实例
        //打印实例
        System.out.println(student);

        //通过反射来获取所有能访问的构造方法
        Constructor<?>[] constructors = studentClass.getConstructors();
        //打印所有能够访问的构造方法
        for (Constructor<?> constructor1 : constructors) {
            System.out.println(constructor1);
        }
    }


    /**
     * Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)  //获取指定参数列表的构造方法
     * Constructor<?>[] getDeclaredConstructors() //获取所有的包括不能访问到的构造方法
     *
     * @throws NoSuchMethodException 未找到方法，可能出现在参数列表写错了，导致的
     */
    @Test
    public void newInstanceWithGetDeclaredConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Student> studentClass = Student.class;
        Constructor<?>[] declaredConstructors = studentClass.getDeclaredConstructors();
        //打印所有的构造方法
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        //这里就可以调用Student的私有构造方法来创建对象

        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor(String.class, Integer.TYPE);
        //因为是私有的，所以本因该还是无法创建对象的。所以这里应该解除检查
        declaredConstructor.setAccessible(true);    //解除辣
        Student student = declaredConstructor.newInstance("彭睿", 20);
        System.out.println(student);


    }


    /**
     * 学习类对象构造方法私有化，通过反射创建对象
     * 混合测试
     *
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    @Test
    public void newInstanceTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Student> studentClass = Student.class;
        Constructor<Student> constructor = studentClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Student student1 = constructor.newInstance();
        Student student2 = constructor.newInstance();
        Student student3 = constructor.newInstance();
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        Constructor<Student> constructor1 = studentClass.getConstructor(String.class, Integer.TYPE);
        Student student = constructor1.newInstance("1", 2);
        System.out.println(student);


        //换了保安了,每一个获得的构造器，都是一个不同的对象。
//        Constructor<Student> constructor2 = studentClass.getDeclaredConstructor();
//        Student student4 = constructor2.newInstance();
//        System.out.println(student4);
    }
}
