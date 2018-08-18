package cn.ximcloud.itsource.before.day26_io_stream_file._00teacher_s_code._08FileFilter;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
//		System.out.println(pathname.getName());
//		System.out.println(pathname.getPath());
//		System.out.println(pathname.getAbsolutePath());
        String name = pathname.getName();
        return name.endsWith("txt");
    }

}
