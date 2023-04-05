package com.amano.design_pattern.structural.bridge;

/**
 * @className: Driver
 * @package com.amano.design_pattern.structural.bridge
 * @description: 设备底层接口
 * @author: amano
 * @date: 2023/4/5
 **/
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
