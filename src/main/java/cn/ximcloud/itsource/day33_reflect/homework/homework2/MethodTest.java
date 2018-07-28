package cn.ximcloud.itsource.day33_reflect.homework.homework2;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-26
 * Time: 16:13
 * ProjectName: ITSource.cn.ximcloud.itsource.day33_reflect.homework2
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 通过反射获得一个类中的方法:
 * Class类中有如下的实例方法:
 * <p>
 * // 第一组: 得到当时公共的方法,包括从父类(接口)继承来的公共的方法
 * Method getMethod(String name, Class<?>... parameterTypes)
 * Method[] getMethods()
 * <p>
 * //第二组 : 本类(接口)中自己声明的所有方法,和权限无关
 * Method getDeclaredMethod(String name, Class<?>... parameterTypes)
 * Method[] getDeclaredMethods()
 * <p>
 * 1/ 测试上面方法是否真的能够获得注释描述的那些东西  --  作业自己完成
 * 2/ 测试通过反射获得方法并调用
 * ① 获得类的Class实例
 * ② 获得指定的方法  就是Method对象
 * ③ 通过Method类中的一个方法来执行一个方法
 * <p>
 * Method中的方法:
 * Object invoke(Object obj, Object... args)
 * obj 表示一个实体对象
 * Object... args  调用方法传入的实际参数
 */

public class MethodTest {


    /**
     * 获取一个能访问的类的方法
     * Method getMethod(String name, Class<?>... parameterTypes)
     * Method[] getMethods()
     *
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    @Test
    public void testMethodWithGetMethod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //获取一个类的方法
        Class<Student> studentClass = Student.class;
        Method[] methods = studentClass.getMethods();

        //创建一个学生类
        Student student = Student.class.getConstructor(String.class, Integer.TYPE).newInstance("彭睿", 20);


        System.out.println("打印所有能够访问的方法");
        for (Method method : methods) {
            System.out.println(method);     //把继承的方法都打印出来了
        }
        Method say = studentClass.getMethod("say"); //say 方法是无参非静态方法
        say.invoke(student);   //方法的话，是调用这个invoke()方法 ，方法是对象，参数列表
    }


    /**
     * 获得一个类所有的方法
     * Method getDeclaredMethod(String name, Class<?>... parameterTypes)
     * Method[] getDeclaredMethods()
     *
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    @Test
    public void testMethodWithGetDeclaredMethods() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Student student = new Student("彭睿", 20);
        Method[] declaredMethods = Student.class.getDeclaredMethods();
        System.out.println("打印Student类所有能访问的方法");
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        Method declaredMethod = Student.class.getDeclaredMethod("say", String.class, int.class);
        declaredMethod.setAccessible(true);
        Object invoke = declaredMethod.invoke(student, "13123", 1);//需要传进入一个对象
        System.out.println(invoke); //打印结果为null
    }


    /**
     * 测试一个方法如果是一个静态方法，这个时候是传什么作为参数
     * 可以是这个类的字节码文件，也可以是这个类的一个对象
     *
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    @Test
    public void testAdd() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //如果是一个静态方法呢？
        Student student = new Student("彭睿", 20);
        Method say = student.getClass().getDeclaredMethod("say", String.class);
        say.setAccessible(true);
        say.invoke(Student.class, "");   //这里应该是传入这个类吧... 其实对象是铁定行的，因为设个是类级别的是对所有对象共享的，包括这个类
        //测试，如果是静态方法，就是传入的这个类的字节码文件
        //测试，如果是静态方法，也能传入这个类的对象
        say.invoke(student, "");
    }
}
