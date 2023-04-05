package com.amano.design_pattern.creator.factory.abstract_factory;

import com.amano.design_pattern.creator.factory.abstract_factory.product.Button;
import com.amano.design_pattern.creator.factory.abstract_factory.product.CheckBox;
import com.amano.design_pattern.creator.factory.abstract_factory.product.MacOSButton;
import com.amano.design_pattern.creator.factory.abstract_factory.product.WindowsCheckBox;

public class MacOSGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
