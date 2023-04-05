package com.amano.design_pattern.creator.builder;

import com.amano.design_pattern.creator.builder.product.Car;
import com.amano.design_pattern.creator.builder.product.CarManual;
import lombok.extern.slf4j.Slf4j;

/**
 * @className: Application
 * @package com.amano.design_pattern.creator.builder
 * @description: TODO 类描述
 * @author: amano
 * @date: 2023/4/5
 **/
@Slf4j
public class Application {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSUV(carBuilder);
        Car car = carBuilder.build();
        log.info("car:{}", car.toString());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        CarManual carManual = carManualBuilder.build();
        log.info("carManual:{}", carManual.toString());
    }
}
