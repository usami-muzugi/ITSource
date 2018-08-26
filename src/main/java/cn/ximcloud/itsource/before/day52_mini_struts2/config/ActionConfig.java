package cn.ximcloud.itsource.before.day52_mini_struts2.config;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-24
 * Time: 19:20
 * ProjectName: itsource.cn.ximcloud.itsource.before.day52_mini_struts2.config
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

public class ActionConfig {
    private final String DEFAULT_EXECUTE = "execute";
    private String name;
    private String className;
    private String methodName;
    private Map<String, ResultConfig> resultConfigMap;


    {
        resultConfigMap = new HashMap<>();
    }

    public ActionConfig() {
    }

    public ActionConfig(String name, String className, String methodName) {
        this.name = name;
        this.className = className;
        this.methodName = methodName;
    }

    @Override
    public String toString() {
        return "ActionConfig{" +
                "DEFAULT_EXECUTE='" + DEFAULT_EXECUTE + '\'' +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", resultConfigMap=" + resultConfigMap +
                '}';
    }

    public String getDEFAULT_EXECUTE() {
        return DEFAULT_EXECUTE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Map<String, ResultConfig> getResultConfigMap() {
        return resultConfigMap;
    }

    public void setResultConfigMap(Map<String, ResultConfig> resultConfigMap) {
        this.resultConfigMap = resultConfigMap;
    }
}
