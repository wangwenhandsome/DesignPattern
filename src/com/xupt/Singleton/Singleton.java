package com.xupt.Singleton;

/**
 * @Author: 王文
 * @Date: 2020/8/5 19:43
 * @Version: 1.0
 * @Description:
 */

public class Singleton {
    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }
}

