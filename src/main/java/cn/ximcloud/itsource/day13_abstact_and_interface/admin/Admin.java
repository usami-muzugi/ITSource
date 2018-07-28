package cn.ximcloud.itsource.day13_abstact_and_interface.admin;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-24
 * Time: 13:07
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
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
 * //         佛祖保佑        永无BUG      永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class Admin {
    private Integer loginId; //登录id
    private String name;
    private String password;


    private Admin() {

    }

    /**
     * @param strings 包含用户名或者是用户id和密码的数组
     */
    public Admin(String[] strings) {
        try {
            loginId = Integer.valueOf(strings[0]);//元素为数字
            password = strings[1];
        } catch (NumberFormatException e) {
            //为字符串
            name = strings[0];
            password = strings[1];
        }
    }

    /**
     * @param loginId  用户id
     * @param password 用户密码
     */
    public Admin(Integer loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }

    /**
     * @param name     用户名
     * @param password 用户密码
     */
    public Admin(String name, String password) {
        this.name = name;
        this.password = password;
    }


    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "admin{" +
                "loginId=" + loginId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Admin admin = (Admin) o;

        if (name != null ? !name.equals(admin.name) : admin.name != null) return false;
        return password != null ? password.equals(admin.password) : admin.password == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
