package cn.ximcloud.itsource.day1_day47.day26_io_stream_file._00teacher_s_code._07MyFileFilter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TestFile {
    /*
     *        �Զ���File������
     * */
    public static void main(String[] args) throws IOException {
        File file = new File("H:/a");
        String[] myFileFilter = myFileFilter(file, "java");
        System.out.println(Arrays.toString(myFileFilter));

    }

    public static String[] myFileFilter(File file, String suffix) {
        String[] list = file.list();
        ArrayList<String> arrayList = new ArrayList<>();
        for (String string : list) {
            if (string.endsWith(suffix)) {
                arrayList.add(string);
            }
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }
}
