package cn.ximcloud.itsource.before.day20_thread_2._10Bank_syn_Method;

public class Test {

    public static void main(String[] args) {
        Bank bank = new Bank();
        GetMoneyThread get = new GetMoneyThread(bank);
        SaveMoneyThread save = new SaveMoneyThread(bank);
        get.start();
        save.start();


    }

}
