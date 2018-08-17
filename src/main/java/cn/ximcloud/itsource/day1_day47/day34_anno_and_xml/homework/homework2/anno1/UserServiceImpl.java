package cn.ximcloud.itsource.day1_day47.day34_anno_and_xml.homework.homework2.anno1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-28
 * Time: 22:41
 * ProjectName: ITSource
 * To change this template use File | Settings | File Templates.
 * ////////////////////////////////////////////////////////////////////
 **/
public class UserServiceImpl implements IUserService {

    //模拟系统中的用户
    private static List<User> userList = Arrays.asList(new User("admin", "0000"), new User("张三", "111"));

    /**
     * 添加一个User
     */
    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    /**
     * 修改User
     */
    @Override
    public void updateUser(User user) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getName().equals(user.getName())) {
                userList.set(i, user);
                return;
            }
        }
    }

    /**
     * 删除User
     */
    @Override
    public void deleteUser(User user) {
        userList.remove(user);
    }

    /**
     * 查找User
     */
    @Override
    public void findAll() {
        for (User user : userList) {
            System.out.println(user);
        }
    }

    /**
     * 登录认证
     *
     * @param name     姓名
     * @param password 密码
     * @return 如果验证成功 返回这个user，如果验证失败返回null
     */
    @Override
    public User login(String name, String password) {
        for (User user : userList) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
