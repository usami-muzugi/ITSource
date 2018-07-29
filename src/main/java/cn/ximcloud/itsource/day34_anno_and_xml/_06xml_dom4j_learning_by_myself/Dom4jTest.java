package cn.ximcloud.itsource.day34_anno_and_xml._06xml_dom4j_learning_by_myself;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * : wizard
 * Date: 2018-07-28
 * Time: 12:27
 * ProjectName: ITSource.cn.ximcloud.itsource.day34_anno_and_xml._06xml_dom4j_learning_by_myself
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

@SuppressWarnings("unchecked")
public class Dom4jTest {
    private static File file;
    private static Document document;

    /**
     * 拿到document对象
     *
     * @throws DocumentException
     */
    @BeforeClass
    public static void doBeforeClass() throws DocumentException {
        file = new File("C:\\Users\\wizard\\IdeaProjects\\itsource\\src\\main\\java\\cn\\ximcloud\\itsource\\day34_anno_and_xml\\_04xml_learning\\resource\\contacts.xml");
        SAXReader reader = new SAXReader();
        document = reader.read(file);
    }

    /**
     * 把写好的XML从内存中写入到磁盘上
     *
     * @throws IOException
     */
    @AfterClass
    public static void testSave() throws IOException {
        OutputFormat prettyPrint = OutputFormat.createPrettyPrint();
        XMLWriter xmlWriter = new XMLWriter(new FileWriter(file), prettyPrint);
        xmlWriter.write(document);
        xmlWriter.flush();
        xmlWriter.close();
    }

    /**
     * 获取根的所有子节点
     * 通过迭代
     * rootElement.elementIterator();
     *
     * @throws DocumentException
     */
    @Test
    public void getAllDomForDom4j() throws DocumentException {
        Element root = document.getRootElement();
        Iterator iterator = root.elementIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * 获得根的所有子节点
     * 通过elements
     */
    @Test
    public void testGetDomForDOM4j() {
        Element rootElement = document.getRootElement();
        //获得所有的子节点
        List elements = rootElement.elements();
        System.out.println(elements);

    }

    /**
     * 获取根的指定的子节点的Text
     * rootElement.elementIterator("linkman");
     */
    @Test
    public void getDomForDom4j() {
        Element rootElement = document.getRootElement();
        List elements = rootElement.elements();
        Element o = (Element) elements.get(2);
        String name = o.elementText("name");
        System.out.println(name);

    }

    /**
     * 适用DOM4J对指定的元素的Text进行操作
     */
    @Test
    public void testAlert() {
        Element rootElement = document.getRootElement();
        List elements = rootElement.elements();
        Element element = (Element) elements.get(0);
        List name = element.elements("name");
        Element element1 = (Element) name.get(0);
        System.out.println("Before:" + element1.getText());
        element1.setText("SS");
    }

    /**
     * 给指定的元素添加一个attr
     */
    @Test
    public void testAttr() {

        //得到的是root根
        Element rootElement = document.getRootElement();
        //遍历过后也就是得到了三个linkman
        Iterator<Element> iterator = rootElement.elementIterator();
        //意思就是给三个linkman添加三个id，value
        while (iterator.hasNext()) {
            iterator.next().setAttributeValue("all", "testValue");
        }
    }

    @Test
    public void testAdd() {
        Element rootElement = document.getRootElement();
        Element linkman = rootElement.addElement("linkman");
        Element name = linkman.addElement("name");
        Element email = linkman.addElement("email");
        Element address = linkman.addElement("address");
        Element group = linkman.addElement("group");


        name.setText("卢思颖");
        email.setText("なし");
        address.setText("なし");
        group.setText("なし");

        linkman.appendAttributes(name);
        linkman.appendAttributes(email);
        linkman.appendAttributes(address);
        linkman.appendAttributes(group);
    }
}
