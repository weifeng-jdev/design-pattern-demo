package com.amano.design_pattern.structural.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @className: Application
 * @package com.amano.design_pattern.structural.adapter
 * @description: 测试类
 * @author: amano
 * @date: 2023/4/5
 **/
@Slf4j
public class Application {
    public static void main(String[] args) {
        // 创建方钉
        SquarePeg squarePeg = new SquarePeg(10);
        // 创建圆孔
        RoundHole roundHole = new RoundHole(11);
        // 创建适配器
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        boolean fits = roundHole.fits(squarePegAdapter);
        log.info("is fits:{}", fits);
    }
}
