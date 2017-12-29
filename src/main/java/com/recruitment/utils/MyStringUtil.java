package com.recruitment.utils;

/**
 * @author xiaoxinliao
 * @date 2017/12/29 18:13
 */
public class MyStringUtil {
    /**
     * 判读是否为null or 空串
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (str == null || "".equals(str.trim())) {
            return true;
        }
        return false;
    }
}
