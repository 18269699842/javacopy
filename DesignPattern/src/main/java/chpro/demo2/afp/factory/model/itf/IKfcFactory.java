package chpro.demo2.afp.factory.model.itf;

import chpro.demo2.afp.factory.model.Beverage;
import chpro.demo2.afp.factory.model.ChickenWings;
import chpro.demo2.afp.factory.model.FrenchFries;
import chpro.demo2.afp.factory.model.Hamburg;

/**
 * Created by chenhuan on 16-1-3.
 */
public interface IKfcFactory {
    //生产汉堡
    public Hamburg createHamburg(int num);

    //生产著条
    public FrenchFries createFrenchFries(int num);

    //生产鸡翅
    public ChickenWings createChickenWings(int num);

    //生产饮料
    public Beverage createBeverage(int num);
}
