package cn.ximcloud.itsource.day33._99teachercode.javaseplus;

import java.util.List;

import org.junit.Test;

public class ClassTest {
	/*
	 * 
	 * Class 类的实例表示正在运行的 Java 应用程序中的类和接口。
	 * 	枚举是一种类，注释是一种接口。
	 * 	每个数组属于被映射为 Class对象的一个类，所有具有相同元素类型和维数的数组都共享该 Class 对象。
	 * 	基本的 Java类型（boolean、byte、char、short、int、long、float 和 double）和关键字 void 也表示为 Class
	 * 
	 * 对象 获得Class实例的方式  - 类
	 * 	1 对象.getClass()   ---> 此方法是Object中的一个方法,因此所有的对象都可以调用
	 *  2 类型名.class
	 *  3 Class中的静态方法  forName(String className)
	 *  
	 *  注意 : 不管通过何种方式得到的Class的实例,同一个类只会存在一份字节码对象
	 */
	@Test
	public void testClass() throws Exception {
		// 获得String类对应的Class实例
		Class clz1 = "张国栋".getClass();
		Class clz2 = String.class;
		Class clz3 = Class.forName("java.lang.String");
		System.out.println(clz1==clz2);
		System.out.println(clz1==clz3);
	}
	
	
	/*
	 *  获得Class实例的方式  - 接口
	 *  2 类型名.class
	 *  3 Class中的静态方法  forName(String className)
	 *  
	 *  注意 : 不管通过何种方式得到的Class的实例,同一个类只会存在一份字节码对象
	 */
	@Test
	public void testInterface() throws Exception {
		// 获得List接口对应的Class实例
//		List list = new ArrayList();
//		System.out.println(list.getClass());   //ArrayList
		
		Class clz1 = List.class;
		Class clz2 = Class.forName("java.util.List");
		System.out.println(clz1==clz2);
	}
	
	/*
	 * 	
	 *  获得Class实例的方式  - 数组
	 *  每个数组属于被映射为 Class对象的一个类，所有具有相同元素类型和维数的数组都共享该 Class 对象
	 *  1 对象名.getClass()
	 *  2 类型名.class
	 *  
	 *  注意 : 不管通过何种方式得到的Class的实例,同一个类只会存在一份字节码对象
	 *  
	 *  变量的声明语法  : 数据类型  变量名
	 */
	@Test
	public void testArray() throws Exception {
		int[] arr1 = new int[5];
		Class clz1 = arr1.getClass();
		
		int[] arr2 = new int[50];
		Class clz2 = arr2.getClass();
		
		System.out.println(clz1==clz2); //true  和对象没有关系,只关心对象的类型
		
		String[] s1 = new String[5];
		Class clzs1 = s1.getClass();
		System.out.println(clz1==clzs1);  //false
		
		int[][] arr3 = new int[5][5];
		Class clz3 = arr3.getClass();
		System.out.println(clz1==clz3); // false
		
		Class clz11 = int[].class;
		System.out.println(clz1==clz11);//true
		
		Class clz4 = Class.forName("int[]");
		System.out.println(clz4);
		
	}
	
	/*
	 *  获得Class实例的方式  - 基本数据类型和void
	 *  1 类型名.class
	 *  2 每一个基本数据类型其对应的包装类中都有一个字段持有其基本数据类型的Class实例
	 *  
	 *  注意 : 不管通过何种方式得到的Class的实例,同一个类只会存在一份字节码对象
	 */
	@Test
	public void testInt() throws Exception {
		Class clz1 = int.class;
		Class clz2 = Integer.TYPE;
		
		System.out.println(clz1==clz2);  //true
		
		Class clz3 = Integer.class;
		System.out.println(clz1==clz3);  //false   证明int   Integer对应的Class实例不一样
		
//		void v;
		Class clzv1 = void.class;
		Class clzv2 = Void.TYPE;
		System.out.println(clzv1==clzv2); //true
		
//		Void void1 = null;
	}
	
}
