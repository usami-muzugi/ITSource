package cn.ximcloud.itsource.day32.teachercode.javaplus.pattern.adapter;

//充电器
public class TwoPort implements ITwoPort {

    @Override
    public void charge() {
        System.out.println("两个接口充电");
    }

}
