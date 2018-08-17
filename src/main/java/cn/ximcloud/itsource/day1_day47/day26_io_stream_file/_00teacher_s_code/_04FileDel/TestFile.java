package cn.ximcloud.itsource.day1_day47.day26_io_stream_file._00teacher_s_code._04FileDel;

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

              ɾ��:boolean delete()
                          ɾ���˳���·������ʾ���ļ���Ŀ¼��
              ɾ��Ŀ¼
                  1.�������Ŀ¼������,ɾ������false
                  2.�������Ϊ��ֱ��ɾ��
                  3.�����Ϊ��,����ɾ����
              ɾ���ļ�
                  1.�ļ�����ֱ��ɾ����
                  2.�ļ��������ֱ�ӷ���false

         ˼��: ���һ������,���һ��File�����ĳ���Ŀ¼[Ϊ�ջ��߲�Ϊ��]�����ļ�

     * */
    public static void main(String[] args) throws IOException {
        File file3 = new File("H:/a/b/c/a.txt");
        System.out.println(file3.delete());
        ;

    }

    /*
     * 1. ѧ�귽���ݹ�֮ǰ,��Ҫ��
     * 2. ��Ҫ��C����[��Ҫ�嶯.....]   Ҳ��Ҫ������
     * 3. ���Ҫ��,׼��һ��,����һ��
     * */
    public static void deleteAll(File file) {
        /*
         * 1.�ǿ��ж�
         * 2.�ж��ļ��Ƿ����:boolean exists()
         * 3.�жϵ������ļ������ļ���
         * 	  �ļ�  :  ֱ��ɾ��
         * 	  �ļ���[a]  :  �ṩ���з���  File[] fil = a.FileList()
         * 				for(File file:fil){
         * 					deleteAll(file);
         * 					�ж����ļ������ļ���
         *	  					�ļ�:ֱ��ɾ��
         *	  					�ļ���:�ṩ����...
         * 							�ļ�
         * 				}
         * 			a.delete();
         * */

    }


    public static void deleteAll(String pathName) {

    }

}
