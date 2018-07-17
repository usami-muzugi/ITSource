package cn.ximcloud.itsource.day28._99techerscode.itsource_01IOException;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestFileCopy {
	/*
	 * IO流中的异常处理
	 *		传统的处理方法①
	 *			try{
	 *				可能发生异常的代码块
	 *			}catch(异常类型 形式参数){
	 *				捕获异常之后要做的处理
	 *			}finally{
	 *				异常语句块一定会执行的代码块,释放锁,关闭流资源
	 *			}
	 * 		java1.7之後新的處理方式
	 *          自动关闭的流资源,必须是实现了AutoCloseable
	 *          FileInputStream extends InputStream implements Closeable extends AutoCloseable
	 * 			try(需要自动关闭的流资源){
	 * 				可能发生异常的代码块
	 * 			}catch(){
	 * 				捕获异常之后要做的处理
	 * 			}finally{
	 * 				异常语句块一定会执行的代码块,释放锁,关闭流资源
	 * 			}
	 * 
	 * */
	public static void main(String[] args){
		copyFile("F:/Java180606/Java180606/2018-06-16-Java数组-DAY07/video/13_值传递值引用.avi","H:/b/13");
	}
	public static void copyFile(String src,String dest){
		//java1.7之后新的处理方式
		try(
				FileInputStream fis = new FileInputStream(src);
				FileOutputStream fos = new FileOutputStream(dest);
		){
			byte[] b = new byte[1024];
			int len;
			while((len = fis.read(b)) != -1){
				fos.write(b,0,len);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	
		//传统处理方式
		/*FileInputStream fis = null;//局部变量,在使用之前应该初始化
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dest);
			byte[] b = new byte[1024];
			int len;
			while((len = fis.read(b)) != -1){
				fos.write(b,0,len);
			}
		} catch (Exception e) {
			e.printStackTrace();//获取异常信息
		}finally{
			try {//先使用后关闭
				if(fos != null)
					fos.close();
				if(fis != null )
					fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}
}
