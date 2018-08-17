package cn.ximcloud.itsource.day1_day47.day20_thread_2._10Bank_syn_Method;

public class Bank {
    double account;// 账户余额
    boolean empty = true;// 空为true 表示没钱

    //自己寫一個版本,測試如下同步為靜態方法
    public synchronized void get() {// 取钱

        if (empty) {// 没钱
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 取钱
        System.out.println("取钱之前:" + account);
        account -= 1000;
        System.out.println("取钱之后:" + account);
        empty = true;// 设置标识为没钱
        // 唤醒存钱线程
        this.notify();

    }

    public synchronized void save() {// 存钱
        if (!empty) {// 有钱
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 存钱
        System.out.println("存钱之前:" + account);
        account += 1000;
        System.out.println("存钱之后:" + account);
        empty = false;// 设置标识为有钱
        // 唤醒取钱的线程
        this.notify();
    }
}
