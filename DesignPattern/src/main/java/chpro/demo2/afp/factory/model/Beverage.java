package chpro.demo2.afp.factory.model;

/**
 * Created by chenhuan on 16-1-3.
 */
public abstract class Beverage extends AbstractBaseFood implements IFood {
    @Override
    public void printMesage() {
        System.out.println("--"+this.kind+"饮料,\t单价:"+this.price+"\t数量:"+this.num+",\t合计:"+this.totalPrice());
    }
}
