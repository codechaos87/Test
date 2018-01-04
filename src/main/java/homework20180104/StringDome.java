package homework20180104;

import org.apache.log4j.Logger;

/**
 * Project Name:dt59homework.guojin
 * File Name:homework20180104.java
 * Package Name:
 * Date:2018年1月4日下午2:03:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:03:48 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class StringDome {
    private final static Logger LOG = Logger.getLogger(StringDome.class);

    public static void main(String[] args) {

        String str = new String();
        str = "  郭进    ";
        LOG.info(str);
        // 1.length()方法返回的String的字符长度，2个字就是2,3个字就是3
        // 空格也算长度；
        int len = str.length();
        String str1 = new String();
        str1 = "高税负";
        int len1 = str1.length();
        LOG.info("len的长度为" + len + "\nlen1的长度为" + len1);
        if (str.equals("  郭进    ")) {// 2. equals方法是判断2个字符串是否相等，如果相等就为true;
            LOG.info("我是" + str1);
        }
        int i = str.hashCode();
        LOG.info(i); // 3. hashCode方法2个字 返回的是1186958，完全不懂什么意思。
        int i1 = str1.hashCode();
        LOG.info(i1);// 3个字换回的是39098793。
        String str2 = str.trim();
        LOG.info(str2);// 4. trim方法 返回字符串的副本，忽略前导空白和尾部空白。
        String str3 = str.toString();
        LOG.info(str3);// 5. toString 方法是返回此对象的本身，我理解就是返回最初赋值；
    }
}
