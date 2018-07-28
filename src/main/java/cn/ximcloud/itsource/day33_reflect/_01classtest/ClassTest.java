package cn.ximcloud.itsource.day33_reflect._01classtest;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-26
 * Time: 11:53
 * ProjectName: ITSource.cn.ximcloud.itsource.day33_reflect._01classtest
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class ClassTest {


    @Test
    public void testClass2() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //使用类的完全限定名来创建一个对象
        Object o = Class.forName("java.lang.String").newInstance();
        //使用这种方式来创建一个对象 ..其实都是一样的
        String s = "java.lang.String";
        Object o1 = Class.forName(s).newInstance();
        System.out.println(o.getClass().getPackage());
        System.out.println(o1.getClass().getPackage());
    }



    @Test
    public void testClass() throws ClassNotFoundException {
        //通过.class 获取 字节码文件（类的类对象）
        Class stringClass = String.class;
        //也可以通过所有类都是Object的子类，而Object拥有getClass()方法来获取
        Class aClass = new String().getClass();
        System.out.println(stringClass == aClass);      //这里的到的结果是true，也就是说一个类的字节码文件在一个JVM当中有且只有一个
        //还可以通过Class.forName(String className)获得
        Class<?> aClass1 = Class.forName("java.lang.String");
        System.out.println(stringClass == aClass);

        //深入了解Class类

        //获取一个类的存在的方法
        Method[] methods = stringClass.getMethods();

        //打印一下试试看
        for (Method method : methods) {
            System.out.println(method);

        }

        //或缺一个类的存在的字段
        Field[] fields = stringClass.getFields();

        System.out.println("--------------------------------------------");


        //打印下试试看
        for (Field field : fields) {
            System.out.println(field);

        }


        Class<Integer[]> aClass2 = Integer[].class;
        System.out.println(aClass2);
        System.out.println(int[][][][][].class);
//        Class<?> aClass3 = Class.forName("[Ljava.lang.Integer");
//        System.out.println(aClass3);

        /**
         * result:
         *
         * true
         * public boolean java.lang.String.equals(java.lang.Object)
         * public int java.lang.String.length()
         * public java.lang.String java.lang.String.toString()
         * public int java.lang.String.hashCode()
         * public void java.lang.String.getChars(int,int,char[],int)
         * public int java.lang.String.compareTo(java.lang.String)
         * public int java.lang.String.compareTo(java.lang.Object)
         * public int java.lang.String.indexOf(java.lang.String,int)
         * public int java.lang.String.indexOf(int)
         * public int java.lang.String.indexOf(int,int)
         * public int java.lang.String.indexOf(java.lang.String)
         * public static java.lang.String java.lang.String.valueOf(int)
         * public static java.lang.String java.lang.String.valueOf(char)
         * public static java.lang.String java.lang.String.valueOf(boolean)
         * public static java.lang.String java.lang.String.valueOf(long)
         * public static java.lang.String java.lang.String.valueOf(float)
         * public static java.lang.String java.lang.String.valueOf(double)
         * public static java.lang.String java.lang.String.valueOf(java.lang.Object)
         * public static java.lang.String java.lang.String.valueOf(char[])
         * public static java.lang.String java.lang.String.valueOf(char[],int,int)
         * public java.util.stream.IntStream java.lang.String.codePoints()
         * public boolean java.lang.String.isEmpty()
         * public char java.lang.String.charAt(int)
         * public int java.lang.String.codePointAt(int)
         * public int java.lang.String.codePointBefore(int)
         * public int java.lang.String.codePointCount(int,int)
         * public int java.lang.String.offsetByCodePoints(int,int)
         * public void java.lang.String.getBytes(int,int,byte[],int)
         * public byte[] java.lang.String.getBytes(java.nio.charset.Charset)
         * public byte[] java.lang.String.getBytes()
         * public byte[] java.lang.String.getBytes(java.lang.String) throws java.io.UnsupportedEncodingException
         * public boolean java.lang.String.contentEquals(java.lang.StringBuffer)
         * public boolean java.lang.String.contentEquals(java.lang.CharSequence)
         * public boolean java.lang.String.equalsIgnoreCase(java.lang.String)
         * public int java.lang.String.compareToIgnoreCase(java.lang.String)
         * public boolean java.lang.String.regionMatches(boolean,int,java.lang.String,int,int)
         * public boolean java.lang.String.regionMatches(int,java.lang.String,int,int)
         * public boolean java.lang.String.startsWith(java.lang.String,int)
         * public boolean java.lang.String.startsWith(java.lang.String)
         * public boolean java.lang.String.endsWith(java.lang.String)
         * public int java.lang.String.lastIndexOf(int,int)
         * public int java.lang.String.lastIndexOf(java.lang.String)
         * public int java.lang.String.lastIndexOf(java.lang.String,int)
         * public int java.lang.String.lastIndexOf(int)
         * public java.lang.String java.lang.String.substring(int,int)
         * public java.lang.String java.lang.String.substring(int)
         * public java.lang.CharSequence java.lang.String.subSequence(int,int)
         * public java.lang.String java.lang.String.concat(java.lang.String)
         * public java.lang.String java.lang.String.replace(java.lang.CharSequence,java.lang.CharSequence)
         * public java.lang.String java.lang.String.replace(char,char)
         * public boolean java.lang.String.matches(java.lang.String)
         * public boolean java.lang.String.contains(java.lang.CharSequence)
         * public java.lang.String java.lang.String.replaceFirst(java.lang.String,java.lang.String)
         * public java.lang.String java.lang.String.replaceAll(java.lang.String,java.lang.String)
         * public java.lang.String[] java.lang.String.split(java.lang.String)
         * public java.lang.String[] java.lang.String.split(java.lang.String,int)
         * public static java.lang.String java.lang.String.join(java.lang.CharSequence,java.lang.CharSequence[])
         * public static java.lang.String java.lang.String.join(java.lang.CharSequence,java.lang.Iterable)
         * public java.lang.String java.lang.String.toLowerCase()
         * public java.lang.String java.lang.String.toLowerCase(java.util.Locale)
         * public java.lang.String java.lang.String.toUpperCase(java.util.Locale)
         * public java.lang.String java.lang.String.toUpperCase()
         * public java.lang.String java.lang.String.trim()
         * public java.util.stream.IntStream java.lang.String.chars()
         * public char[] java.lang.String.toCharArray()
         * public static java.lang.String java.lang.String.format(java.lang.String,java.lang.Object[])
         * public static java.lang.String java.lang.String.format(java.util.Locale,java.lang.String,java.lang.Object[])
         * public static java.lang.String java.lang.String.copyValueOf(char[],int,int)
         * public static java.lang.String java.lang.String.copyValueOf(char[])
         * public native java.lang.String java.lang.String.intern()
         * public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
         * public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
         * public final void java.lang.Object.wait() throws java.lang.InterruptedException
         * public final native java.lang.Class java.lang.Object.getClass()
         * public final native void java.lang.Object.notify()
         * public final native void java.lang.Object.notifyAll()
         * --------------------------------------------
         * 字段只有一个
         * public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER
         */
    }

    @Test
    public void defualtTest() {
        Class integerClass = int.class;
        Class integerClass1 = Integer.class;
        Class<Integer> type = Integer.TYPE;
        System.out.println(integerClass1 == integerClass);
        System.out.println(type == integerClass);
    }

    @Test
    public void arrayTest() {
        Class<int[]> aClass = int[].class;
        Class aClass1 = new int[5].getClass();
        System.out.println(aClass == aClass1);

        int[][] arrss = new int[1][];
        Class aClass3 = arrss.getClass();
        System.out.println(aClass == aClass3);

        String[] strings = new String[1];
        Class aClass2 = strings.getClass();
        System.out.println(aClass == aClass2);
    }

    @Test
    public void listTest() {
        List list = new ArrayList<>();
        Class aClass = list.getClass();
        System.out.println(aClass);
        Class<List> listClass = List.class;
        System.out.println(listClass);
    }

    @Test
    public void voidTest() {
        Class voidClass = void.class;
        System.out.println(voidClass);
        Class type = Void.TYPE;
        System.out.println(type);
        Class voidClass1 = Void.class;
        System.out.println(voidClass1);

    }


}

