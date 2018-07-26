package cn.ximcloud.itsource.day26_io_stream_file._00teacher_s_code._09Methods;

public class Test {
    /*
     * �����ĵݹ����
     * 		�������ڲ�,�Լ������Լ�
     *
     * ͨ��һ��쳲���������,ѧϰ�����ĵݹ����
     * f(0) = 0;
     * f(1) = 1;
     * f(n) =  f(n-1) + f(n-2)  n>=2;
     *
     *
     * f(2) = f(1) + f(0)  1
     * f(3) = f(2) + f(1)  2
     * f(4) = f(3) + f(2)  3
     * f(5) = f(4) + f(3)  5
     *
     *
     * f(100)
     *
     * */
    public static void main(String[] args) {
        System.out.println(f(100));
    }

    public static int f(int n) {
        if (n == 0 || n == 1) {//99%
            return n;
        } else {
            return f(n - 1) + f(n - 2);//�˴����ڵ��÷���,������ʹ�ù�ʽ
        }
    }

}
