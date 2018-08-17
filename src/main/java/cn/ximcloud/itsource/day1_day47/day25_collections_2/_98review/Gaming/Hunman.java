package cn.ximcloud.itsource.day1_day47.day25_collections_2._98review.Gaming;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-13
 * Time: 11:18
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public abstract class Hunman implements IHuman {
    //每个人都有名字
    protected String name;

    //年龄
    protected Integer age;

    //员工编号也好身份证编号也好
    protected Integer id;


    //生或死
    boolean flag;

    abstract public boolean isFlag();

    abstract public void setFlag(boolean flag);

    /**
     * 获取这个人的名字
     *
     * @return 返回这个人类的名字
     */
    abstract public String getName();

    /**
     * 设置这个人的名字
     *
     * @param name 传入一个人的名字
     */
    abstract public void setName(String name);

    /**
     * 获得一个人的年龄
     *
     * @return 返回一个Integer类型的年龄
     */
    abstract public Integer getAge();

    /**
     * 设置一个人的年龄
     *
     * @param age 传入一个人的年龄
     */
    abstract public void setAge(Integer age);

    /**
     * 获得这个人的数字信息
     *
     * @return 返回这个人的数字信息
     */
    abstract public Integer getId();

    /**
     * 设置设个人的数字信息
     *
     * @param id 传入一个人的数字信息
     */
    abstract public void setId(Integer id);
}
