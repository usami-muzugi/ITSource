package cn.ximcloud.itsource.day1_day47.day18_ecplise_se.leveltest;

import java.util.Arrays;

public class _05 {  //没问题，逻辑细节紧密
    /*
    5，在System类中有静态方法public static void arraycopy(
				Object src,
				int srcPos,
				Object dest,
				int destPos,
				int length):
	可以用于数组src从第srcPos项元素开始的length个元素拷贝到目标数组dest从destPos开始的length个元素。
	请自己实现这个方法，可拷贝int类型的一位数组,另可参考System中的各参数的描述，我们的方法可以定义成下面这样：
    public static void arraycopy(int[] src,  int srcPos,  int[] dest, int destPos, int length):

     */


    public static void main(String[] args) {
        int[] src = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] dest = new int[20];
        arrayCopy(src, 0, dest, 2, 5);
        System.out.println(Arrays.toString(dest));
    }


    /**
     * @param src     源数组
     * @param srcPos  源数组起始位置
     * @param dest    目标数组
     * @param destPos 目标数组起始位置
     * @param length  插入的元素个数
     */
    public static void arrayCopy(int[] src, int srcPos, int[] dest, int destPos, int length) {
        //判断为空
        if (src == null || dest == null) throw new ArrayCopyRunTimeException("有数组为null");
        //判断数组下标越界
        if (srcPos < 0 || destPos < 0 || length < 0 || srcPos > src.length || destPos + length > dest.length) {
            throw new ArrayCopyRunTimeException("数组下标越界");
        }

        int[] index = new int[length];
        //1,2,3,4,5,6,7,8,9,0
        //0,1,2,3,4,5,6,7,8,9
        for (int i = 0; i < length; i++) {
            dest[i + destPos] = src[i + srcPos];
        }
    }

}

class ArrayCopyRunTimeException extends RuntimeException {
    public ArrayCopyRunTimeException(String message) {
        super(message);
    }
}
