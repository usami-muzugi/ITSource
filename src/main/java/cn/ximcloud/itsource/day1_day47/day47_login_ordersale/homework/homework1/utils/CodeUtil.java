package cn.ximcloud.itsource.day1_day47.day47_login_ordersale.homework.homework1.utils;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-16
 * Time: 14:31
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day47_login_ordersale.homework.homework1.utils
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

public class CodeUtil {
    private CodeUtil(){}


    public static boolean auth(HttpServletRequest httpServletRequest) {
        return httpServletRequest.getParameter("code").equalsIgnoreCase((String) httpServletRequest.getSession().getAttribute("RANDOMCODE_IN_SESSION"));
    }

    /**
     * 获得验证码 和设置Session
     * @param httpServletRequest 请求对象
     * @param httpServletResponse 响应对象
     * @throws IOException  IO异常
     */
    public static void getCodeImg(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {


        //生成随机数
        String randomCode = UUID.randomUUID().toString().substring(0, 5);

        //把随机数放进Session中
        httpServletRequest.getSession().setAttribute("RANDOMCODE_IN_SESSION", randomCode);

        //创建图片对象
        int width = 100;
        int height = 40;
        int imageType = BufferedImage.TYPE_INT_RGB;
        BufferedImage image = new BufferedImage(width, height, imageType);

        //画板
        Graphics g = image.getGraphics();
        g.setColor(Color.WHITE);
        //绘制一个实心的矩形
        g.fillRect(1, 1, width - 2, height - 2);

        //把随机数画进图片中
        g.setColor(Color.BLACK);//设置随机数的颜色
        Font font = new Font("宋体", Font.BOLD + Font.ITALIC, 20);
        g.setFont(font);//设置随机数的字体和大小
        g.drawString(randomCode, 10, 28);
        //干扰线
        g.setColor(Color.GRAY);
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            g.fillRect(r.nextInt(width), r.nextInt(height), 2, 2);
        }
        //关闭
        g.dispose();
        //把图片对象以流的方式保存出去
        ImageIO.write(image, "jpg", httpServletResponse.getOutputStream());
    }
}
