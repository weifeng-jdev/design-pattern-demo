package com.amano.design_pattern.structural.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @className: Application
 * @package com.amano.design_pattern.structural.decorator
 * @description: TODO 类描述
 * @author: weifeng
 * @date: 2023/4/6
 **/
@Slf4j
public class Application {
    public static void main(String[] args) {
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(new FileDataSource("test.txt"));
        encryptionDecorator.writeData("123123");
        String s = encryptionDecorator.readData();
        log.info("data:{}", s);
    }
}
