/**
 * Project Name:dt59homework
 * File Name:Dog.java
 * Package Name:HomeWork20180102
 * Date:2018年1月2日下午5:34:41
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package HomeWork20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:34:41 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class Dog extends Pet {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("跳 2米");
    }

    public void jiao() {
        System.out.println("汪汪叫");
    }
}
