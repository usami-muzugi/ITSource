package cn.ximcloud.itsource.day34_anno_and_xml.homework.homework1.dom4j.v2;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-28
 * Time: 20:49
 * ProjectName: ITSource
 * To change this template use File | Settings | File Templates.
 * ////////////////////////////////////////////////////////////////////
 * //                          _ooOoo_                               //
 * //                         o8888888o                              //
 * //                         88" . "88                              //
 * //                         (| ^_^ |)                              //
 * //                         O\  =  /O                              //
 * //                      ____/`---'\____                           //
 * //                    .'  \\|     |//  `.                         //
 * //                   /  \\|||  :  |||//  \                        //
 * //                  /  _||||| -:- |||||-  \                       //
 * //                  |   | \\\  -  /// |   |                       //
 * //                  | \_|  ''\---/''  |   |                       //
 * //                  \  .-\__  `-`  ___/-. /                       //
 * //                ___`. .'  /--.--\  `. . ___                     //
 * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
 * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
 * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
 * //      ========`-.____`-.___\_____/___.-`____.-'========         //
 * //                           `=---='                              //
 * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
 * //         佛祖保佑          永无BUG          永不修改             //
 * ////////////////////////////////////////////////////////////////////
 **/
public class StudentDAOImpl {
    private File file;
    private String className;
    private String[] fields;
    private Student[] students;
    private Document document;
    private int sum;


    public StudentDAOImpl() {
        init();
    }

    public StudentDAOImpl(File outputTarget) {
        this();
        file = outputTarget;
    }

    /**
     * 文件输出位置
     *
     * @param outputTarget 文件输出位置
     */
    public StudentDAOImpl(File outputTarget, Student... students) {
        this(outputTarget);
        this.students = students;
        getTClass();
    }

    /**
     * @param student 学生对象
     * @return this
     */
    public StudentDAOImpl add(Student student) {
        //获得根
        Element rootElement = document.getRootElement();

        //添加一个Stu 并添加Attr
        Element stu = rootElement.addElement("Stu").addAttribute("No:", sum++ + "");
        int index = 0;
        for (String s : fields) {
            stu.addElement(s).addAttribute("id", index++ + "");
        }
        return this;
    }

    public StudentDAOImpl add(Student... student) {
        for (Student student1 : student) {
            add(student1);
        }
        return this;
    }

    public void save(){
        try {
            XMLWriter xmlWriter = new XMLWriter(new FileWriter(file), OutputFormat.createPrettyPrint());
            xmlWriter.write(document);
            xmlWriter.flush();
            xmlWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 设置路径
     *
     * @param outputTarget 路径
     * @return 返回this
     */
    public StudentDAOImpl setFilePath(File outputTarget) {
        file = outputTarget;
        return this;
    }


    private void getTClass() {
        Class<Student> studentClass = Student.class;
        className = studentClass.getName();
        Field[] declaredFields = studentClass.getDeclaredFields();
        fields = new String[declaredFields.length];
        for (int i = 0; i < declaredFields.length; i++) {
            fields[i] = declaredFields[i].getName();
        }


    }

    /**
     * initialing operation
     */
    private void init() {
        //初始化document
        document = DocumentHelper.createDocument();

        //根节点
        document.addElement(className);

    }


}
