package cn.ximcloud.itsource.day32.teachercode.javaplus.pattern.wrapper;

/*
 * 需求: StringUitl这个类已经不能满足判断字符串是否为空的功能,
 * 		需要使用装饰者模式,将StringUitl这个类包装一下
 *
 * */
public class StringWrapper {

    private StringUtil util;

    // 通过构造传入被包装的对象
    public StringWrapper(StringUtil util) {
        this.util = util;
    }

    /*
     * 这个方法用于判读字符串是否为空 条件: null, 空字符串
     */
    public boolean isEmpty(String str) {
        boolean tf = util.isEmpty(str);
        // 如果util.isEmpty方法返回的是false,则需要继续判断该str是否为"",是空字符串我们也认为是空,也应该返回true;
        // 如果util.isEmpty方法返回的是true,则说明str==null;
        if (!tf) {
            return str.length() == 0;
        }
        return true;
    }

}
