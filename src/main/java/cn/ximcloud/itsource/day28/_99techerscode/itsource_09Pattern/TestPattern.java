package cn.ximcloud.itsource.day28._99techerscode.itsource_09Pattern;

public class TestPattern {
	
	public static void main(String[] args) {
		String num = "999999999995498825699";
		
		String regix1 = "[0-9]{11}";
		String regix2 = "9*[358][0-9]{9}";
		
		System.out.println("------------------->"+num.matches(regix2));
		
		String str = "beautifulname age succfully food hello world";
		String regix3 = "[^a-zA-Z]";
		String[] split = str.split(regix3);
		for (String string : split) {
			System.out.println(string);
		}
		
		String regix4 = "(1[3586][0-9]{1})([0-9]{4})([0-9]{4})";
		String replaceAll = num.replaceAll(regix4, "$1源码时代$3");
		System.out.println(replaceAll);
		
		//在java代码中,如果想要写比较复杂的规则,参考Pattern  
	}

}
