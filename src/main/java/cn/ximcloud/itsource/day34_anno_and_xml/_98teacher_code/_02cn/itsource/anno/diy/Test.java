package cn.ximcloud.itsource.day34_anno_and_xml._98teacher_code._02cn.itsource.anno.diy;

import java.lang.annotation.Annotation;

public class Test {

	public static void main(String[] args) {
		/*
		 * 需求：自定义注解
		 * 		场景： 定义一个VIP这样的一个注解
		 * 		1、定义一个注解
		 * 		2、在其它的地方贴（使用）
		 * 		3、实现一些简单的功能（根据VIP的等级来赠送不同的大礼包）
		 * 			通过反射获得一个类上面的注解进行判断
		 * 		
		 */
		
		//1 通过反射获得User上面的指定注解
		Class<User> clz = User.class;
//		Annotation[] annotations = clz.getAnnotations(); 
//		for (Annotation annotation : annotations) {
//			System.out.println(annotation);
//		}
		
		VIP v = clz.getAnnotation(VIP.class);
		//2 获得注解中的（VIP）level的值
		int level = v.level();
		System.out.println(level);
		//3 根据第二部的结果值进行判断。。。
		if(level==1){
			System.out.println("赠送源码时代javase视频一套");
		}else if(level==2){
			System.out.println("赠送源码时代免费试学1个月");
			
		}else if(level==3){
			System.out.println("赠送老胡签名照一张");
		}else{
			System.out.println("亲，冲个会员");
		}
	}

}
