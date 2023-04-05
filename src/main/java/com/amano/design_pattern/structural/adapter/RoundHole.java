package com.amano.design_pattern.structural.adapter;

/**
 * @className: RoundHole
 * @package com.amano.design_pattern.structural.adapter
 * @description: 圆孔
 * @author: amano
 * @date: 2023/4/5
 **/
public class RoundHole {
    private Double radius;

    public  RoundHole(double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return roundPeg.getRadius() <= this.radius;
    }
}
