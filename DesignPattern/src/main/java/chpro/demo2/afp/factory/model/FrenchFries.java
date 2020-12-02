package chpro.demo2.afp.factory.model;

/**
 * 薯条基类
 * Created by chenhuan on 16-1-3.
 */
public abstract class FrenchFries extends AbstractBaseFood implements IFood {
    @Override
    public void printMesage() {
        System.out.println("--"+this.kind+"风味著条,\t单价:"+this.price+"\t数量:"+this.num+",\t合计:"+this.totalPrice());
    }
}
