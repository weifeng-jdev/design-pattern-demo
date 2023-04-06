package com.amano.design_pattern.structural.decorator;

import lombok.AllArgsConstructor;

/**
 * @className: DataSourceDecorator
 * @package com.amano.design_pattern.structural.decorator
 * @description: TODO 类描述
 * @author: weifeng
 * @date: 2023/4/6
 **/
@AllArgsConstructor
public class DataSourceDecorator implements Decorator{
    private Decorator dataSource;

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
