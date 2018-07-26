package cn.ximcloud.itsource.day33_reflect._99teachercode.field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest {
	/*
	 * 通过反射获得一个类中的字段:
	 * 		Class类中有如下的实例方法:
	 * 
	 * 			// 第一组: 得到当时公共的字段,包括从父类(接口)继承来的公共的字段
	 * 			Field getField(String name) 
 				Field[] getFields() 
 
 				//第二组 : 本类(接口)中自己声明的所有字段,和权限无关
 				Field getDeclaredField(String name) 
 				Field[] getDeclaredFields() 
 				
 			1/ 测试上面方法是否真的能够获得注释描述的那些东西  --  作业自己完成
 			2/ 测试通过反射获得字段并操作(获得值,设置值)
 				① 获得类的Class实例
 				② 获得指定的字段  就是Field对象
 				③ 通过Field类中的一个方法来执行操作(获得值,设置值)
			
 		创建学生对象并给内部的私有的字段赋值
	 */
	@org.junit.Test
	public void testGetField() throws Exception {
		Student s = new Student();
		
		Class<Student> clz = Student.class;
		Field field = clz.getDeclaredField("name");
		// 设置让java默认访问权限检查失效
		field.setAccessible(true);
//		System.out.println(field);
		
		//给字段赋值--> 找Field中的赋值的方法
		field.set(s, "小丽");
		System.out.println(s);
		
		System.out.println(field.get(s));
		
		System.out.println(clz.getName());
		System.out.println(clz.getSimpleName());
		
	}
	
	/*
	 * 获得Studnet中的一个字段的修饰符
	 * 		1 获得Student对应的Class实例
	 * 		2 获得Student中的指定字段
	 * 		3 获得该字段的修饰符 --> 调用Field中的一个方法
	 * 
	 *  int getModifiers() 以整数形式返回由此 Field 对象表示的字段的 Java 语言修饰符。 
	 */
	@org.junit.Test
	public void testGetMod() throws Exception {
		Class<Student> clz = Student.class;
		Field field = clz.getField("SIZE");
		System.out.println(field);
		int i = field.getModifiers();
		System.out.println(i);
		// 解析上面的int值
		System.out.println(Modifier.toString(i));
	}
}
