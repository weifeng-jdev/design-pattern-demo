package com.amano.design_pattern.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @className: Square
 * @package com.amano.design_pattern.structural.composite
 * @description: 矩形
 * @author: weifeng
 * @date: 2023/4/6
 **/
@Data
@AllArgsConstructor
public class Rectangle implements Shape{
    private double length;
    private double width;

    @Override
    public double getArea() {
        return length * width;
    }
}
