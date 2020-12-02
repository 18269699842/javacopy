package chpro.demo2.afp.factory.model.kfc;

import chpro.demo2.afp.factory.model.Beverage;

/**
 * 炊料实现类
 * Created by chenhuan on 16-1-3.
 */
public class ChinaBeverage extends Beverage {
    public ChinaBeverage(int num) {
        this.kind = "可乐";
        this.price = 7.0f;
        this.num = num;
    }
}
