package cn.ximcloud.itsource.day27._98test;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-17
 * Time: 08:28
 * ProjectName: ITSource.cn.ximcloud.itsource.day27._98test
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



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeWork {

    public static void main(String[] args) throws FileNotFoundException  {
        File file = new File("F:/java 视频/面向对象/新建");
        getList(file,"F:/1/2/");


    }

    /**找出目录下面的指定的所有的视频文件
     * @param file
     * @param str
     * @throws FileNotFoundException
     */
    public static void getList(File file,String str) throws FileNotFoundException{
        if(file == null || !file.exists())
            return;
        FileInputStream fileI= new FileInputStream(file);

        if(file.isFile()&&file.getName().endsWith("avi")){
            String name = file.getName();
            FileOutputStream fileO = new FileOutputStream(str+name,true);

            byte[] by = new byte[1024];
            int len;
            try {
                while((len = fileI.read(by)) !=-1){
                    fileO.write(by,0,len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileO.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(file.isDirectory()){
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                //此处递归了,会查找每一个文件夹,
                getList(file2,str);
            }
        }
    }
}
