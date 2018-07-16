package cn.ximcloud.itsource.day27._99teachercode.itsource_03FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
    /*
     * FileOutputStreamTest
     * 		�ļ�����������ڽ�����д�� File �� FileDescriptor ���������
     * 			����ʹ�������,������д�뵽�ļ���
     * 		�ļ��Ƿ���û��ܷ���Ա�����ȡ���ڻ���ƽ̨��
     * 			�����,�Ƿ����ʹ�ø��ļ�,  �Ƿ������ƽ̨�����ļ�
     * 		�ر���ĳЩƽ̨һ��ֻ����һ�� FileOutputStreamTest���������ļ�д����󣩴��ļ�����д�롣
     * 			������һ��FileOutputSteam�ڲ����ļ���,
     * 		����������£�������漰���ļ��Ѿ��򿪣�������еĹ��췽����ʧ�ܡ�
     *
        FileOutputStreamTest(String name)
                  ����һ�������ָ�����Ƶ��ļ���д�����ݵ�����ļ�����
     *  FileOutputStreamTest(File file)
                  ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������
        FileOutputStreamTest(String name, boolean append)
                  ����һ�������ָ�� name ���ļ���д�����ݵ�����ļ�����
        FileOutputStreamTest(File file, boolean append)
                  ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������



        1.�Ѿ����������ļ�,Ӧ����д�ķ���
             void write(int b)
                      ��ָ���ֽ�д����ļ��������
             void write(byte[] b)
                      �� b.length ���ֽڴ�ָ�� byte ����д����ļ�������С�
             void write(byte[] b, int off, int len)
                      ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����ļ��������
        2.����д�������,������֮ǰ���ļ��е�����
        3.�����ֽ��������ʱ��,���ʹ�õĹ��췽��,�������Ϊtrue,��ʾ���ļ������ݿ���׷��

     * */
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("H:/b/c.txt", true);
        //fos.write(97);//ע��д�������,ʵ���ڼ������,����һ�������Ʊ���,�ʵ�����������뷽ʽ,���ܵõ����
        byte[] bytes = "���������ú�ѽ,ͷ��û��ʪ".getBytes();
        fos.write(bytes);
    }

}
