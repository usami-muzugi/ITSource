package cn.ximcloud.itsource.before.day26_io_stream_file._00teacher_s_code._08FileFilter;

import java.io.File;
import java.util.Arrays;

public class TestFileFilter {
    /*
     *  String[] StudentList(FilenameFilter filter)
                  ����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼��
         File[] listFiles(FilenameFilter filter)
                  ���س���·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼��


         File[] listFiles(FileFilter filter)
                  ���س���·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼��
     * */
    public static void main(String[] args) {
        File file = new File("H:/a");
//		MyFilenameFilter mff = new MyFilenameFilter();
//		File[] listFiles = file.listFiles(mff);
//		System.out.println(Arrays.toString(listFiles));

        MyFileFilter mfi = new MyFileFilter();
        File[] listFiles2 = file.listFiles(mfi);
        System.out.println(Arrays.toString(listFiles2));

    }

}
