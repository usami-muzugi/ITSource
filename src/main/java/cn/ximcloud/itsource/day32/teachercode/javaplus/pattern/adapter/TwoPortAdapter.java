package cn.ximcloud.itsource.day32.teachercode.javaplus.pattern.adapter;

public class TwoPortAdapter implements ITwoPort {

    private IThreePort threePort;

    public void setThreePort(IThreePort threePort) {
        this.threePort = threePort;
    }

    // 用于实现适配功能:将三个的插座转换为两个孔的插座
    @Override
    public void charge() {
        threePort.charge();
    }

}
