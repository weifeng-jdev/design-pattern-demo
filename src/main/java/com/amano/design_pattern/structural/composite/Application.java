package com.amano.design_pattern.structural.composite;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @className: Application
 * @package com.amano.design_pattern.structural.composite
 * @description: 客户端实例
 * @author: weifeng
 * @date: 2023/4/6
 **/
@Slf4j
public class Application {
    public static void main(String[] args) {
        CompoundShape compoundShape = new CompoundShape(Arrays.asList(
                new Circle(5.0),
                new Rectangle(10, 20)
        ));
        double area = compoundShape.getArea();
        log.info("compoundShape's area is :{}", area);
    }
}
