package cn.ximcloud.itsource.day17._01exception;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-03
 * Time: 10:11
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
 * //         佛祖保佑        永无BUG       永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class _06TresThrow {
    /*
     *  抛出的异常存在的问题:
     *      *一个类，时用来描述一类事物，:NullPointException
     *      *NullPontException用来描述账户已存在不合适
     *      *应该使用什么异常来描述呢？
     *          我们在实际开发的时候，业务存在的问题可能千变万化
     *          Java已经存在的异常可能不能满足我们
     *          这时我们可以自定义异常
     *
     */
    public static void main(String[] args) {
        User user = new User("usami", "mizugi");
        User user1 = new User("usami", "mizugi");
        User user2 = new User("ourinsama", "ourinsama");

        try {
            login(user, user1);
            login(user2, user1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        /*
            运行时异常和编译时异常都是异常的子类，然是运行时异常时不检查的异常
            所以当一个方法抛出异常的时候，调用它的方法可以不用处理这个异常。
            但是编译时异常，调用他的方法就要处理这个异常
         */
    }

    private static boolean login(User user1, User user2) throws Exception {
        if (user1.equals(user2)) {  //如果这两对象的字段都相同
            System.out.println("该用户已存在");
            throw new NumberFormatException(user1.toString());//我们就抛出一个异常，这里应该抛出一个编译时异常比较好
            /*
                public NumberFormatException (String s) {
                   super (s);
                }
             */
        } else {
            System.out.println("还行");
            return true;
        }

    }
}

/*
    用户的比较可以使用
 */
class User {
    //一个标标准准的JAVA Bean
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
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
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

