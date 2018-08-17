package cn.ximcloud.itsource.day1_day47.day47_login_ordersale.homework.homework1.cart;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-16
 * Time: 09:48
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day47_login_ordersale.homework.homework1.cart
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

public class Cart {
    /**
     * 为什么选择HashMap
     * HashMap 查询是二分查找，而不是遍历，时间复杂度o(log N)
     * 并且是键值对，且Key唯一。和购物车商品唯一一致
     */
    private Map<Long, Item> itemMap;

    public Cart() {
        itemMap = new HashMap<>();
    }

    public void addItem(Item item) {
        if (itemMap.containsKey(item.getId())) {
//            有了
            Item tempItem = itemMap.get(item.getId());
            tempItem.setNum(tempItem.getNum() + item.getNum());
            itemMap.put(tempItem.getId(), tempItem);
        } else {
//            没有
            itemMap.put(item.getId(), item);
        }
    }

    public void removeItem(Long id) {
        itemMap.remove(id);
    }

    public Map<Long, Item> getItemMap() {
        return itemMap;
    }

    public void setItemMap(Map<Long, Item> itemMap) {
        this.itemMap = itemMap;
    }

    /**
     * Items属性，Map没有实现迭代接口，所以不能迭代，于是有了这一个属性
     * @return  所有的item的一个集合，实现了迭代的。也就是可以使用foreach或者是迭代器
     */
    public Collection<Item> getItems() {
        return itemMap.values();
    }
}
