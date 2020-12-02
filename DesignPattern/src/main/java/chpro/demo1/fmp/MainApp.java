package chpro.demo1.fmp;

import chpro.demo1.fmp.itf.ISwordFactory;
import chpro.demo1.fmp.itf.impl.Caocao;
import chpro.demo1.fmp.itf.impl.Caocao2;
import chpro.demo1.fmp.model.AbstractSword;

/**
 * 入口程序
 * Created by chenhuan on 16-1-3.
 */
public class MainApp {
    public static void main(String[] args){
        //创建操作对象实例
        //ISwordFactory swordFactory = new Caocao();
        ISwordFactory swordFactory = new Caocao2();
        //获取宝刀实例
        AbstractSword sword = swordFactory.createSword();
        System.out.println(sword.getName());
    }
}
