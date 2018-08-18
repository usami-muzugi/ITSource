package cn.ximcloud.itsource.before.day20_thread_2._09Bank_syn_code;

public class Test {

    public static void main(String[] args) {
        Bank bank = new Bank();
        GetMoneyThread get = new GetMoneyThread(bank);
        SaveMoneyThread save = new SaveMoneyThread(bank);
        get.start();
        save.start();

		/*while(true){
			new TestThread().start();
		}*/
    }

}
