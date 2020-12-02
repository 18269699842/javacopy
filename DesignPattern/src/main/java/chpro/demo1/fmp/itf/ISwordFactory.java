package chpro.demo1.fmp.itf;

import chpro.demo1.fmp.model.AbstractSword;

/**
 * 宝刀工厂
 * Created by chenhuan on 16-1-3.
 */
public interface ISwordFactory {
    /**
     * 生厂各类宝刀
     * @return
     */
    public AbstractSword createSword();
}
