package com.imooc.utils;

import java.util.Random;

/**
 * Created by sunzhenzhou on 2017/10/26.
 */
public class KeyUtil  {

    /**
     * 生成唯一的主键
     * 格式：时间 + 随机数
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        // 6位随机数
        Integer number  = random.nextInt(9000000) + 1000000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
