package com.amano.design_pattern.creator.builder;

import com.amano.design_pattern.creator.builder.product.*;

/**
 * @className: CarBuilder
 * @package com.amano.design_pattern.creator.builder
 * @description: 车辆产品生成器
 * @author: amano
 * @date: 2023/4/5
 **/
public class CarBuilder implements Builder{
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car build() {
        return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
