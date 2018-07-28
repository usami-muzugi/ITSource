package cn.ximcloud.itsource.day33_reflect._99teachercode.constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class ConstructorTest {
    /*
     * Class中获得类的构造方法的方法
     * 		//第一组只能够获得公共的构造方法
     * 		Constructor<T> getConstructor(Class<?>... parameterTypes) 	// 根据参数获得指定的一个构造方法
             Constructor<?>[] getConstructors() 	// 获得所有的公共的构造方法

             //第二组,和访问权限无关
             Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
             Constructor<?>[] getDeclaredConstructors()


         想干嘛呢?
             1 获得一个类中的构造方法(测试)  或者验证类中的默认构造方法
             2 通过获得的构造器对象来创建类的对象
     */
    @Test
    public void testGetConstructor() throws Exception {
//		Class<Student> clz = (Class<Student>) Class.forName("cn.itsource.javaseplus.Student");

        Class<Student> clz = Student.class;
//		Constructor[] constructors = clz.getDeclaredConstructors();
//		for (Constructor c : constructors) {
//			System.out.println(c);
//		}

        // 获得指定的构造方法
//		Constructor<Student> con = clz.getConstructor(String.class,int.class);
        Constructor<Student> con = clz.getDeclaredConstructor(String.class, int.class);
        System.out.println(con);
    }


    /*
     *  创建对象的方式:
     *  	1 工厂
     *  	2 直接new
     *  	3 通过反射
     *  		①  Class中提供了一个方法
     *  			T newInstance()  要求类必须有无参的有权限访问的构造方法

     *  		②  通过构造器对象Constructor的方法来创建对象
     *
     */
    @Test
    public void testNewInstance() throws Exception {
//		Class<Student> clz = Student.class;
//		Student stu1 = clz.newInstance();
//		System.out.println(stu1);

//		Student s = new Student("sdf",10);


//		通过构造器对象Constructor的方法来创建对象
        //1 获得Student对应的Class实例
        Class<Student> clz = Student.class;
        //2 获得指定的构造方法
        Constructor<Student> con = clz.getDeclaredConstructor(String.class, int.class);
        //让访问检查失效
        con.setAccessible(true);
        System.out.println(con);
        //3 调用构造方法对象Constructor中的方法来创建对象
        Student stu1 = con.newInstance("小强", 19);
        System.out.println(stu1);

//		Student s = new Student("sdf",10);

        Constructor<Student> con2 = clz.getDeclaredConstructor(String.class, int.class);
        Student student = con2.newInstance("小王", 20);
    }

}
