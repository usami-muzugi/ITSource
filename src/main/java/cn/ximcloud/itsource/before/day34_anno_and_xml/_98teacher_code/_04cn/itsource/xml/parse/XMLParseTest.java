package cn.ximcloud.itsource.before.day34_anno_and_xml._98teacher_code._04cn.itsource.xml.parse;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XMLParseTest {
    /*
     * 需求： 操作XML文件（读取，新增，修改，删除）
     * 		 Document这里类型中有一些完成上面操作的方法
     * 		 调用方法--》 非静态  --》 创建Document的对象 --》 接口
     * ---------------------------
     * 获得对象的方式
     * 		new
     * 		静态方法
     * 		反射
     * 		工厂
     * 	。。。
     *
     */
    @Test
    public void testGetDom() throws Exception {
        /*从文档查找
         * Document
         * DocumentBuilder		   --》可以获得Document对象
         * DocumentBuilderFactory  --> 获得DocumentBuilder对象的
         */
        File file = new File("F:/Java180606/workspace/anno1-xml/src/_04cn/itsource/xml/parse/contacts.xml");
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
        Document dom = documentBuilder.parse(file);

        System.out.println(dom);  //[#document: null]

    }

    //	1、得到某个具体的文本节点的内容:取出第二个联系人的名字
    @Test
    public void testGetName() throws Exception {
        File file = new File("F:/Java180606/workspace/anno1-xml/src/_04cn/itsource/xml/parse/contacts.xml");
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
        Document dom = documentBuilder.parse(file);

        // 从根开始一层一层严谨的去找
        // 1 获得文档的根节点
        Element root = dom.getDocumentElement();

        // 2 获得第二个联系人（根下面除了联系linkman人还可能有其它的元素xx  oo..）
        NodeList linkmanList = root.getElementsByTagName("linkman");
        //测试获得的东西
//		for (int i = 0; i < linkmanList.getLength(); i++) {
//			System.out.println(linkmanList.item(i));
//		}

        Element linkman = (Element) linkmanList.item(1);

        // 3 获得linkman下面的子元素 name
        Node name = linkman.getElementsByTagName("name").item(0);

        // 4 获得name元素内部的数据
        String text = name.getTextContent();
        System.out.println(text);
    }

    //	2、修改某个元素节点的主体内容：把第一个联系人的邮箱改掉
    @Test
    public void testUpdate() throws Exception {
        File file = new File("F:/Java180606/workspace/anno1-xml/src/_04cn/itsource/xml/parse/contacts.xml");
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
        Document dom = documentBuilder.parse(file);

        // 从根开始一层一层严谨的去找
        // 1 获得文档的根节点
        Element root = dom.getDocumentElement();

        // 2 获得第二个联系人（根下面除了联系linkman人还可能有其它的元素xx  oo..）
        NodeList linkmanList = root.getElementsByTagName("linkman");
        Element linkman = (Element) linkmanList.item(0);

        // 3 获得linkman下面的子元素 email
        Node email = linkman.getElementsByTagName("email").item(0);

        // 4修改email元素内部的数据
        email.setTextContent("hcy@itsource.cn");
        /*
         * 到目前为止并没有成功修改xml文件中的内容
         * 上面email.setTextContent 改变的是dom对象中的数据，没有写回到文件中
         * 需要把内存中的dom对象重新写入xml文件
         *
         * Transformer
         * TransformerFactory
         *
         */
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        Source xmlSource = new DOMSource(dom);
        Result result = new StreamResult(file);
        transformer.transform(xmlSource, result);
    }


    //	3、向指定元素节点中增加子元素节点：增加一个联系人信息
    @Test
    public void testSave() throws Exception {
        File file = new File("F:/Java180606/workspace/anno1-xml/src/_04cn/itsource/xml/parse/contacts.xml");
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
        Document dom = documentBuilder.parse(file);

        // 从根开始一层一层严谨的去找
        // 1 获得文档的根节点
        Element root = dom.getDocumentElement();

        //创建多个Element对象
        Element linkman = dom.createElement("linkman");
        Element name = dom.createElement("name");
        Element email = dom.createElement("email");
        Element address = dom.createElement("address");
        Element group = dom.createElement("group");
        //给元素设置文本值
        name.setTextContent("小明");
        email.setTextContent("xm@xxx.com");
        address.setTextContent("天府新谷");
        group.setTextContent("源码时代");

        // 建立关系
        linkman.appendChild(name);
        linkman.appendChild(email);
        linkman.appendChild(address);
        linkman.appendChild(group);

        root.appendChild(linkman);

        /*
         * 负责写入的
         */
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        Source xmlSource = new DOMSource(dom);
        Result result = new StreamResult(file);
        transformer.transform(xmlSource, result);
    }

    //	4、操作XML文件属性：设置/获取联系人的id属性
    @Test
    public void testGetAttr() throws Exception {
        File file = new File("F:/Java180606/workspace/anno1-xml/src/_04cn/itsource/xml/parse/contacts.xml");
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
        Document dom = documentBuilder.parse(file);

        // 从根开始一层一层严谨的去找
        // 1 获得文档的根节点
        Element root = dom.getDocumentElement();

        // 2 获得第1个联系人（根下面除了联系linkman人还可能有其它的元素xx  oo..）
        NodeList linkmanList = root.getElementsByTagName("linkman");

        Element linkman = (Element) linkmanList.item(0);
//		String string = linkman.getAttribute("id");
        linkman.setAttribute("id", "666");

        /*
         * 负责写入的
         */
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        Source xmlSource = new DOMSource(dom);
        Result result = new StreamResult(file);
        transformer.transform(xmlSource, result);
    }

    //	5、删除指定元素节点：删除第三个联系人信息
    @Test
    public void testDelete() throws Exception {
        File file = new File("F:/Java180606/workspace/anno1-xml/src/_04cn/itsource/xml/parse/contacts.xml");
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
        Document dom = documentBuilder.parse(file);

        // 1 获得文档的根节点
        Element root = dom.getDocumentElement();

        // 2 获得第3个联系人
        NodeList linkmanList = root.getElementsByTagName("linkman");
        Element linkman = (Element) linkmanList.item(2);

        //3 删除元素推荐写法，被删除元素.getParent().removeChild(被删除的元素)
        linkman.getParentNode().removeChild(linkman);


        /* 负责写入的*/
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        Source xmlSource = new DOMSource(dom);
        Result result = new StreamResult(file);
        transformer.transform(xmlSource, result);
    }

}
