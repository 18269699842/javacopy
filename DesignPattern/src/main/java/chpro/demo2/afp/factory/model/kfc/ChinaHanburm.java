package chpro.demo2.afp.factory.model.kfc;

import chpro.demo2.afp.factory.model.Hamburg;

/**
 * 中国风味的麻辣鸡腿汉堡
 * Created by chenhuan on 16-1-3.
 */
public class ChinaHanburm extends Hamburg {
    public ChinaHanburm(int num) {
        this.kind = "麻辣";
        this.price = 14.0f;
        this.num = num;
    }
}
