package test;

import com.liwo.app.util.HttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenhuan on 15-9-20.
 */
public class HttpUtilTest {
        public static void main(String[] args){
            String url = "http://bbs.tianya.cn/post-develop-1545925-1.shtml";
            Map<String,String> param = new HashMap<String,String>();
            //param.put("accountId","15000367804");
            String result = HttpUtil.executePost(url,param);
            System.out.println(result);
        }
}
