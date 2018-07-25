package cn.ximcloud.itsource.day23.zixi.OverrideHashCodeAndEqualsMethod;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-10
 * Time: 11:25
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class OverrideHashCodeAndEuqalsV2 {
    private String name;
    private int age;

    public OverrideHashCodeAndEuqalsV2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        OverrideHashCodeAndEuqalsV2 that = (OverrideHashCodeAndEuqalsV2) object;

        if (age != that.age) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
