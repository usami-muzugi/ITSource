package cn.ximcloud.itsource.day1_day47.day26_io_stream_file._00teacher_s_code._05FileMethods;

import java.io.File;
import java.io.IOException;

public class TestFile {
    /*
     * file�е�ϵ�з���
     *
     *
     *
     *
     *
     * */
    public static void main(String[] args) throws IOException {
        File file3 = new File("H:/a/b/c/a.txt");
        //boolean canExecute()  ����Ӧ�ó����Ƿ����ִ�д˳���·������ʾ���ļ���
        System.out.println(file3.canExecute());
		/*
		 * File getAbsoluteFile() ���ش˳���·�����ľ���·������ʽ�� 
           String getAbsolutePath() ���ش˳���·�����ľ���·�����ַ����� 
		 * */

        System.out.println(file3.getAbsolutePath());
        System.out.println(new File("�½��ļ�.avi").getAbsolutePath());
		
		/*
		 * boolean isDirectory() 
          		���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼�� 
 			boolean isFile() 
          		���Դ˳���·������ʾ���ļ��Ƿ���һ����׼�ļ���
          		
          		 
			���ļ�����Ŀ¼�ڴ����и���������
		 * */
		
		/*
		 * static File[] listRoots() 
          �г����õ��ļ�ϵͳ���� 
		 * */
        File[] listRoots = File.listRoots();
        for (File file : listRoots) {
            System.out.println(file);
        }

    }
}
