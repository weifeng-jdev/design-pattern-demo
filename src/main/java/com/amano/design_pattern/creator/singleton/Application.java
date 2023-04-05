package com.amano.design_pattern.creator.singleton;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;
import java.util.concurrent.*;

/**
 * @className: Application
 * @package com.amano.design_pattern.creator.singleton
 * @description: TODO 类描述
 * @author: amano
 * @date: 2023/4/5
 **/
@Slf4j
public class Application {
    public static void main(String[] args) {
        // 简单单例实现测试
//        Singleton s1 = Singleton.getInstance("singleton");
//        log.info("s1:{}", s1);
//        Singleton s2 = Singleton.getInstance("singleton2");
//        log.info("s1:{}", s1);
//        log.info("s1==s2:{}", Objects.equals(s1, s2));
        // 简单单例线程安全问题测试
        ThreadPoolExecutor threadPoolExecutor1 = new ThreadPoolExecutor(4, 8, 60,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor1.execute(()-> {
                Singleton singleton = Singleton.getInstance("i");
                log.info("singleton:{}", singleton);
            });
        }
        threadPoolExecutor1.shutdown();

        // 多线程单例测试
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(4, 8, 60,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor2.execute(()-> {
                SingletonSynchronized singletonSynchronized = SingletonSynchronized.getInstance("SingletonSynchronized");
                log.info("s1:{}", singletonSynchronized);
            });
        }
        threadPoolExecutor2.shutdown();
    }
}
