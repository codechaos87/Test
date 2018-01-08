/**
 * Project Name:DT593
 * File Name:TestThread.java
 * Package Name:lesson20180108
 * Date:2018年1月8日上午10:16:29
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package homework20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:16:29 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class TestThread {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            ThreadDemo thread = new ThreadDemo(i);
            thread.start();

            if (i > 7) {
                thread.setVip("最大优先级");
                thread.setPriority(thread.MAX_PRIORITY);
            }
            if (i < 2) {
                thread.setVip("最小优先级");
                thread.setPriority(thread.MIN_PRIORITY);
            }
        }
    }

}
