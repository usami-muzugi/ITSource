package cn.ximcloud.itsource.before.day20_thread_2._09Bank_syn_code;

public class SaveMoneyThread extends Thread {
    Bank bank;

    public SaveMoneyThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {//存钱十二次
        for (int i = 0; i < 12; i++) {
            bank.save();
        }
    }
}
