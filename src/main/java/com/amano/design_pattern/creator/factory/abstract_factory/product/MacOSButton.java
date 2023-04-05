package com.amano.design_pattern.creator.factory.abstract_factory.product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MacOSButton implements Button{
    @Override
    public void paint() {
        log.info("MacOS button have created");
    }
}
