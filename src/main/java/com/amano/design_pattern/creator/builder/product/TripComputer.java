package com.amano.design_pattern.creator.builder.product;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @className: TripComputer
 * @package com.amano.design_pattern.creator.builder
 * @description: TODO 类描述
 * @author: amano
 * @date: 2023/4/5
 **/
@Slf4j
@Data
@ToString
public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            log.info("Car is started");
        } else {
            log.info("Car isn't started");
        }
    }
}
