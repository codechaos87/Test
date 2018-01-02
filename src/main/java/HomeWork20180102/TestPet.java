/**
 * Project Name:dt59homework
 * File Name:TestPet.java
 * Package Name:HomeWork20180102
 * Date:2018年1月2日下午5:39:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package HomeWork20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:39:19 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class TestPet {

    public static void main(String[] args) {
        Pet p = new Dog();
        p.eat();
        Pet p1 = new Cat();
        p1.eat();
        TestPet1 p2 = new TestPet1();
        p2.boss(new Dog());
        p2.boss(new Cat());
    }

}
