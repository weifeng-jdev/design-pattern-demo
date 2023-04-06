package com.amano.design_pattern.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @className: Circle
 * @package com.amano.design_pattern.structural.composite
 * @description: 原型
 * @author: weifeng
 * @date: 2023/4/6
 **/
@Data
@AllArgsConstructor
public class Circle implements Shape {
    private double radius;

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
