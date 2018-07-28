package cn.ximcloud.itsource.day34_anno_and_xml._05xml_doc_obj_mod_parse;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Student: wizard
 * Date: 2018-07-27
 * Time: 16:05
 * ProjectName: ITSource.cn.ximcloud.itsource.day34_anno_and_xml._05xml_doc_obj_mod_parse
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 对xml文件进行增删改查操作
 **/

public class GetDoucumentTest {
    //一个document对象
    private static Document document;
    private static File file = new File("C:\\Users\\wizard\\IdeaProjects\\itsource\\src\\main\\java\\cn\\ximcloud\\itsource\\day34_anno_and_xml\\_04xml_learning\\resource\\contacts.xml");

    //初始化操作
    @BeforeClass
    public static void doBefore() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        document = documentBuilder.parse(file);
    }

    /**
     * 由于除了查看之外的都需要用到写入到磁盘的操作，所以这里写到了@AffterClass
     *
     * @throws TransformerConfigurationException Transformer配置异常
     */
    @AfterClass
    public static void doAfter() throws TransformerException {
        //操作需要适用Transformer但是是一个抽象类，且protected构造方法所以需要一个具体的实现类或者是一个工厂类
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        //通过工厂拿到工厂类对象，然后再获取transformer对象
        Transformer transformer = transformerFactory.newTransformer();

        //DOM资源进行操作需要适用DOMSource
        DOMSource domSource = new DOMSource();
        //设置Node，XML里面一切皆Node，所以是传入Node的实现类
        domSource.setNode(document);

        StreamResult streamResult = new StreamResult();
        streamResult.setSystemId(file);

        //public abstract void transform(Source xmlSource, Result outputTarget)
        transformer.transform(domSource, streamResult);
    }

    /**
     * 获取所有tagName为linkman的元素们
     */
    @Test
    public void doTest() {
        Element root = document.getDocumentElement();
        NodeList linkman = root.getElementsByTagName("linkman");
        for (int i = 0; i < linkman.getLength(); i++) {
            System.out.println(linkman.item(i));
        }
    }

    /**
     * 获取xml文件中的第二个linkman的名为name的元素的Text
     */
    @Test
    public void testGetNode() {
        //获取根
        Element root = document.getDocumentElement();
        //在根中获取linkmanList
        NodeList linkman = root.getElementsByTagName("linkman");
        //在linkmanList中获取指定linkman （第二个linkman）
        Element linkeman = (Element) linkman.item(1);
        //在这个linkman中获取指定字段 nameList
        NodeList name = linkeman.getElementsByTagName("name");
        //获取第一个name
        Node item = name.item(0);
        String textContent = item.getTextContent();
        System.out.println(textContent);
    }

    /**
     * 对指定的元素的Text进行操作
     */
    @Test
    public void testAlert() {
        //获得根
        Element documentElement = document.getDocumentElement();
        //获取这个TagName为 linkman的List然后选取0
        Node linkman = documentElement.getElementsByTagName("linkman").item(0);
        //获取了这个linkman然后获取email的字段List
        NodeList email = ((Element) linkman).getElementsByTagName("email");
        //获取email
        Node item = email.item(0);
        //设置email的Text
        item.setTextContent("3436260@qq.com");  //这里就设置完了？想多了

        //doAfter()
    }

    /**
     * 添加一个linkman元素到xml文件里面去。
     */
    @Test
    public void testAdd() {
        //创建5个元素实例
        Element linkman = document.createElement("linkman");
        Element name = document.createElement("name");
        Element email = document.createElement("email");
        Element address = document.createElement("address");
        Element group = document.createElement("group");
        //分别对元素进行设置操作
        linkman.setAttribute("id", "3");
        name.setTextContent("彭睿");
        email.setTextContent("3436260@qq.com");
        address.setTextContent("成都");
        group.setTextContent("牛逼集团");
        //把子元素添加到linkman
        linkman.appendChild(name);
        linkman.appendChild(email);
        linkman.appendChild(address);
        linkman.appendChild(group);
        //获取根
        Element root = document.getDocumentElement();
        //把linkman添加到根
        root.appendChild(linkman);
    }

    /**
     * 获得指定的元素的attr，然后对其进行获取和修改操作
     */
    @Test
    public void testGetAttr() {
        Element documentElement = document.getDocumentElement();
        NodeList linkman = documentElement.getElementsByTagName("linkman");
        NamedNodeMap attributes = linkman.item(0).getAttributes();
        Node item = attributes.item(0);
        String textContent = item.getTextContent();
        System.out.println(textContent);
        item.setTextContent("666");
    }

    /**
     * 删除指定的节点（元素）
     * 从一个xml文件当中的根中删除第三个linkman节点
     */
    @Test
    public void testDelete() {
        Element documentElement = document.getDocumentElement();
        NodeList linkman = documentElement.getElementsByTagName("linkman");
        Node item = linkman.item(2);
        item.getParentNode().removeChild(item);
    }
}
