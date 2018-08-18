package cn.ximcloud.itsource.before.day27_io_stream_in_and_output_stream._99teachercode.itsource_05TestFileReader;

import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    /*
     * �ַ������:FileReader
     *
        FileReader(String fileName)
                  �ڸ������ж�ȡ���ݵ��ļ���������´���һ���� FileReader��
     * 	FileReader(File file)
                 �ڸ������ж�ȡ���ݵ� File ������´���һ���� FileReader��


               ���Ҷ�ȡ�ķ���:��ȡ���ǵ����ַ�[ �������ݵĶλ��һ���ַ� ][�����ֽ�  - GBK �ɱ���뷽ʽ���ֽ�,˫�ֽ�]
             int read()
                      ��ȡ�����ַ���
             int read(char[] cbuf, int offset, int length)
                      ���ַ����������е�ĳһ���֡�
     * */
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("H:/b/c.txt");
//		int read1 = fr.read();
//		int read2 = fr.read();
//		System.out.println((char)read1);
//		System.out.println((char)read2);
        //��ʽ�ٵ����ַ��Ķ�ȡ,ʹ��while��ȡ�����е�����
//		int read;
//		while((read=fr.read())!=-1){
//			System.out.print((char)read);
//		}
        //��ʽ��
        char[] ch = new char[3];
        int len;
        while ((len = fr.read(ch)) != -1) {
            System.out.println(ch);
            System.out.println("------------------------->" + new String(ch, 0, len));
        }
    }

}
