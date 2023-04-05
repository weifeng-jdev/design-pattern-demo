package com.amano.design_pattern.structural.adapter;

import lombok.Data;

/**
 * @className: SquarePeg
 * @package com.amano.design_pattern.structural.adapter
 * @description: 方钉
 * @author: amano
 * @date: 2023/4/5
 **/
@Data
public class SquarePeg {
    private Double width;

    public SquarePeg(double width) {
        this.width = width;
    }
}
