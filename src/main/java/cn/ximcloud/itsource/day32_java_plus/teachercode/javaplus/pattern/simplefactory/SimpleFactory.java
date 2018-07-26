package cn.ximcloud.itsource.day32_java_plus.teachercode.javaplus.pattern.simplefactory;

public class SimpleFactory {

    /*
     * 用于返回Phone类型的对象
     * 如果接收到的name是"apple",则返回Apple对象;
     * 否则,返回MI对象;
     * */
    public Phone getPhone(String name) {
        if (name.equals("apple")) {
            return new Apple();
        } else {
            return new MI();
        }
    }

}
