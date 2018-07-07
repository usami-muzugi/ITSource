package cn.ximcloud.itsource.day20._09Bank_syn_code;

public class Bank {
	double account;//账户余额
	boolean empty = true;//空为true 表示没钱
	public void get(){//取钱
		synchronized (Bank.class) {
			if(empty){//没钱
				try {
					Bank.class.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//取钱
			System.out.println("取钱之前:"+account);
			account-=1000;
			System.out.println("取钱之后:"+account);
			empty = true;//设置标识为没钱
			//唤醒存钱线程
			Bank.class.notify();
		}
	}
	public void save(){//存钱
		synchronized (Bank.class) {
			if(!empty){//有钱
				try {
					Bank.class.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//存钱
			System.out.println("存钱之前:"+account);
			account+=1000;
			System.out.println("存钱之后:"+account);
			empty = false;//设置标识为有钱
			//唤醒取钱的线程
			Bank.class.notify();
		}
	}
}
