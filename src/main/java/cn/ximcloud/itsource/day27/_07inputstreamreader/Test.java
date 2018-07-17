package cn.ximcloud.itsource.day27._07inputstreamreader;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-16
 * Time: 14:10
 * ProjectName: ITSource.cn.ximcloud.itsource.day27._07inputstreamreader
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
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class Test {

    /**
     * InputStreamReader(InputStream in)
     * 创建一个使用默认字符集的 InputStreamReader。
     * <p>
     * 字节流转字符流,通过构造方法的方式
     * <p>
     * OutputStreamWriter(OutputStream out)
     * 创建使用默认字符编码的 OutputStreamWriter。
     *
     * @throws FileNotFoundException
     */
    public void test() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D/");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);


        FileOutputStream fileOutputStream = new FileOutputStream("");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
    }
}
