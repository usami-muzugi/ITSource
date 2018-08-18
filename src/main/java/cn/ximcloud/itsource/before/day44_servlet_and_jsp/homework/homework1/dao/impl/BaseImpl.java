package cn.ximcloud.itsource.before.day44_servlet_and_jsp.homework.homework1.dao.impl;

import cn.ximcloud.itsource.before.day44_servlet_and_jsp.homework.homework1.dao.IBaseDao;
import cn.ximcloud.itsource.before.day44_servlet_and_jsp.homework.homework1.utils.JDBCUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-08-10
 * Time: 23:57
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
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
 * //         佛祖保佑          永无BUG          永不修改             //
 * ////////////////////////////////////////////////////////////////////
 **/
public abstract class BaseImpl<T> implements IBaseDao<T> {
    /**
     * 声明工具类实例
     */
    private static JDBCUtil instance;

    //    初始化实例
    static {
        instance = JDBCUtil.getInstance();
    }

    /**
     * 定义一个class泛型的class
     */
    private Class<T> tClass;

    /**
     * 获取字段
     */
    private Field[] declaredFields;
//    这里HashMap 和TreeMap好像都不太合适....Object的二维数组也好像不太合适
    /**
     * 获取字段的名字
     */
    private String[] fields;
    /**
     * 获取字段的类型
     */
    private Class[] classes;
    /**
     * 获取查询的结果
     */
    private Object[] objects;

    /**
     * 这个方法是真的棒!(๑•̀ㅂ•́)و✧，获得运行时类型
     *
     * @param tClass
     */
    public BaseImpl(Class<T> tClass) {
        this.tClass = tClass;
        declaredFields = tClass.getDeclaredFields();
        fields = new String[declaredFields.length];
        classes = new Class[declaredFields.length];
        objects = new Object[declaredFields.length];
    }

    /**
     * 保存方法，保存一个T
     * 被保存的这个t对象，应该是没有id这个字段的。
     *
     * @param t 一个实例对象
     */
    @Override
    public void save(T t) {
        Connection connection = instance.getConnection();
        PreparedStatement preparedStatement = null;
//        少一个字段的数量,新字段数组
        String[] tempFields = new String[fields.length - 1];
        System.arraycopy(fields, 1, tempFields, 0, fields.length - 1);
        String string = Arrays.toString(tempFields);
        string = string.substring(1, string.length() - 1);

        StringBuffer stringBuffer = new StringBuffer();
        for (String tempField : tempFields) {
            stringBuffer.append("?");
        }

        final String sql = "INSERT INTO " + tClass.getSimpleName() + " (" + string + ") VALUES (" + stringBuffer + ")";
        System.out.println(sql);
//        try {
//            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, user.getName());
//            preparedStatement.setString(2, user.getPassword());
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            instance.close(null, preparedStatement, connection);
//        }
    }

    /**
     * 更新方法，更新该对象
     * 更新是必须要有id这个字段的，用id这个字段来更新
     *
     * @param t 通过传入一个对象来查询并更新
     */
    @Override
    public void update(T t) {

    }

    /**
     * 删除一个对象
     *
     * @param id 通过id主键来查找实例，然后删除该实例
     */
    @Override
    public void delete(Integer id) {
        Connection connection = instance.getConnection();
        PreparedStatement preparedStatement = null;
        final String sql = "DELETE * From " + tClass.getSimpleName() + " WHERE id=?";
        System.out.println(sql);
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(null, preparedStatement, connection);
        }
    }

    /**
     * 查找用户
     *
     * @param id 通过id主键来查找实例
     * @return 返回一个用户实例，如果没有查找到实例，返回null
     */
    @Override
    public T find(Integer id) {
        Connection connection = instance.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        final String sql = "SELECT * FROM " + tClass.getSimpleName() + " WHERE id=?";
        System.out.println(sql);
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            for (int i = 0; i < declaredFields.length; i++) {
                fields[i] = declaredFields[i].getName();
                classes[i] = declaredFields[i].getType();
            }
            while (resultSet.next()) {
                for (int i = 0; i < declaredFields.length; i++) {
                    objects[i] = (resultSet.getObject(fields[i], classes[i]));
                }
                break;
            }
//            反正就是要保证有序，就是那个顺序
            Constructor<T> constructor = tClass.getConstructor(classes);
            constructor.setAccessible(true);
            return constructor.newInstance(objects);
        } catch (SQLException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        } finally {
            instance.close(resultSet, preparedStatement, connection);
        }
        return null;
    }

    /**
     * 查找所有的用户
     *
     * @return 返回一个ArrayList表，表里面存放的是每一个实例
     */
    @Override
    public ArrayList<T> findAll() {
        Connection connection = instance.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        final String sql = "SELECT id FROM " + tClass.getSimpleName();
        System.out.println(sql);
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            ArrayList<T> arrayList = new ArrayList<>();
            while (resultSet.next()) {
                arrayList.add(find(resultSet.getInt("id")));
            }
            return arrayList;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            instance.close(resultSet, preparedStatement, connection);
        }
        return null;
    }
}
