package cn.ximcloud.itsource.day45_javabean._01javabean;

import org.junit.Test;

import java.beans.*;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-12
 * Time: 10:52
 * ProjectName: itsource.cn.ximcloud.itsource.day45_javabean._01javabean
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
 * 测试JAVABean
 **/

public class JavaBeanTest {

    /**
     * 通过使用工具类Introspector.getBeanInfo()方法来获取一个JavaBean的全部属性
     */
    @Test
    public void testJavaBeanProperty() {
        try {
//            获取JAVABean的方式是同故宫Introspector.getBeanInfo()方法
            BeanInfo beanInfo = Introspector.getBeanInfo(User.class);
//            通过beanInfo.getPropertyDescriptors()方法可以获得属性的描述，也是一个数组
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                System.out.print("属性的名字:" + propertyDescriptor.getName());
                System.out.print("属性的类型:" + propertyDescriptor.getPropertyType());
                System.out.print("属性的可写方法:" + propertyDescriptor.getWriteMethod());
                System.out.println("属性的可读方法:" + propertyDescriptor.getReadMethod());
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过使用工具类Introspector.getBeanInfo()方法来获取一个JavaBean的所有方法
     */
    @Test
    public void testJavaBeanMethod() throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(User.class);
//        获得JavaBean的方法的描述，也是一个数组
        MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();
        for (MethodDescriptor methodDescriptor : methodDescriptors) {
//            获取方法的方法对象
            Method method = methodDescriptor.getMethod();
            String name = method.getName();
            System.out.print("这个方法的名字:" + name);
//            获取方法的参数列表描述
            ParameterDescriptor[] parameterDescriptors = methodDescriptor.getParameterDescriptors();
            for (ParameterDescriptor parameterDescriptor : parameterDescriptors) {
//                这个方法的参数列表
                String name1 = parameterDescriptor.getName();
                System.out.print("name : " + name1);
//                DisplayName是什么鬼
                String displayName = parameterDescriptor.getDisplayName();
                System.out.print("displayName :" + displayName);
//                获取一个短描述
                String shortDescription = parameterDescriptor.getShortDescription();
                System.out.println("shortDescription :" + shortDescription);
            }
        }
    }
}
