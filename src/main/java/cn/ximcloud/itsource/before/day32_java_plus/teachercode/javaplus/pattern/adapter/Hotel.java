package cn.ximcloud.itsource.before.day32_java_plus.teachercode.javaplus.pattern.adapter;

public class Hotel {

    private ITwoPort twoPort;

    public void setITwoPort(ITwoPort twoPort) {
        this.twoPort = twoPort;
    }

    // 酒店的插座提供的充电功能
    public void charge() {
        twoPort.charge();
    }

}
