package cn.ximcloud.itsource.day33_reflect._99teachercode.method;

import java.lang.reflect.Method;

public class MethodTest {
    /*
     * 通过反射获得一个类中的方法:
     * 		Class类中有如下的实例方法:
     *
     * 			// 第一组: 得到当时公共的方法,包括从父类(接口)继承来的公共的方法
     * 			Method getMethod(String name, Class<?>... parameterTypes)
                 Method[] getMethods()

                 //第二组 : 本类(接口)中自己声明的所有方法,和权限无关
                 Method getDeclaredMethod(String name, Class<?>... parameterTypes)
                 Method[] getDeclaredMethods()

             1/ 测试上面方法是否真的能够获得注释描述的那些东西  --  作业自己完成
             2/ 测试通过反射获得方法并调用
                 ① 获得类的Class实例
                 ② 获得指定的方法  就是Method对象
                 ③ 通过Method类中的一个方法来执行一个方法

        Method中的方法:
            Object invoke(Object obj, Object... args)
                obj 表示一个实体对象
                Object... args  调用方法传入的实际参数

     */
    @org.junit.Test
    public void testGetMethod() throws Exception {
        Student stu = new Student();
        Class<Student> clz = Student.class;
        Method method = clz.getMethod("setName", String.class);

        // 执行上面的方法
        method.invoke(stu, "小黑");
        System.out.println(stu);


        //----传统方式调用方法--------------------------------
//		Student s = new Student();
//		s.setName("小明");  // 表示给s指向的对象的name赋值
//		System.out.println(s);
    }
}
