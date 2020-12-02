import java.text.DecimalFormat;

/**
 * Created by chenhuan on 15-11-1.
 */
public class Test {
    public static void main(String[] args) {
        DecimalFormat    df   = new DecimalFormat("######0.00");
        double a = 100000;      //每年存的钱
        for(int i=1;i<=20;i++){     //一共多少钱
            a=a*1.15+100000;
            System.out.println("第"+i+"年:"+df.format(a));
        }
    }
}
