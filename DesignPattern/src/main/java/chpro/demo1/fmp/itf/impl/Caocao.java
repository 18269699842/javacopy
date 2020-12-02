package chpro.demo1.fmp.itf.impl;

import chpro.demo1.fmp.itf.ISwordFactory;
import chpro.demo1.fmp.model.AbstractSword;
import chpro.demo1.fmp.model.object.QixingSword;

/**
 * 曹操具体工厂
 * Created by chenhuan on 16-1-3.
 */
public class Caocao implements ISwordFactory {
    @Override
    public AbstractSword createSword() {
        return new QixingSword();
    }
}
