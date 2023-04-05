package com.amano.design_pattern.creator.factory.abstract_factory.product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MacOSCheckBox implements CheckBox{
    @Override
    public void paint() {
        log.info("MacOS CheckBox hava created");
    }
}
