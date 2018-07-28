package cn.ximcloud.itsource.day34_anno_and_xml.homework;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * Created by IntelliJ IDEA.
 * User: wizard
 * Date: 2018-07-28
 * Time: 15:31
 * ProjectName: itsource.cn.ximcloud.itsource.day34_anno_and_xml.homework
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class XMLTest {
    private static Class aClass = Student.class;
    private static Document document;
    private static File file = new File("C:\\Users\\wizard\\IdeaProjects\\itsource\\src\\main\\java\\cn\\ximcloud\\itsource\\day34_anno_and_xml\\homework\\Student.xml");
    private static Integer sum;

    /**
     * 初始化document和root
     */
    @BeforeClass
    public static void doBeforeClass() {
        //创建一个domDocument
        document = DocumentHelper.createDocument();
        //创建一个root
        document.addElement(aClass.getSimpleName());
    }

    /**
     *
     */
    @Test
    public void testCreateElement() {
        //获得根
        Element rootElement = document.getRootElement();
        //获得字段
        Field[] declaredFields = aClass.getDeclaredFields();
        int index = 1;
        Element stu = rootElement.addElement("stu").addAttribute("No", sum++ +"");
        for (Field declaredField : declaredFields) {
            stu.addElement(declaredField.getName()).addAttribute("id", index++ + "");
        }
    }


    /**
     * 创建学生对象
     */
    @Test
    public void test() {
        Element root = document.getRootElement();
        Student[] students = new Student[5];
        students[0] = new Student("usami", 20);

        students[1] = new Student("ourinsama", 20);
        students[2] = new Student("time", 25);
        students[3] = new Student("jeston", 20);
        students[4] = new Student("彭睿", 20);



        for (int i = 0; i < students.length; i++) {
            testCreateElement();
            root.selectNodes("stu")

        }

    }


    @AfterClass
    public static void doAfterClass() throws IOException {
        XMLWriter xmlWriter = new XMLWriter(new FileWriter(file), OutputFormat.createPrettyPrint());
        xmlWriter.write(document);
        xmlWriter.flush();
        xmlWriter.close();
    }
}
