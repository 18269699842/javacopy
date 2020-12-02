/**
 * Created by chenhuan on 16-4-16.
 */
public class Test {
    public static void main(String[] args) {
        long stepMoney = 100000;
        long result = 100000;
        for(int i=1;i<=15;i++){
            result *= 1.2;
            System.out.println("第"+i+"年-:"+result);
            result+=stepMoney;
        }
    }
}
