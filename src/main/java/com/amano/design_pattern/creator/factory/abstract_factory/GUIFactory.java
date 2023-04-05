package com.amano.design_pattern.creator.factory.abstract_factory;

import com.amano.design_pattern.creator.factory.abstract_factory.product.Button;
import com.amano.design_pattern.creator.factory.abstract_factory.product.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
