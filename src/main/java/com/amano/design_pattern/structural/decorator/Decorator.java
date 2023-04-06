package com.amano.design_pattern.structural.decorator;

/**
 * @className: Decorator
 * @package com.amano.design_pattern.structural.decorator
 * @description: TODO 类描述
 * @author: weifeng
 * @date: 2023/4/6
 **/
public interface Decorator {
    void writeData(String data);

    String readData();
}
