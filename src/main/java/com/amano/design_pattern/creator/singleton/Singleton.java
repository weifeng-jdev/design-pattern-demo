package com.amano.design_pattern.creator.singleton;

import lombok.SneakyThrows;
import lombok.ToString;

import java.util.Objects;

/**
 * @className: Singleton
 * @package com.amano.design_pattern.creator.singleton
 * @description: 基本的单例模式实现，存在线程安全问题
 * @author: amano
 * @date: 2023/4/5
 **/
public class Singleton {
    private static Singleton instance;

    private String field;

    @SneakyThrows
    private Singleton(String field) {
        Thread.sleep(1000);
        this.field = field;
    }


    public static Singleton getInstance(String field) {
        if (Objects.isNull(instance)) {
            instance = new Singleton(field);
        }
        return instance;
    }
}
