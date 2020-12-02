package chpro.demo2.afp.factory.model;

/**
 * 鸡翅基类
 * Created by chenhuan on 16-1-3.
 */
public abstract class ChickenWings extends AbstractBaseFood implements IFood {
    @Override
    public void printMesage() {
        System.out.println("--"+this.kind+"风味鸡翅,\t单价:"+this.price+"\t数量:"+this.num+",\t合计:"+this.totalPrice());
    }
}
