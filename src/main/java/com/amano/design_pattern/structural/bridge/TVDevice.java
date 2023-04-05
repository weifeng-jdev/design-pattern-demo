package com.amano.design_pattern.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @className: TVDevice
 * @package com.amano.design_pattern.structural.bridge
 * @description: 具体的设备实现
 * @author: amano
 * @date: 2023/4/5
 **/
@Slf4j
public class TVDevice implements Device{
    private boolean on = false;
    private Integer volume = 20;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        if (!on) {
            on = true;
        }
    }

    @Override
    public void disable() {
        if (on) {
            on = false;
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent >= 100) {
            this.volume = 100;
            return;
        }
        if (percent <= 0) {
            this.volume = 0;
            return;
        }
        this.volume = percent;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        log.info("------------------------------------");
        log.info("| I'm TV set.");
        log.info("| I'm " + (on ? "enabled" : "disabled"));
        log.info("| Current volume is " + volume + "%");
        log.info("| Current channel is " + channel);
        log.info("------------------------------------");
    }
}
