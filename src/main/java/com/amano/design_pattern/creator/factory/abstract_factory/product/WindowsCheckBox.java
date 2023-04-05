package com.amano.design_pattern.creator.factory.abstract_factory.product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WindowsCheckBox implements CheckBox{
    @Override
    public void paint() {
        log.info("Windows CheckBox hava created");
    }
}
