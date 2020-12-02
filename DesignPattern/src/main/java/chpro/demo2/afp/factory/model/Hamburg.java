package chpro.demo2.afp.factory.model;

import chpro.demo1.fmp.model.AbstractSword;

/**
 * 汉堡基类
 * Created by chenhuan on 16-1-3.
 */
public abstract class Hamburg extends AbstractBaseFood implements IFood {
    @Override
    public void printMesage() {
        System.out.println("--"+this.kind+"风味汉堡,\t单价:"+this.price+"\t数量:"+this.num+",\t合计:"+this.totalPrice());
    }
}
