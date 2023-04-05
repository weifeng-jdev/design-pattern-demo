package com.amano.design_pattern.structural.bridge;

/**
 * @className: Remote
 * @package com.amano.design_pattern.structural.bridge
 * @description: 桥接控制器接口
 * @author: amano
 * @date: 2023/4/5
 **/
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
