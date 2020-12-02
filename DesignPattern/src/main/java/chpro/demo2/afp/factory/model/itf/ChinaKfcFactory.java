package chpro.demo2.afp.factory.model.itf;

import chpro.demo2.afp.factory.model.Beverage;
import chpro.demo2.afp.factory.model.ChickenWings;
import chpro.demo2.afp.factory.model.FrenchFries;
import chpro.demo2.afp.factory.model.Hamburg;
import chpro.demo2.afp.factory.model.kfc.ChinaBeverage;
import chpro.demo2.afp.factory.model.kfc.ChinaChickenWings;
import chpro.demo2.afp.factory.model.kfc.ChinaFrenchFries;
import chpro.demo2.afp.factory.model.kfc.ChinaHanburm;

/**
 * 具体工厂
 * Created by chenhuan on 16-1-3.
 */
public class ChinaKfcFactory implements IKfcFactory {

    @Override
    public Hamburg createHamburg(int num) {
        return new ChinaHanburm(num);
    }

    @Override
    public FrenchFries createFrenchFries(int num) {
        return new ChinaFrenchFries(num);
    }

    @Override
    public ChickenWings createChickenWings(int num) {
        return new ChinaChickenWings(num);
    }

    @Override
    public Beverage createBeverage(int num) {
        return new ChinaBeverage(num);
    }
}
