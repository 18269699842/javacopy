package chpro.demo2.afp.factory.model.kfc;

import chpro.demo2.afp.factory.model.ChickenWings;

/**
 * 奥尔良烤鸡翅
 * Created by chenhuan on 16-1-3.
 */
public class ChinaChickenWings extends ChickenWings {
    public ChinaChickenWings(int num) {
        this.kind = "奥尔良";
        this.price = 2.5f;
        this.num = num;
    }
}
