package cn.ximcloud.itsource.day23_collection_2.zixi.OverrideHashCodeAndEqualsMethod;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-10
 * Time: 10:50
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class OverrideHashCodeAndEquals {
    private String name;
    private int age;


    @Override
    public int hashCode() {
        int result = 31;//31是一个素数
        if (name == null) {
            return result * age;
        } else {
            return result * name.hashCode() + age;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof OverrideHashCodeAndEquals)) return false;
        OverrideHashCodeAndEquals that = (OverrideHashCodeAndEquals) obj;
        if (this.age == that.age) {
            return this.name.equals(that.name);
        } else {
            return false;
        }
    }
}
