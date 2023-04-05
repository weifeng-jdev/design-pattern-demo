package com.amano.design_pattern.creator.factory.abstract_factory;

import com.amano.design_pattern.creator.factory.abstract_factory.product.*;

public class WindowsGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
