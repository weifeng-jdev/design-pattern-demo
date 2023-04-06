package com.amano.design_pattern.structural.composite;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * @className: CompoundShape
 * @package com.amano.design_pattern.structural.composite
 * @description: 由多种图形组成的复杂图形
 * @author: weifeng
 * @date: 2023/4/6
 **/
@AllArgsConstructor
public class CompoundShape implements Shape {
    List<Shape> children;

    @Override
    public double getArea() {
        return children.stream().map(Shape::getArea).reduce(0.0, Double::sum);
    }
}
