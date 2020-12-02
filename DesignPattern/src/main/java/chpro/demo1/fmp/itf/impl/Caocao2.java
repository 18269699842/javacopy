package chpro.demo1.fmp.itf.impl;

import chpro.demo1.fmp.itf.ISwordFactory;
import chpro.demo1.fmp.model.AbstractSword;
import chpro.demo1.fmp.model.object.BaxingSword;

/**
 * Created by chenhuan on 16-1-3.
 */
public class Caocao2 implements ISwordFactory {
    @Override
    public AbstractSword createSword() {
        return new BaxingSword();
    }
}
