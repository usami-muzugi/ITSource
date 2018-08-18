package cn.ximcloud.itsource.before.day26_io_stream_file._00teacher_s_code._02File;

import java.io.File;

public class TestFile {
    /*
     * File    �ļ���Ŀ¼·�����ĳ����ʾ��ʽ��
     *
     *         ��Ϸ���,������־��Ϣ,ϣ���ڼ���������ܹ�����һ���ļ�[����д�뵽�ļ���]
     *
     *
     * һ����ͨ���������ļ���Ŀ¼��һ������,�����һ������,���Ǿ����һ���ļ�����Ŀ¼
     * 		���췽��

                File(String pathname)
                File(String parent, String child)
     * 			File(File parent, String child)
     * 		����
     *
     *
     * ����file����,�����ļ�����Ŀ¼,ϣ���ڴ�����,�����Ŀ����ļ�,����Ŀ¼������
     *
     * */
    public static void main(String[] args) {
        File file = new File("H:/a/b/c/�½��ļ�.txt");//java�����д���һ��File����,����������ôһ������
        System.out.println(file);
        File file2 = new File("H:/a/b/c/", "�½��ļ�.txt");//java�����д���һ��File����,����������ôһ������
        System.out.println(file2);
        File file3 = new File("H:/a/b/c/");
        File file4 = new File(file3, "�½��ļ�.txt");//java�����д���һ��File����,����������ôһ������
        System.out.println(file4);

    }

}
