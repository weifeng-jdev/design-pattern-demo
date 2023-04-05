package com.amano.design_pattern.creator.factory.simple_factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductB implements Product{
    public void doStuff() {
        log.info("productB is stuffing...");
    }
}
