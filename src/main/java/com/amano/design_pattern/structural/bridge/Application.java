package com.amano.design_pattern.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @className: Application
 * @package com.amano.design_pattern.structural.bridge
 * @description: TODO 类描述
 * @author: amano
 * @date: 2023/4/5
 **/
@Slf4j
public class Application {
    public static void main(String[] args) {
        TVDevice tvDevice = new TVDevice();
        BaseRemote baseRemote = new BaseRemote(tvDevice);
        baseRemote.power();
        tvDevice.printStatus();
        AdvancedRemote advancedRemote = new AdvancedRemote(tvDevice);
        advancedRemote.mute();
        tvDevice.printStatus();
    }
}
