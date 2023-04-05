package com.amano.design_pattern.creator.prototype;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Objects;

/**
 * @className: Shape
 * @package com.amano.design_pattern.creator.prototype
 * @description: 形状的抽象上层父类
 * @author: amano
 * @date: 2023/4/5
 **/
@ToString
@Data
public abstract class Shape {
    private int x;
    private int y;

    public Shape(){}

    public Shape(Shape shape) {
        if (Objects.nonNull(shape)) {
            this.x = shape.x;
            this.y = shape.y;
        }
    }

    public abstract Shape clone();
}
