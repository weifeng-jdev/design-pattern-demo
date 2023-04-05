package com.amano.design_pattern.creator.factory.abstract_factory;

import com.amano.design_pattern.creator.factory.abstract_factory.product.Button;
import com.amano.design_pattern.creator.factory.abstract_factory.product.CheckBox;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
