package cn.ximcloud.itsource.day28._99techerscode.itsource_06Scanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {
	/*
	 * 1.特殊的输入流,没有继承自四大抽象流
	 * 2.文档扫描器,实现了Iterator 接口,特殊的迭代器
	 * 			hasNext
	 * 			next
	 * 3.其实本质还是一个类,相应的构造方法
	 * 4.迭代器,迭代数据的,集合的时候,迭代数据,迭代一个文件的时候,什么是数据
	 * 5.采用分隔符的模式,默认是空白,说明还可以指定分隔符
	 * 		构造方法
	 * 		1.可以是一个文件，对应的构造方法： Scanner(File source) 
			2.可以是其它的输入流，对应的构造方法：Scanner(InputStream source)
			3.仅仅从一个字符串中读取，对应的构造方法：Scanner(String source) 
	 * 
	 * Scanner   主要是用于文本扫描
	 * */
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("H:/b/abc.txt");
		Scanner sc = new Scanner(file);
		//第一种,默认分隔符是空白
		/*while(sc.hasNext()){
			System.out.println(sc.next());
		}*/
		
		//第二种
		/*System.out.println(sc.hasNext());
		while(sc.hasNext()){//此处死循环了
			//System.out.println(sc.nextLine());
			//System.out.println(sc.nextInt());
		}*/
		
		//Scanner(InputStream source)
		Scanner sc2 = new Scanner(new FileInputStream("H:/b/abc.txt"));
		while(sc2.hasNextLine()){
			System.out.println(sc2.nextLine());
		}
		
		Scanner scanner = new Scanner("sd0flka9jsdfjlas68jflkjd-alfj-lkdsaj");//需要注意,比较以前的流,现在其实就是迭代的字符串的值的本身
//		scanner.useDelimiter("-");//设置分割模式
		
		scanner.useDelimiter("[0-9]");//设置分割模式:匹配任意的一个数字
		while(scanner.hasNext()){
			System.out.println(scanner.next());
		}
		
		Scanner scnn = new Scanner(System.in);
		while(scnn.hasNext()){
			System.out.println(scnn.nextInt());
		}
		
		
	}

}
