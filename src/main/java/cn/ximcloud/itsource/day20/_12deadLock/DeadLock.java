package cn.ximcloud.itsource.day20._12deadLock;

public class DeadLock {

    /*
            冷静分析:
            Lock1 running
            Lock1 lock obj1
            Lock2 running
            Lock2 lock obj2

            创建了两个线程对象，然后启动start方法。
            然后两个线程开始被JVM随机调度。
            当线程1被调度到的时候，CPU开始执行，分配资源。
            执行线程1当中的run方法，执行try结构体当中的语句
            打印Lock1 running
            当后执行wile无限循环，然后同步代码块，监听对象obj1
            打印Lock1 lock obj1
            然后线程休眠3秒钟，给线程2足够的时间运行
            然后线程2开始执行run方法
            打印Lock2 running
            同步监听对象 DeadLock.obj2
            打印Lock1 lock obj1
            然后休眠3秒中，
            这个时候就该轮到线程1继续执行了
            线程1休眠好了继续执行下面的同步监听对象DeadLock.obj2，但是DeadLock.obj2是锁住的。没有钥匙，只能等其他线程释放锁，然能继续执行。
            所以只能等待了，这个时候，等待到一定时间了，CPU的时间片这个线程1用完了，就该轮到线程2使用了
            轮到线程2，线程2睡眠完毕，执行同步监听对象DeadLock.obj1，但是DeadLock.obj1是被锁住的。只能等待其他线程释放锁后，参能继续执行。

            所以，最终的结果是，两个线程都在等待对方释放锁，但是由于CPU时间片所以是切换着的等待释放锁。

            最终，两个线程都没有执行完，所以就都没有死掉。就这样子，JVM无法关闭。

            Lock1 running
            Lock2 running
            Lock1 lock obj1
            Lock2 lock obj2

            这种就是线程一执行了打印之后，切换到线程2，或者是执行了打印，然后是while循环之后切换到了线程2
            然后线程2也是这样子，
            然后线程1开始了同步监听obj1开始，打印下obj1，然后睡眠
            然后是线程2开始了，同步监听2开始，打印下obj2，然后睡眠
            然后就出现死锁，就这样在


            Lock1 running
            打印后前
            while之后
            Lock2 running
            Lock1 lock obj1
            打印后前
            while之后
            Lock2 lock obj2

     */
    public static String obj1 = "obj1"; //一个对象obj1 使用同步监听使用
    public static String obj2 = "obj2"; //一个对象obj2 使用同步监听使用

    public static void main(String[] args) {
        Thread a = new Thread(new Lock1()); //创建两个使用Runnable实现的线程对象
        Thread b = new Thread(new Lock2());
        a.start();  //调用线程对象的.start方法启动线程
        b.start();
    }
}

class Lock1 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Lock1 running");
            System.out.println("打印后前");
            while (true) {
                System.out.println("while之后");
                synchronized (DeadLock.obj1) {
                    System.out.println("Lock1 lock obj1");
                    Thread.sleep(3000);//获取obj1后先等一会儿，让Lock2有足够的时间锁住obj2
                    synchronized (DeadLock.obj2) {
                        System.out.println("Lock1 lock obj2");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Lock2 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Lock2 running");
            System.out.println("打印后前");
            while (true) {
                System.out.println("while之后");
                synchronized (DeadLock.obj2) {
                    System.out.println("Lock2 lock obj2");
                    Thread.sleep(3000);
                    synchronized (DeadLock.obj1) {
                        System.out.println("Lock2 lock obj1");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}