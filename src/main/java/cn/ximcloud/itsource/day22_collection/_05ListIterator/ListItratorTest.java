package cn.ximcloud.itsource.day22_collection._05ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-08
 * Time: 14:11
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class ListItratorTest {
    public static void main(String[] args) {
        /*
         *  集合
         *  public class ArrayList<E> extends AbstractList<E>
         *  public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {
         *  public abstract class AbstractCollection<E> implements Collection<E> {
         *  public interface List<E> extends Collection<E> {
         *  public interface Collection<E> extends Iterable<E> {
         */

        ArrayList list = new ArrayList();
        list.add(2013);
        list.add("基于数组的集合");
        list.add(true);
        list.add('I');
        list.add('T');
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n----------------");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }


    }
}
