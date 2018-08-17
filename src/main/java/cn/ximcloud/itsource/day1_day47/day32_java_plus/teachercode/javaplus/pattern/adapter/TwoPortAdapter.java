package cn.ximcloud.itsource.day1_day47.day32_java_plus.teachercode.javaplus.pattern.adapter;

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
