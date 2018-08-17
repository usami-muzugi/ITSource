package cn.ximcloud.itsource.day1_day47.day16_useful_classes._06stringclass;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-01
 * Time: 10:31
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * //                          _ooOoo_                               //
 * //                         o8888888o                              //
 * //                         88" . "88                              //
 * //                         (| ^_^ |)                              //
 * //                         O\  =  /O                              //
 * //                      ____/`---'\____                           //
 * //                    .'  \\|     |//  `.                         //
 * //                   /  \\|||  :  |||//  \                        //
 * //                  /  _||||| -:- |||||-  \                       //
 * //                  |   | \\\  -  /// |   |                       //
 * //                  | \_|  ''\---/''  |   |                       //
 * //                  \  .-\__  `-`  ___/-. /                       //
 * //                ___`. .'  /--.--\  `. . ___                     //
 * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
 * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
 * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
 * //      ========`-.____`-.___\_____/___.-`____.-'========         //
 * //                           `=---='                              //
 * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
 * //         佛祖保佑        永无BUG       永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class _05StringFunctionTest {
    /*
     *  1.测试StringBuilder内部方法
     *  2.字符序列:内部是字符数组在存，字符序列
     *  3.对于数组的操作！增(add)删(del)改(alert)查(select)
     *
     *
     *
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.capacity());
        stringBuilder.append(true);
        stringBuilder.append("书包");
        stringBuilder.append('A');
        stringBuilder.append(10);
        stringBuilder.append("刘耀文");
        //返回的是自己自己对象
        stringBuilder.append("刘耀文").append("李冲").append("牛逼！");
        System.out.println(stringBuilder);
        System.out.println("length = " + stringBuilder.length());
        System.out.println(stringBuilder.capacity());

        /*
            public StringBuilder append(String str) {
                super.append(str);
                return this;    【append继续添加，返回的是this!!】
            }
         */


        /*
            /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}

        @Override
        public StringBuilder delete(int start, int end) {
            super.delete(start, end);
            return this;
        }
         */
        stringBuilder.delete(0, 10);
        System.out.println(stringBuilder);




        /*
            /**
     * For positive values of {@code minimumCapacity}, this method
     * behaves like {@code ensureCapacity}, however it is never
     * synchronized.
     * If {@code minimumCapacity} is non positive due to numeric
     * overflow, this method throws {@code OutOfMemoryError}.

        private void ensureCapacityInternal(int minimumCapacity) {
            // overflow-conscious code
            if (minimumCapacity - value.length > 0) {
                value = Arrays.copyOf(value,
                        newCapacity(minimumCapacity));
            }
        }
         */
        stringBuilder.ensureCapacity(100);
        System.out.println(stringBuilder.capacity());

        /*
            @Override
    public int indexOf(String str) {
        return super.indexOf(str);
    }
         */
        stringBuilder.indexOf("刘耀文");
        String string = "123";
        String string1 = "456";
        System.out.println(string.compareTo(string1));
    }
}
