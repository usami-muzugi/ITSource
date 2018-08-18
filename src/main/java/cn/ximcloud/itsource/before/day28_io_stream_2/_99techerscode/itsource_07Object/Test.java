package cn.ximcloud.itsource.before.day28_io_stream_2._99techerscode.itsource_07Object;

import java.io.*;

public class Test {
    /*
     * 一个对象,就是一个数据
     *
     * 			如果我们想要将这个对象,永久的保存起来,得用IO流,将对象永久的保存到磁盘
     * 		而且需要实现对象序列化
     *
     *
     * */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu = new Student("小明", 18);
        PrintStream ps = new PrintStream("H:/b/b.txt");
        ps.print(stu.name + "-" + stu.age);//这里仅仅是将对象对象描述的字符串打印过去了[真正的一个对象]
        /*如上示例,打算将对象保存在磁盘中,永久保存
         * 仅仅保存了信息,对象存在类型的,特性的
         * */
		
		/*提供了对象流,可以将一个对象保存在磁盘文件,并且拿出来,反应对对象的所有信息,及特性
		 *将对象用于网络传输
		 *  i.ObjectInputStream
			ii.ObjectOutputStream
		 * */
        Student stu1 = new Student("小明", 18);
        Student stu2 = new Student("小黑", 20);
        Student stu3 = new Student("小花", 22);
        FileOutputStream fos = new FileOutputStream("H:/b/c");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(stu1);
        oos.writeObject(stu2);
        oos.writeObject(stu3);
        oos.writeObject(null);//文件末尾写入null标识结束

        FileInputStream fis = new FileInputStream("H:/b/c");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj = null;
        while ((obj = ois.readObject()) != null) {
            if (obj instanceof Student) {
                Student st = (Student) obj;
                System.out.println(st.name + "--------" + st.age);
            }
        }
    }
}

class Student implements java.io.Serializable {//对象需要序列化操作,永久保存,读写操作,应该要将他序列化之后
    String name;
    int age;

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "-" + age;
    }
}
