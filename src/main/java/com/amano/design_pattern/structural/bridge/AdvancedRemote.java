package com.amano.design_pattern.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @className: AdvancedRemote
 * @package com.amano.design_pattern.structural.bridge
 * @description: TODO 类描述
 * @author: amano
 * @date: 2023/4/5
 **/
@Slf4j
public class AdvancedRemote extends BaseRemote{
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        log.info("device mute");
        getDevice().setVolume(0);
    }
}
