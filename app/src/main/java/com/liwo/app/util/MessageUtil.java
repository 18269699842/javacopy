package com.liwo.app.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * 短信辅助类
 * Created by Andy.Q on 2015/9/20.
 */
public class MessageUtil {

    private static Logger log = LoggerFactory.getLogger(MessageUtil.class);

    private static String URL = "http://120.26.69.248/msg/HttpSendSM";

    /**
     * 发送短信验证码
     * @param receiver 接收者
     * @return 返回验证码
     */
    public static String sendValidCode(String receiver) {
        int random = new Random().nextInt(9999);
        String code = String.format("%04d", random);

        Map<String , String> param = new HashMap<String, String>();
        param.put("account", "002004");
        param.put("pswd", "Sd123456789");
        param.put("mobile", receiver);
        param.put("msg", "您好，您的验证码是" + code +" 如不是本人操作无需理会<示远科技>");
        param.put("needstatus", "true");

        String result = HttpUtil.executePost(URL, param);

        //此处处理成功或失败
        result = result.replace("\n", ",");
        String[] resultSet = result.split(",");
        if("0".equals(resultSet[1])) {
            log.debug("请求短信接口成功，验证码是", code);
        }else{
            log.error("请求短信接口失败", result);
        }

        return code;
    }

    public static void main(String[] args) {
        String str = "20150918212922,0\n" +
                "1000918212922671200";
        System.out.println("替换前："+str);
        str = str.replace("\n", ",");
        System.out.println("替换后："+str);
    }
}
