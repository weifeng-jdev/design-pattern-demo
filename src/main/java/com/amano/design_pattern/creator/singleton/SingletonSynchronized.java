package com.amano.design_pattern.creator.singleton;

import java.util.Objects;

/**
 * @className: SingletonSynchronized
 * @package com.amano.design_pattern.creator.singleton
 * @description: TODO 类描述
 * @author: amano
 * @date: 2023/4/5
 **/
public class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private String field;

    private SingletonSynchronized(String field) {
        this.field = field;
    }

    public static SingletonSynchronized getInstance(String field) {
        if (Objects.nonNull(instance)) {
            return instance;
        }
        synchronized (SingletonSynchronized.class) {
            if (Objects.isNull(instance)) {
                instance = new SingletonSynchronized(field);
            }
            return instance;
        }
    }
}
