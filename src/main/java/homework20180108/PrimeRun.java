/**
 * Project Name:DT593
 * File Name:PrimeRun.java
 * Package Name:lesson20180108
 * Date:2018年1月8日上午10:36:10
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package homework20180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:36:10 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class PrimeRun implements Runnable {
    private final static Logger LOG = Logger.getLogger(PrimeRun.class);

    public int run;

    private String vip = "";

    public void setVip(String vip) {
        this.vip = vip;
    }

    public PrimeRun(int run) {

        this.run = run;
    }

    @Override
    public void run() {
        LOG.info(vip + "输出第" + run + "次");
    }
}
