package cn.ximcloud.itsource.before.day20_thread_2._11Bank_lock_code;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    double account;//账户余额
    boolean empty = true;//空为true 表示没钱
    Lock lock = new ReentrantLock();
    Condition con = lock.newCondition();

    public void get() {//取钱
        lock.lock();
        try {
            if (empty) {//没钱
                try {
                    con.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //取钱
            System.out.println("取钱之前:" + account);
            account -= 1000;
            System.out.println("取钱之后:" + account);
            empty = true;//设置标识为没钱
            //唤醒存钱线程
            con.signal();
        } finally {
            lock.unlock();
        }

    }

    public void save() {//存钱
        lock.lock();
        try {
            if (!empty) {//有钱
                try {
                    con.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //存钱
            System.out.println("存钱之前:" + account);
            account += 1000;
            System.out.println("存钱之后:" + account);
            empty = false;//设置标识为有钱
            //唤醒取钱的线程
            con.signal();
        } finally {
            lock.unlock();
        }

    }
}
