package com.amano.design_pattern.creator.singleton;

/**
 * @className: SingletonStaticInitialization
 * @package com.amano.design_pattern.creator.singleton
 * @description: 静态初始化的单例模式
 * @author: amano
 * @date: 2023/4/5
 **/
public class SingletonStaticInitialization {
    private static SingletonStaticInitialization instance;

    private SingletonStaticInitialization() {
    }

    static {
        try {
            instance = new SingletonStaticInitialization();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SingletonStaticInitialization getInstance() {
        return instance;
    }
}
