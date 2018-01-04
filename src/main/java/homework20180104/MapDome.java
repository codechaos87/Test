/**
 * Project Name:dt59homework.guojin
 * File Name:MapDome.java
 * Package Name:homework20180104
 * Date:2018年1月4日下午3:07:00
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package homework20180104;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午3:07:00 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class MapDome {
    private final static Logger LOG = Logger.getLogger(MapDome.class);

    public static void main(String[] args) {

        Map map = new HashMap();
        // size
        int a = map.size();
        LOG.info(a);
        map.put("郭进", "高税负");

        LOG.info(map);
        LOG.info(map.get("郭进"));
        map.remove("郭进");
        LOG.info(map);
    }
}
