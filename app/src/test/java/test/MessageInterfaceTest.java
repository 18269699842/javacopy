package test;

import com.liwo.app.util.HttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andy.Q on 2015/9/20.
 */
public class MessageInterfaceTest {

    private static Map<String, String> param = new HashMap<String, String>();

    static {
        param.put("account", "002004");
        param.put("pswd", "Sd123456789");
    }

    public static void main(String[] args) {
        sendMessage();
    }

    public static void sendMessage() {
        String url = "http://120.26.69.248/msg/HttpSendSM";
        param.put("mobile", "18501687134");
        param.put("msg", "您好，您的验证码是8888 如不是本人操作无需理会<示远科技>");
        param.put("needstatus", "true");

        String result = HttpUtil.executePost(url, param);
        System.out.println(">>>>>>>" + result + "<<<<<<<");
    }

    public static void queryBalance() {
        String url = "http://120.26.69.248/msg/QueryBalance";

        String result = HttpUtil.executePost(url, param);

        System.out.println(">>>>>>>" + result + "<<<<<<<");
    }
}
