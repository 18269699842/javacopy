package chpro.demo2.afp.factory.model.kfc;

import chpro.demo2.afp.factory.model.FrenchFries;

/**
 * 著条
 * Created by chenhuan on 16-1-3.
 */
public class ChinaFrenchFries extends FrenchFries {
    public ChinaFrenchFries(int num) {
        this.kind = "普通";
        this.price = 8.0f;
        this.num = num;
    }
}
