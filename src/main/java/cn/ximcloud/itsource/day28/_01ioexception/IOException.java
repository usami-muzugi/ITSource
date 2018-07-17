package cn.ximcloud.itsource.day28._01ioexception;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-17
 * Time: 10:10
 * ProjectName: ITSource.cn.ximcloud.itsource.day28._01ioexception
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
 *
 * IO流中的异常处理方式
 *
 *  第一种:
 *      try...catch...finally
 *      try{
 *         可能发生异常的代码块儿
 *         【System.exit(0)】
 *      }catch(异常类型 异常对象){
 *          异常对象处理和
 *          捕获异常之后要执行的操作
 *      }finally{
 *          （那么时候执行不到，在try中执行了关闭虚拟机）
 *          异常语句块儿一定会执行
 *          关闭流资源
 *      }
 *  第二种:
 *      抛出 throw
 *
 * 第三种:
 *  java1.7以后
 *      try(需要自动关闭的流资源){
 *         可能发生异常的代码块儿
 *         【System.exit(0)】
 *      }catch(){
 *          异常对象处理和
 *          捕获异常之后要执行的操作
 *      }finally{
 *          （那么时候执行不到，在try中执行了关闭虚拟机）
 *          异常语句块儿一定会执行
 *      }
 **/

public class IOException {
    
    @Test
    public void IOExceptionTestOne() {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(new File("D:/a.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void IOExceptionTestTwo() {
        //java1.7之后 try() 里面可以自动关闭实现了AutoCloseable 接口的类
        try (
                FileInputStream fileInputStream = new FileInputStream("");
                FileOutputStream fileOutputStream = new FileOutputStream("")
                ) {
            fileInputStream.read();
            fileOutputStream.write(1);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
