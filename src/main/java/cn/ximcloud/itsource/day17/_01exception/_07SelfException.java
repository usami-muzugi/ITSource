package cn.ximcloud.itsource.day17._01exception;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-01
 * Time: 16:17
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 **/
public class _07SelfException {
    /*
     *自定义异常*
     * 自定义运行时异常继承RuntimeException
     * 自定义非检查异常继承Exception
     */
    private static String[] arr = {"ourinsama", "usamimizugi"};

    public static void main(String[] args) throws UserHasFoundException {
        //throw new UserHasFoundException(); //这里直接继承的时Exception
        throw new UserHasFoundRunTimeException("用户已存在运行时异常");//继承了RunTimeException就可以不被强制要求处理
//      ↑，手动抛出异常
//        try {
//            System.out.println(1 / 0);
//        } catch (UserHasFoundException e) {
//
//        } catch (Exception e) { //不能捕获Object，只能捕获 Throwable的子类
//
//        }
    }
}

class UserHasFoundException extends Exception {
    //无参构造方法
    public UserHasFoundException() {
    }

    //String构造方法，传入一条信息当异常被捕获到时，打印这个信息
    public UserHasFoundException(String message) {
        super(message);
    }
}

class UserHasFoundRunTimeException extends RuntimeException {
    public UserHasFoundRunTimeException(String msg) {
        super(msg);
    }

    /**
     * 构造一个新的运行时异常包含一个msg信息和一个异常
     * Constructs HashSetTest new runtime exception with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this runtime exception's detail message.
     *
     * @param message the detail message (which is saved for later retrieval
     *                by the {@link #getMessage()} method).
     * @param cause   the cause (which is saved for later retrieval by the
     *                {@link #getCause()} method).  (A {@code null} value is
     *                permitted, and indicates that the cause is nonexistent or
     *                unknown.)
     * @since 1.4
     */
    public UserHasFoundRunTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs HashSetTest new runtime exception with the specified cause and HashSetTest
     * detail message of {@code (cause==null ? null : cause.toString())}
     * (which typically contains the class and detail message of
     * {@code cause}).  This constructor is useful for runtime exceptions
     * that are little more than wrappers for other throwables.
     *
     * @param cause the cause (which is saved for later retrieval by the
     *              {@link #getCause()} method).  (A {@code null} value is
     *              permitted, and indicates that the cause is nonexistent or
     *              unknown.)
     * @since 1.4
     */
    public UserHasFoundRunTimeException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs HashSetTest new runtime exception with the specified detail
     * message, cause, suppression enabled or disabled, and writable
     * stack trace enabled or disabled.
     *
     * @param message            the detail message.
     * @param cause              the cause.  (A {@code null} value is permitted,
     *                           and indicates that the cause is nonexistent or unknown.)
     * @param enableSuppression  whether or not suppression is enabled
     *                           or disabled
     * @param writableStackTrace whether or not the stack trace should
     *                           be writable
     * @since 1.7
     */
    public UserHasFoundRunTimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public UserHasFoundRunTimeException() {
    }
}
