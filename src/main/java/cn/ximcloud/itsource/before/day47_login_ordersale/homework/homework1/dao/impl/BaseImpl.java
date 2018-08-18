package cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.dao.impl;

import cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.dao.IBaseDao;
import cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.utils.JDBCUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wizard
 * @date: 2018-08-16
 * Time: 10:05
 * ProjectName: itsource.cn.ximcloud.itsource.before.day47_login_ordersale.homework.homework1.dao.impl
 * To change this template use File | Settings | Editor | File and Code Templates.
 * <p>
 * you are not expected to understand this.
 * <p>
 * ////////////////////////////////////////////////////////////////////
 * //                          _ooOoo_                               //
 * //                         o8888888o                              //
 * //                         88" . "88                              //
 * //                         (| ^_^ |)                              //
 * //                         O\  =  /O                              //
 * //                      ____/`---'\____                           //
 * //                    .'  \\|     |//  `.                         //
 * //                   /  \\|||  :  |||//  \                        //
 * //                  /  _||||| -:- |||||-  \                       //
 * //                  |   | \\\  -  /// |   |                       //
 * //                  | \_|  ''\---/''  |   |                       //
 * //                  \  .-\__  `-`  ___/-. /                       //
 * //                ___`. .'  /--.--\  `. . ___                     //
 * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
 * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
 * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
 * //      ========`-.____`-.___\_____/___.-`____.-'========         //
 * //                           `=---='                              //
 * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public abstract class BaseImpl<T> implements IBaseDao<T> {

    /**
     * 每一个继承这个类的子类，都需要一个JDBCUtil实例
     */
    protected JDBCUtil instance;

    /**
     * 内置字段tClass 获取运行时类型
     */
    private Class<T> tClass;
    /**
     * tClass类名
     */
    private String simpleName;
    /**
     * 字段
     */
    private Field[] declaredFields;
    /**
     * 构造器
     */
    private Constructor<T> constructor;

    /**
     * 没有无参构造方法，意味着子类继承这个BaseImpl类的话，必须调用下这个方法才能生成对象
     */
    public BaseImpl(Class<T> tClass) {
        this.tClass = tClass;
//        获取类名而非绝对限定名
        simpleName = tClass.getSimpleName();
//        System.out.println("SimpleName:" + simpleName);
//        获取所有的字段包括私有的
        declaredFields = tClass.getDeclaredFields();
//        System.out.println("declaredField:" + Arrays.toString(declaredFields));
        try {
//            获取构造方法，用于创建对象
            constructor = tClass.getConstructor();
        } catch (NoSuchMethodException e) {
            System.out.println("构造IBase:构造方法获取失败");
            e.printStackTrace();
        }
        instance = JDBCUtil.getInstance();
    }

    /**
     * @param id       id
     * @param password password
     * @return t
     */
    @Override
    public T login(Long id, String password) {
        T t = null;
        if ((t = find(id)) != null) {
            try {
                Field pwd = tClass.getDeclaredField("password");
                pwd.setAccessible(true);
                if ((pwd.get(t)).equals(password)) {
//                    id正确，密码正确
                    return t;
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return t;
    }

    /**
     * @param username username
     * @param password password
     * @return 如果登录成功，返回一个T的实例，如果登录失败，返回null
     */
    @Override
    public T login(String username, String password) {
        T t = null;
        try {
//            能被格式化，就调用login(Long id, String password)
            return login(Long.valueOf(username), password);
        } catch (NumberFormatException e) {
//            不能被格式化
            Connection connection = instance.getConnection();
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            final String sql = "SELECT id FROM " + simpleName + " WHERE " + declaredFields[1].getName() + "=?";
            System.out.println(sql);
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, username);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    t = login(resultSet.getLong(1), password);
                    break;
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            } finally {
                instance.close(resultSet, preparedStatement, connection);
            }
        }
        return t;
    }

    /**
     * 增
     *
     * @param t 一个对象
     */
    @Override
    public void save(T t) {
        Connection connection = instance.getConnection();
        PreparedStatement preparedStatement = null;
//        少一个字段的数量,新字段数组,新对象没有id的
        Field[] tempFields = new Field[declaredFields.length - 1];
        System.arraycopy(declaredFields, 1, tempFields, 0, declaredFields.length - 1);
//        字段和值
        StringBuilder keys = new StringBuilder();
        StringBuilder values = new StringBuilder();

        for (Field tempField : tempFields) {
            keys.append(tempField.getName()).append(",");
            values.append("?,");
        }
        final String sql = "INSERT INTO " + simpleName + " (" + keys.toString().substring(0, keys.length() - 1) + ") VALUES (" + values.toString().substring(0, values.length() - 1) + ")";
        System.out.println(sql);

        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 1; i <= tempFields.length; i++) {
                Field declaredField = declaredFields[i];
                declaredField.setAccessible(true);
                preparedStatement.setObject(i, declaredField.get(t));
            }
            preparedStatement.executeUpdate();
        } catch (SQLException | IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            instance.close(null, preparedStatement, connection);
        }
    }

    /**
     * 删
     *
     * @param id 一个对象的id主键
     */
    @Override
    public void delete(Long id) {
//        获取连接对象，并获取PreparedStatement
        Connection connection = instance.getConnection();
        PreparedStatement preparedStatement = null;
//        标准查询语句
        final String sql = "DELETE From " + simpleName + " WHERE id=?";
        System.out.println(sql);
        try {
//            执行查询语句
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(null, preparedStatement, connection);
        }
    }

    /**
     * 改
     *
     * @param t 一个对象
     */
    @Override
    public void update(T t) {
//        获取连接
        Connection connection = instance.getConnection();
        PreparedStatement preparedStatement = null;
        StringBuilder stringBuffer = new StringBuilder();
        try {
            Long id = null;
//            拼接SQL语句
            for (int i = 0; i < declaredFields.length; i++) {
                stringBuffer.append(declaredFields[i].getName()).append("=").append("?");
                if (i < declaredFields.length - 1) {
                    stringBuffer.append(",");
                }
            }
//            拼接id
            Field tempId = tClass.getDeclaredField("id");
            tempId.setAccessible(true);
            id = (Long) tempId.get(t);
            stringBuffer.append(" WHERE id=").append(id);
            final String sql = "UPDATE " + simpleName + " SET " + stringBuffer;
            System.out.println(sql);
            preparedStatement = connection.prepareStatement(sql);

            for (int i = 0; i < declaredFields.length; i++) {
                Field declaredField = declaredFields[i];
                declaredField.setAccessible(true);
                preparedStatement.setObject(i + 1, declaredField.get(t));
            }

            preparedStatement.executeUpdate();
        } catch (IllegalAccessException | NoSuchFieldException | SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(null, preparedStatement, connection);
        }
    }

    /**
     * 查一个
     *
     * @param id 主键id
     * @return 查出来的对象
     */
    @Override
    public T find(Long id) {
        Connection connection = instance.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        final String sql = "SELECT * FROM " + simpleName + " WHERE id=?";
        System.out.println(sql);
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            resultSet = preparedStatement.executeQuery();
            Object[] objects = new Object[declaredFields.length];
            T t = null;
            while (resultSet.next()) {
                constructor.setAccessible(true);
                t = constructor.newInstance();
                for (int i = 0; i < declaredFields.length; i++) {
//                    System.out.println(declaredFields[i].getName() + "---" + declaredFields[i].getType());
                    objects[i] = (resultSet.getObject(declaredFields[i].getName(), declaredFields[i].getType()));
                    declaredFields[i].setAccessible(true);
                    declaredFields[i].set(t, objects[i]);
                }
                break;
            }
            return t;
        } catch (SQLException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        } finally {
            instance.close(resultSet, preparedStatement, connection);
        }
        return null;
    }

    /**
     * 查所有的对象
     *
     * @return 所有的对象
     */
    @Override
    public ArrayList<T> findAll() {
        Connection connection = instance.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        final String sql = "SELECT id FROM " + simpleName;
        System.out.println(sql);
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            ArrayList<T> arrayList = new ArrayList<>();
            while (resultSet.next()) {
                arrayList.add(find(resultSet.getLong("id")));
            }
            return arrayList;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(resultSet, preparedStatement, connection);
        }
        return null;
    }

    /**
     * 創建表
     */
    @Override
    public abstract void createTable();

    /**
     * 删除表
     */
    @Override
    public void dropTable() {
        //        获取连接对象，并获取PreparedStatement
        Connection connection = instance.getConnection();
        PreparedStatement preparedStatement = null;
//        标准查询语句
        final String sql = "DROP TABLE " + simpleName;
        System.out.println(sql);
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(null, preparedStatement, connection);
        }
    }
}
