/**
 * Project Name:dt59homework.guojin
 * File Name:HomeWork1.java
 * Package Name:homework20180107
 * Date:2018年1月7日下午12:09:21
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package homework20180107;

import java.io.File;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午12:09:21 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class HomeWork1 {
    private final static Logger LOG = Logger.getLogger(HomeWork1.class);

    public static void main(String[] args) {
        File file1 = new File("E:\\mywork\\59班第一阶段考试");
        File file2 = new File("E:\\mywork\\java基础试卷");
        File file = new File("E:\\mywork");

        File[] by = file.listFiles();
        File[] by1 = file1.listFiles();
        File[] by2 = file2.listFiles();
        for (File files : by) {
            LOG.info(files);
        }
        for (File file3 : by1) {
            LOG.info(file3);
        }
        for (File file4 : by2) {
            LOG.info(file4);
        }

    }
}
