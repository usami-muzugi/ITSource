package cn.ximcloud.itsource.day27._05filereader;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-15
 * Time: 15:36
 * ProjectName: ITSource.cn.ximcloud.itsource.day27._05filereader
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

public class FileReadeerTest {

    public void fileReadTest() throws IOException {
        File file = new File("D:/新建文本文档.txt");
        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter(new File("D:/新建文本文档2.txt"));
        int read;
        while ((read = fileReader.read()) != -1) {
            fileWriter.write(read);
            fileWriter.flush();
        }
        fileReader.close();
        fileWriter.close();
    }


    @Test
    public void test() throws IOException {
        fileReadTest();
    }
}
