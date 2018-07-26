package cn.ximcloud.itsource.day33._99teachercode.javaseplus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Test2{
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
    public static void main(String[] args) {
    	List list  = new ArrayList<>();
    	System.out.println(list.getClass());
    	
    	Calendar calendar = Calendar.getInstance();
    	System.out.println(calendar);
    	synchronized (Test2.class) {
			
		}
    	
    	Class class1 = String.class;
    	Method[] methods = class1.getMethods();
    	
    	
    	
    	Class class2 = int.class;
    	
    }
}

enum A{
	HAHA
}

