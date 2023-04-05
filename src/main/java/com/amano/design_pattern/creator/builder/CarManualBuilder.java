package com.amano.design_pattern.creator.builder;

import com.amano.design_pattern.creator.builder.product.*;

/**
 * @className: CarManualBuilder
 * @package com.amano.design_pattern.creator.builder
 * @description: 车辆使用手册生产器
 * @author: amano
 * @date: 2023/4/5
 **/
public class CarManualBuilder implements Builder{
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

    public CarManual build() {
        return new CarManual(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
