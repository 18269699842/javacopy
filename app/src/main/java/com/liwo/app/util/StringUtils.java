package com.liwo.app.util;

/**
 * Created by chenhuan on 15-10-6.
 */
public class StringUtils {
    /**
     * 校验是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(Object str) {
        return (str == null || "".equals(str));
    }
}
