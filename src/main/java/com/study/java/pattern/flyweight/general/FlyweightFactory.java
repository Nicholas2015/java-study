package com.study.java.pattern.flyweight.general;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class FlyweightFactory {

    private static Map<String,IFlyweight> pool = new HashMap<>();

    public static IFlyweight getFlyweight(String intrinsicState){

        // 因为内部状态具有不变性，因此作为缓存的键
        if (!pool.containsKey(intrinsicState)) {
            IFlyweight flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState,flyweight);
        }
        return pool.get(intrinsicState);
    }
}
