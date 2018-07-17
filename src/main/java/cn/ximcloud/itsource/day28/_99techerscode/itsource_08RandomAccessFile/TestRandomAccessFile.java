package cn.ximcloud.itsource.day28._99techerscode.itsource_08RandomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
	/*
	 * RandomAccessFile  牛
	 * 
	 * 		以前的IO流,只能单独的,读和写
	 * 
	 * 但是RandomAccessFile:既可以读,也可以写文件
	 * 支持随机访问文件,读和写
	 * 		随机访问文件:
	 * 		不是在文件夹中,随便的找个文件读和写
	 * 		在一个文件中,文件中数据的任意的位置,进行读写
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		RandomAccessFile rm = new RandomAccessFile("H:/b/c.txt", "rw");
		
		rm.write("Hello a".getBytes());
		long length = rm.length();
		
		long filePointer = rm.getFilePointer();//写入位置偏移量,下次写入数据的位置
		System.out.println(length+"----"+filePointer);
		
		
		//rm.setLength(1024*1024*1024);//用处,比如断点下载,先占用磁盘存储空间
		
		rm.seek(length);//设置文件指针的位置[文件数据的位置,偏移量位置]
		long fp = rm.getFilePointer();//写入位置偏移量,下次写入数据的位置
		System.out.println(length+"----"+fp);
		
		
		rm.write("8888888".getBytes());
		rm.close();

	}

}
