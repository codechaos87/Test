/**
 * Project Name:dt59homework.guojin
 * File Name:ListDome.java
 * Package Name:homework20180104
 * Date:2018年1月4日下午2:32:03
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package homework20180104;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:32:03 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class ListDome {
    private final static Logger LOG = Logger.getLogger(ListDome.class);

    public static void main(String[] args) {

        List lis = new ArrayList();
        // add,给数组添加数据；
        lis.add("郭进");
        lis.add(120);
        lis.add(175);
        LOG.info(lis);
        // add(int index, E element) 将指定的元素插入此列表中的指定位置。
        lis.add(0, "姓名");
        LOG.info(lis);
        // addAll按照指定 collection 的迭代器所返回的元素顺序，将该 collection 中的所有元素添加到此列表的尾部。
        // 这个不是蛮懂，形参里不知道应该填什么，填了变量lis后输出了2遍，不是很能理解
        // lis.addAll(lis);
        // LOG.info(lis);
        for (int i = 0; i < lis.size(); i++) {
            LOG.info(lis.get(i));// 遍历数组
        }
        // set 方法，修改指定脚标的元素；
        lis.set(0, "郭进大帅比");
        LOG.info(lis);
        lis.remove(2);
        LOG.info(lis);
        // remove 移除此列表中指定位置上的元素。
        // 没找到查询方法
    }
}
