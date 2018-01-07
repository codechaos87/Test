/**
 * Project Name:dt59homework.guojin
 * File Name:homework2.java
 * Package Name:homework20180107
 * Date:2018年1月7日下午12:35:41
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package homework20180107;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午12:35:41 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class HomeWork2 {
    private final static Logger LOG = Logger.getLogger(HomeWork2.class);

    public static void main(String[] args) {
        File file = new File("E:\\mywork\\test1.java");
        File file1 = new File("E:\\mywork\\test5.txt");
        FileInputStream put = null;
        FileOutputStream out = null;

        try {
            put = new FileInputStream(file); // 必须要有输入流导入程序才能在程序中输出
            byte[] by = new byte[1024]; // 不知道是不是这样理解？
            int len = put.read(by);
            out = new FileOutputStream(file1);
            while (len != -1) {
                out.write(by, 0, len); // 写入文本字节，从0到字节长度
                // String str = new String(by, 0, len);
                // LOG.info(str);
                len = put.read(by);// 还是不是很理解

            }
        } catch (FileNotFoundException e) {

            // Auto-generated catch block
            e.printStackTrace();

        } catch (IOException e) {

            // Auto-generated catch block
            e.printStackTrace();

        } finally {
            try {
                put.close();
            } catch (IOException e) {

                // Auto-generated catch block
                e.printStackTrace();

            }
        }
    }
}
