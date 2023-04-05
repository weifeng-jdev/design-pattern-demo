package com.amano.design_pattern.creator.singleton;

/**
 * @className: BillPughSingleton
 * @package com.amano.design_pattern.creator.singleton
 * @description: 私有内部类的单例模式
 * @author: amano
 * @date: 2023/4/5
 **/
public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class SingletonInstanceHolder {
        private final static BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonInstanceHolder.INSTANCE;
    }
}
