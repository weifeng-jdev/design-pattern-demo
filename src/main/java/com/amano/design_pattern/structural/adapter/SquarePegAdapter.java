package com.amano.design_pattern.structural.adapter;

/**
 * @className: SquarePegAdapter
 * @package com.amano.design_pattern.structural.adapter
 * @description: 适配器
 * @author: amano
 * @date: 2023/4/5
 **/
public class SquarePegAdapter extends RoundPeg{
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public Double getRadius() {
        return (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
    }
}
