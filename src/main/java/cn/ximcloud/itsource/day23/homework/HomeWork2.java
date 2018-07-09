package cn.ximcloud.itsource.day23.homework;

import java.util.HashSet;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-09
 * Time: 19:43
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 第二题：HashSet和TreeSet判断对象是否是同一个对象的依据是什么？
 *
 * HashSet判断同是否为一个对象的依据是 hashCode值和equals结果，只当两个都不一样的时候hashSet才判断为非同一个对象
 *
 * 如果我规定Person类中只要Long类型的id和String类型的username相同就表示同一个Person对象，此时代码如何书写？
 **/

public class HomeWork2 {
    public static void main(String[] args) {

        /*
            HashSet
         */
        HashSet<Person> hashSet = new HashSet<>();

//        Random random = new Random();
//        for (int i = 0; i < 2; i++) {
//            hashSet.add(new Person((long) (i + 1), "No." + random.nextInt(10000)));
//        }
        Person person1 = new Person((long) 10086,"移动客服");
        Person person2 = new Person((long) 10000,"电信客服");
        hashSet.add(person1);
        hashSet.add(person2);

        /*
            只有hashcode的值和equals的比较结果都相同，hashset才会确认为一个对象
            [Person{id=10086, username='移动客服'}]
         */
        System.out.println(hashSet);


        System.out.println("---------------------------------------------");
        /*
            TreeSet
         */
    }


}

class Person {
    private Long id;
    private String username;


    public Person() {
    }

    @Override
    public boolean equals(Object object) {
        return true;   //仅equals比较结果相同 返回值[Person{id=10000, username='电信客服'}, Person{id=10086, username='移动客服'}]
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//
//        Person person = (Person) object;
//
//        if (id != null ? !id.equals(person.id) : person.id != null) return false;
//        return username != null ? username.equals(person.username) : person.username == null;
    }

    @Override
    public int hashCode() {
        return 1; //仅hashcode值相同[Person{id=10086, username='移动客服'}, Person{id=10000, username='电信客服'}]
//        int result = id != null ? id.hashCode() : 0;
//        result = 31 * result + (username != null ? username.hashCode() : 0);
//        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public Person(Long id, String username) {
        this.id = id;
        this.username = username;
    }

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
}
