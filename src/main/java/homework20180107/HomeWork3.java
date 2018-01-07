/**
 * Project Name:dt59homework.guojin
 * File Name:HomeWork3.java
 * Package Name:homework20180107
 * Date:2018年1月7日下午1:36:03
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package homework20180107;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午1:36:03 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class HomeWork3 {
    private final static Logger LOG = Logger.getLogger(HomeWork3.class);

    public static void main(String[] args) {
        Date date = new Date();
        // LOG.info(date);
        DateFormat date1 = new SimpleDateFormat("yyyy年MM月dd'T'HH点mm分ss.SSSZ");
        LOG.info(date1.format(date));

        long l = System.currentTimeMillis();
        Date date2 = new Date(l);
        LOG.info(date1.format(date2));
        int a = date.compareTo(date2);
        LOG.info(a);
        boolean after = date.after(date2);
        LOG.info(after);
        boolean before = date.before(date2);
        LOG.info(before);
        long lo = date.getTime();
        LOG.info(lo);
        String str = date.toString();
        LOG.info(str);
    }
}
