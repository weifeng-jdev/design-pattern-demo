package com.amano.design_pattern.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @className: TVRemote
 * @package com.amano.design_pattern.structural.bridge
 * @description: 具体的桥接控制类
 * @author: amano
 * @date: 2023/4/5
 **/
@Slf4j
public class BaseRemote implements Remote {
    private Device device;

    public BaseRemote(Device device) {
        this.device = device;
    }

    public Device getDevice() {
        return device;
    }

    @Override
    public void power() {
        if (device.isEnabled()) {
            log.info("device power off");
            device.disable();
        } else {
            log.info("device power up");
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        log.info("device volumeDown");
        device.setVolume(device.getVolume() - 1);
    }

    @Override
    public void volumeUp() {
        log.info("device volumeUps");
        device.setVolume(device.getVolume() + 1);
    }

    @Override
    public void channelDown() {
        log.info("device channelDown");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        log.info("device channelUp");
        device.setChannel(device.getChannel() - 1);
    }
}
