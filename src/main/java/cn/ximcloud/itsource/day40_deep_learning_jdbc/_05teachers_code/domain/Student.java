package cn.ximcloud.itsource.day40_deep_learning_jdbc._05teachers_code.domain;

public class Student {
    private Long id;
    private String username;
    private String password;
    private String intro;
    private Integer age;
    private Boolean sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", username=" + username + ", password=" + password + ", intro=" + intro + ", age="
                + age + ", sex=" + sex + "]";
    }

}
