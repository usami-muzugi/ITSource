package cn.ximcloud.itsource.day52_mini_struts2.filter;

import cn.ximcloud.itsource.day52_mini_struts2.config.ActionConfig;
import cn.ximcloud.itsource.day52_mini_struts2.config.ResultConfig;
import cn.ximcloud.itsource.day52_mini_struts2.context.ActionContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-24
 * Time: 19:18
 * ProjectName: itsource.cn.ximcloud.itsource.day52_mini_struts2.filter
 * To change this template use File | Settings | Editor | File and Code Templates.
 * <p>
 * you are not expected to understand this.
 * <p>
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
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class CoreFilter extends HttpFilter {
    private Map<String, ActionConfig> actionConfigMap = new HashMap<>();
    private ActionConfig actionConfig;
    private Map<String, ResultConfig> resultConfigMap;

    @Override
    public void init() {
        File destXML = new File("C:\\Users\\wizard\\IdeaProjects\\itsource\\src\\main\\java\\cn\\ximcloud\\itsource\\day52_mini_struts2\\resource\\struts.xml");
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(destXML);
            NodeList actiones = document.getElementsByTagName("action");
            for (int i = 0; i < actiones.getLength(); i++) {
                Element action = (Element) actiones.item(i);
                String name = action.getAttribute("name");
                String aClass = action.getAttribute("class");
                String method = action.getAttribute("method");
                ActionConfig actionConfig = new ActionConfig(name, aClass, method);

                NodeList results = action.getElementsByTagName("result");
                for (int j = 0; j < results.getLength(); j++) {
                    Element result = (Element) results.item(j);
                    String resultName = result.getAttribute("name");
                    String resultType = result.getAttribute("type");
                    String resultTextContent = result.getTextContent();
                    actionConfig.getResultConfigMap().put(resultName, new ResultConfig(resultName, resultType, resultTextContent));
                }
                actionConfigMap.put(name, actionConfig);
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        System.out.println(actionConfigMap);
    }

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        String temp = request.getRequestURI();
        temp = temp.substring(temp.lastIndexOf("/") + 1);

        if (actionConfigMap.containsKey(temp)) {
            actionConfig = actionConfigMap.get(temp);
            try {
                ActionContext.setActionContext(new ActionContext(request, response));
                Class<?> destClass = Class.forName(actionConfig.getClassName());
                Object instance = destClass.getConstructor().newInstance();
                Method method = destClass.getMethod(actionConfig.getMethodName());
                if ((resultConfigMap = actionConfig.getResultConfigMap()).containsKey((temp = method.invoke(instance).toString()))) {
                    ResultConfig resultConfig = resultConfigMap.get(temp);
                    if (resultConfig.getType().equals("Dispatcher")) {
                        request.getRequestDispatcher(resultConfig.getUrl()).forward(request, response);
                    } else {
                        response.sendRedirect(resultConfig.getUrl());
                    }
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("放行了");
            chain.doFilter(request, response);
        }
    }
}
