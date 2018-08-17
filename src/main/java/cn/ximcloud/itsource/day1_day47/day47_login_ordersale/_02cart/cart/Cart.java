package cn.ximcloud.itsource.day1_day47.day47_login_ordersale._02cart.cart;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-15
 * Time: 14:07
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day47_login_ordersale._02cart.cart
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
 * 购物车
 * 购物车类
 * 拥有一个商品们的集合的属性
 **/
public class Cart {
    private Map<Long, Item> itemMap;

    public Double getTotalPrice() {
        return 0D;
    }

    public Collection<Item> getEntrySet() {
        return itemMap.values();
    }

    public void remove(Long id) {
        itemMap.remove(id);
    }

    /**
     * @param item
     */
    public void add(Item item) {
        if (itemMap.containsKey(item.getId())) {
//            有了
            item.setItemNum(itemMap.get(item.getId()).getItemNum() + item.getItemNum());
            itemMap.put(item.getId(), item);
        }
        itemMap.put(item.getId(), item);
    }

    public Cart() {
        itemMap = new HashMap<>();
    }

    public Map<Long, Item> getItemMap() {
        return itemMap;
    }

    public void setItemMap(Map<Long, Item> itemMap) {
        this.itemMap = itemMap;
    }
}
