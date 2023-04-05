package com.amano.design_pattern.creator.factory.abstract_factory.product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WindowsButton implements Button{
    @Override
    public void paint() {
        log.info("Windows button have created");
    }
}
