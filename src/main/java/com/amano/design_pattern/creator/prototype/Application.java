package com.amano.design_pattern.creator.prototype;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @className: Application
 * @package com.amano.design_pattern.creator.prototype
 * @description: TODO 类描述
 * @author: amano
 * @date: 2023/4/5
 **/
@Slf4j
public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setY(1);
        circle.setY(10);
        circle.setRadius(5);
        log.info("c1:{}", circle);
        Shape c2 = circle.clone();
        log.info("c2:{}", c2);
        log.info("c1==c2:{}", Objects.equals(circle, c2));
    }
}
