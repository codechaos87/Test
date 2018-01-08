/**
 * Project Name:DT593
 * File Name:TestRun.java
 * Package Name:lesson20180108
 * Date:2018年1月8日上午10:37:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package homework20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:37:58 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class TestRun {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            PrimeRun run = new PrimeRun(i);
            // new Thread(run).start();
            Thread t1 = new Thread(run);
            t1.start();
            if (i > 8) {
                run.setVip("haha");
                t1.setPriority(Thread.MAX_PRIORITY);
            }
            if (i < 1) {
                run.setVip("haha");
                t1.setPriority(Thread.MIN_PRIORITY);
            }
        }

    }

}
