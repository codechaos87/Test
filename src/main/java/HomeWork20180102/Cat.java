/**
 * Project Name:dt59homework
 * File Name:Cat.java
 * Package Name:HomeWork20180102
 * Date:2018年1月2日下午5:38:20
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package HomeWork20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:38:20 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class Cat extends Pet {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("跳 3米");
    }

    public void zhua() {
        System.out.println("抓老鼠");
    }
}
