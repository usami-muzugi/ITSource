package cn.ximcloud.itsource.day17_exception._01exception;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-01
 * Time: 16:17
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 **/
public class _05finally {
    /*
        *finally 语句块儿介绍*
            1.finally语句块:是一个异常处理一定会执行到的代码
            2.作用:关闭流，释放锁
            3.如果钱买你执行了System.exit(0);退出虚拟机，就不会执行
            4.finally里面是*一般是不写return值的*!
                * return是结束方法
                * 虽然catch里面有一个return执行了return，但是finally语句块还没有执行，所以方法并未结束
                * 可以认位返回值被缓存在了i变量当中了，但是由于finally执行并修改了i中得值，所以这里finally返回得是真i
            etc:catch(方法里里面只能接受Throwable的子类)
     */


    public static void main(String[] args) {
        System.out.println(getInt());
    }

    public static int getInt() {
        int i = 10;
        try {
            System.out.println(1 / 0);
            i = 20;
            return i;
        } catch (Exception e) {
            i = 30;
            return i;
        } /*catch (Object o) {//catch(方法里里面只能接受Throwable的子类)
            Incompatible types.
            Required:java.lang.Throwable
            Found:java.lang.Object
        }*/ finally {
            i = 40;
            return i;
        }

    }
}
