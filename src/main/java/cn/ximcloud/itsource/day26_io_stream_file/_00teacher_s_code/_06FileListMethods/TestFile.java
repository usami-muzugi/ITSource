package cn.ximcloud.itsource.day26_io_stream_file._00teacher_s_code._06FileListMethods;

import java.io.File;
import java.io.IOException;

public class TestFile {
    /*
     * file�е�ϵ��List����
         static File[] listRoots()
                  �г����õ��ļ�ϵͳ����
     *   String[] list()
                  ����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��
         File[] listFiles()
                  ����һ������·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼�е��ļ���

         String[] list(FilenameFilter filter)
                  ����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼��
         File[] listFiles(FileFilter filter)
                  ���س���·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼��
         File[] listFiles(FilenameFilter filter)
                  ���س���·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼��
     * */
    public static void main(String[] args) throws IOException {
        File file = new File("H:/a");
//		System.out.println(file.list());
//		String[] list = file.list();
//		for (String string : list) {//���صĶ���һ�����·��������
//			System.out.println(string);
//		}
		
		/*for (File fil : file.listFiles()) {//file����·��
			System.out.println(fil);
		}*/

    }
}
