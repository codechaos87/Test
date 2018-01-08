/**
 * Project Name:DT593
 * File Name:ThreadDemo.java
 * Package Name:lesson20180108
 * Date:2018年1月8日上午10:00:18
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package homework20180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:00:18 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class ThreadDemo extends Thread {
    private final static Logger LOG = Logger.getLogger(ThreadDemo.class);

    int as;

    private String vip = " ";

    public void setVip(String vip) {
        this.vip = vip;
    }

    public ThreadDemo(int as) {

        this.as = as;
    }

    @Override
    public void run() {

        LOG.info(vip + "输出第" + as + "次");
    }
}
