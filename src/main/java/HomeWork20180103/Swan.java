/**
 * Project Name:dt59homework.guojin
 * File Name:Swan.java
 * Package Name:HomeWork20180103
 * Date:2018年1月3日下午3:21:18
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package HomeWork20180103;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:21:18 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class Swan implements Run, Swim, Fly {
    private final static Logger LOG = Logger.getLogger(Swan.class);

    @Override
    public void fly() {

        LOG.info("天鹅可以飞翔");

    }

    @Override
    public void swim() {

        LOG.info("天鹅可以游泳");

    }

    @Override
    public void run() {
        LOG.info("天鹅可以在地上跑");

    }

}
