package cn.ximcloud.itsource.day26._00teacher_s_code._03File;

import java.io.File;
import java.io.IOException;

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
     * 		�ڴ��̴���������ļ���[Ŀ¼]�����ļ�
     *
     * 			 boolean createNewFile() //�ļ�
     * 					1.����ֵ����
     * 					2.�������ڴ��̴������ļ�
     * 			  ע��:���·������,����,�Ҳ���·��
     * 			 ���·��:��������ǵ���Ŀ
     * 			 ����·��:���������·��,�Դ����̷�Ϊ���ֵ�һ��·��
     *
     * 			 boolean mkdir()
     * 			 ע��:�����·��������,�ᱨ��,�Ҳ���·��
                  boolean mkdirs()
                  �����·��,������,�Զ�����

              ɾ��

     * */
    public static void main(String[] args) throws IOException {
        //�ļ��Ĵ���
//		File file = new File("H:/a/b/c/�½��ļ�");//java�����д���һ��File����,����������ôһ������
//		file.createNewFile();
//		File file2 = new File("�½��ļ�.avi");//java�����д���һ��File����,����������ôһ������
//		file2.createNewFile();

        //Ŀ¼�Ĵ���
        File file3 = new File("H:/a/b/c/�½��ļ���.txt");
        //file3.mkdir();
        file3.mkdirs();


    }

}
