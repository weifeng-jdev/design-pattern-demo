package com.amano.design_pattern.creator.builder.product;

import lombok.Data;
import lombok.ToString;

/**
 * @className: Car
 * @package com.amano.design_pattern.creator.builder
 * @description: 车辆产品
 * @author: amano
 * @date: 2023/4/5
 **/
@Data
@ToString
public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }
}
