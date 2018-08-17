package cn.ximcloud.itsource.day1_day47.day26_io_stream_file._00teacher_s_code._08FileFilter;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilenameFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
//		System.out.println(dir);
//		System.out.println(name);

        return name.endsWith("avi");
    }

}
