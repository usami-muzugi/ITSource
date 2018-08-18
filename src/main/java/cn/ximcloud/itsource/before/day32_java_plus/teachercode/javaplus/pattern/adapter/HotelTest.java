package cn.ximcloud.itsource.before.day32_java_plus.teachercode.javaplus.pattern.adapter;

import org.junit.Test;

public class HotelTest {

    @Test
    public void testCharge() {
        // 预定一个酒店
        Hotel hotel = new Hotel();
        // 带上一个充电器
        ITwoPort twoPort = new TwoPort();
        // 把充电器对象拿到酒店去
        hotel.setITwoPort(twoPort);
        // 把充电器插到酒店的插座进行充电
        hotel.charge();
        // 将三个孔的充电器,通过适配器对象,插到两个孔的插座上
        IThreePort threePort = new ThreePort();
        TwoPortAdapter adapter = new TwoPortAdapter();
        adapter.setThreePort(threePort);
        hotel.setITwoPort(adapter);
        hotel.charge();

    }

}
