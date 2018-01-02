/**
 * Project Name:dt59homework
 * File Name:TestPet1.java
 * Package Name:HomeWork20180102
 * Date:2018年1月2日下午6:03:31
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package HomeWork20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午6:03:31 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class TestPet1 {

    public void boss(Pet a) {
        if (a instanceof Dog) {
            Dog b = (Dog) a;
            b.eat();
        }
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.eat();
        }
    }

}
