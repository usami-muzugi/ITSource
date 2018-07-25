package cn.ximcloud.itsource.day32.teachercode.javaplus.pattern.adapter;

//充电器
public class ThreePort implements IThreePort {

    @Override
    public void charge() {
        System.out.println("三个接口充电");
    }

}
