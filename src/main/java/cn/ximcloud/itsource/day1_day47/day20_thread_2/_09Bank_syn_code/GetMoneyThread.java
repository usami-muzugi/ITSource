package cn.ximcloud.itsource.day1_day47.day20_thread_2._09Bank_syn_code;

public class GetMoneyThread extends Thread {
    Bank bank;

    public GetMoneyThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {//取钱十二次
        for (int i = 0; i < 12; i++) {
            bank.get();
        }
    }
}
