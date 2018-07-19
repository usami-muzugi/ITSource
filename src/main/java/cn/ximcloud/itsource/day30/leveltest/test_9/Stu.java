package cn.ximcloud.itsource.day30.leveltest.test_9;

public class Stu {
    //Standard JAVA Bean
    private String stuNum;//学号
    private String name;//姓名
    private String gender;//性别
    private int age;//年龄
    private int score;//分数

    public Stu() {
        super();
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}