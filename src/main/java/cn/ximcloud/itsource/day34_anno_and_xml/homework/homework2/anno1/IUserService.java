package cn.ximcloud.itsource.day34_anno_and_xml.homework.homework2.anno1;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-28
 * Time: 22:41
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
public interface IUserService {
    /**
     * 添加一个User
     */
    void addUser(User user);

    /**
     * 修改User
     */
    void updateUser(User user);

    /**
     * 删除User
     */
    void deleteUser(User user);

    /**
     * 查找User
     */
    void findAll();

    /**
     * 登录认证
     * @param name 姓名
     * @param password  密码
     * @return 如果验证成功 返回这个user，如果验证失败返回null
     */
    User login(String name,String password);
}
