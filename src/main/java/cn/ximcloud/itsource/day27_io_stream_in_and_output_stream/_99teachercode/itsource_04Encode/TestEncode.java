package cn.ximcloud.itsource.day27_io_stream_in_and_output_stream._99teachercode.itsource_04Encode;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TestEncode {
    /*
     *
    i.����  : String  --->  byte[]
        String���ж�Ӧ�ķ���:
        byte[] getBytes() ʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte ����
            ��ǰ�ļ�,���ñ��뷽ʽGBK
        byte[] getBytes(String charsetName) ʹ��ָ�����ַ������������ַ���
            ��������,ָ�����뷽ʽ
        byte[] getBytes(Charset charset) ʹ��ָ�����ַ������������ַ���


    ii.����  : byte[]  --->  String
        String���ж�Ӧ�Ĺ��췽��:
        String(byte[] bytes) ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte ����
            ��ǰ�ļ�,���ñ��뷽ʽGBK
        String(byte[] bytes, String charsetName) ʹ��ָ�����ַ���������ָ����byte����
        String(byte[] bytes, Charset charset) ʹ��ָ�����ַ���������ָ����byte����
     * */
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = "��������".getBytes();
        System.out.println(new String(bytes, "GBK"));
        System.out.println(Arrays.toString(bytes));

        byte[] bytes2 = "��������".getBytes("utf-8");
        System.out.println(Arrays.toString(bytes2));
        System.out.println(new String(bytes2, "utf-8"));
    }

}
