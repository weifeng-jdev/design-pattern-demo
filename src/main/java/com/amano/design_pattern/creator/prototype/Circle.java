package com.amano.design_pattern.creator.prototype;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Objects;

/**
 * @className: Circle
 * @package com.amano.design_pattern.creator.prototype
 * @description: 圆形类
 * @author: amano
 * @date: 2023/4/5
 **/
@ToString
@EqualsAndHashCode(callSuper = true)
@Data
public class Circle extends Shape{
    private int radius;

    public Circle(){}

    public Circle(Circle circle) {
        // 调用父类完成私有属性的复制
        super(circle);
        if (Objects.nonNull(circle)) {
            this.radius = circle.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
