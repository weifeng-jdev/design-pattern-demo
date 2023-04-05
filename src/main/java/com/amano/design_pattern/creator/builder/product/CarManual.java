package com.amano.design_pattern.creator.builder.product;

import lombok.Data;
import lombok.ToString;

/**
 * @className: CarManual
 * @package com.amano.design_pattern.creator.builder
 * @description: 车辆使用手册
 * @author: amano
 * @date: 2023/4/5
 **/
@Data
@ToString
public class CarManual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public CarManual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
                     GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }
}
