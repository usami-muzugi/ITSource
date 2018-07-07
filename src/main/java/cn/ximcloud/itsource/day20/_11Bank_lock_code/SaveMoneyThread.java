package cn.ximcloud.itsource.day20._11Bank_lock_code;

public class SaveMoneyThread extends Thread{
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
