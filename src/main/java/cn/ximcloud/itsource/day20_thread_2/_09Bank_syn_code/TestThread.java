package cn.ximcloud.itsource.day20_thread_2._09Bank_syn_code;

public class TestThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("测试>......");
        }
    }
}
