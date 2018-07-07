package cn.ximcloud.itsource.day19._010Priority;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-04
 * Time: 15:30
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class PriorityTest {
    /*
        优先级
        优先级越高的线程获得到CPU的执行权的概率更高
        int getPrioriry() 返回线程的优先级
        void setPriority(int i) 更改线程的优先级
        static Thread CurrentThread() 返回当前正在执行的线程的对象的引用
        创建的线程，与创建线程的环境有关【线程优先级相同】
                1.自定义线程在JAVA写好的线程中
                2.自定义线程，JAVA的线程，会不会受自定义线程的优先级影响
                3.JAVA线程，在JAVA中
                4.自定义线程在自定义线程中的情况
        本质，就是给线程对象设置优先级，无非就是获得CPU的资源的机会更大，并不一定是县执行
        创建的线程对象，*都要*受创建线程的环境影响
     */
    public static void main(String[] args) {
        /**最低级别的优先级
         * The minimum priority that a thread can have.
         */
        //public static final int MIN_PRIORITY = 1;

        /**标准级别的优先级
         * The default priority that is assigned to a thread.
         */
        //public static final int NORM_PRIORITY = 5;

        /**最高级别的优先级
         * The maximum priority that a thread can have.
         */
        //public static final int MAX_PRIORITY = 10;

        Thread main = Thread.currentThread();//获取当前线程
        //打印当先线程的对象的引用的优先级
        System.out.println("线程默认优先级:" + main.getPriority());
        //main.setPriority(10);

        /*  当传入的参数大于10或者小于1的时候，抛出一个IllegalArgumentException extends RuntimeException
            public final void setPriority(int newPriority) {
                if (newPriority > MAX_PRIORITY || newPriority < MIN_PRIORITY) {
                    throw new IllegalArgumentException();
                }
             }
         */
        main.setPriority(Thread.MAX_PRIORITY);

        /*  返回线程对象的私有字段
            public final int getPriority() {
               return priority;
            }
         */
        System.out.println("线程最高优先级:" + main.getPriority());

        //在最高优先级下创建的线程会收到该线程影响
        Thread thread = new Thread();

        /*  线程的默认命名 Thread-0 1 2 3 4...
            public Thread() {
               init(null, null, "Thread-" + nextThreadNum(), 0);
            }
         */
        System.out.println(thread.getName());
        System.out.println("当前创建的JAVA线程的优先级:" + thread.getPriority());

        MyThread myThread = new MyThread();
        System.out.println("自己搞的线程的优先级:" + myThread.getPriority());//result:10

        myThread.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("在自己搞的线程里面创建的JAVA的对象的当前优先级:" + new Thread().getPriority());

        System.out.println("----------------");
    }
}