package cn.ximcloud.itsource.day28._99techerscode.itsource_05System;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class TestSystem {
	/*标准输入,输出,错误流
	 * 
	 * 	i. System.out  是一个特殊的 PrintStreamTest “标准”输出流 ： 输出结果到控制台
		ii.System.err  是一个特殊的 PrintStreamTest "标准"错误输出流 : 输出到控制台，在Eclipse中显示红色的
		iii.System.in  是一个特殊的InputStream "标准"输入流 ： 数据源来至控制台输入
		
		
		
		
	 * */
	public static void main(String[] args) throws IOException {
		System.out.println("123456");
		PrintStream out = System.out;
		out.println("654321");
		
		/*InputStream in = System.in;
		int read = in.read();
		System.out.println(read);
		if(read == 54){
			System.out.println("666666666");
		}*/
		
//		PrintStreamTest err = System.err;
//		err.println("这就是一个错误");
		
		/*
		 * System中提供对应的重定向的方法：
				static void setOut(PrintStreamTest out) 重新分配“标准”输出流，
				标准输出流：输出到指定的输出流。 
				tatic void setErr(PrintStreamTest err) 重新分配“标准”错误输出流，
				标准错误流：将输出到指定的输出流。 
				static void setIn(InputStream in) 重新分配“标准”输入流，
				标准输入流：原来在后台输入，现在根据指定的输入流输入
		 * 
		 * */
		System.setOut(new PrintStream("H:/b/abc.txt"));
		PrintStream out2 = System.out;
		out2.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
		
		
		
		/*System.setErr(new PrintStreamTest("H:/b/abc.txt"));
		PrintStreamTest err2 = System.err;
		err2.println("cuocuocuocuocucoucocuocuocucoucoucoucuo");
		
		err2.close();*/
		
		FileInputStream fis = new FileInputStream("H:/b/bbbbb.txt");
		System.setIn(fis);
		InputStream in2 = System.in;
		byte[] b = new byte[1024];
		int len;
		while((len = in2.read(b)) != -1){
			System.out.println(new String(b,0,len));//如果之前重定向了,需要关闭才能打印到后台,否则打印到重定向的位置
		}
	}

}
